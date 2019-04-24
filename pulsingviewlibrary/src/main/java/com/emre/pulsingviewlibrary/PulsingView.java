package com.emre.pulsingviewlibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class PulsingView extends View {

    private int startingX = 0;
    private int startingY = 0;
    private int delayMillis = 10;
    private boolean layout = false; //Default
    private boolean progressive = false; //Default
    private int startingRadius = 0;
    private int progress;
    private int radius = startingRadius;
    private int maxRadius = 0;
    private int increaseAmount = 5;
    private Paint paint;
    private Runnable runnable;
    private Handler handler;

    public PulsingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public PulsingView(Context context) {
        super(context);
        init();
    }

    private void init(){
        handler = new Handler();

        paint = new Paint();

        //Default values
        setColor(Color.parseColor("#448AFF"));
        setStartingRadius(5);

        runnable = new Runnable() {
            @Override
            public void run() {
                postInvalidate();
                handler.postDelayed(runnable,delayMillis);
            }
        };

        handler.post(runnable);
    }

    public void useItForLayout(boolean layout){
        this.layout = layout;
    }

    public int getStartingX() {
        return startingX;
    }

    public int getStartingY(){
        return startingY;
    }

    public void setStartingX(int startingX) {
        this.startingX = startingX;
    }

    public void setStartingY(int startingY) {
        this.startingY = startingY;
    }

    public void setStartingRadius(int startingRadius){
        this.startingRadius = startingRadius;
    }

    public int getStartingRadius(){
        return startingRadius;
    }

    public void setMaxRadius(int maxRadius){
        this.maxRadius = maxRadius;
    }

    public int getMaxRadius(){
        return maxRadius;
    }

    public int getRadius(){
        return radius;
    }

    public int getColor(){
        return paint.getColor();
    }

    public int getDelayMillis(){
        return delayMillis;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        if (isProgressive()) {
            this.progress = progress;
            this.invalidate();
        }
    }

    public void setColor(int color){
        paint.setColor(color);
    }

    public void setProgressive(boolean progressive) {
        this.progressive = progressive;
    }

    public boolean isProgressive() {
        return progressive;
    }

    public void setIncreaseAmount(int increaseAmount) {
        this.increaseAmount = increaseAmount;
    }

    public int getIncreaseAmount() {
        return increaseAmount;
    }

    public void setDelayMillis(int delayMillis) {
        this.delayMillis = delayMillis;
    }

    public void stopPulsing(){
        handler.removeCallbacks(runnable);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (maxRadius==0){
            setMaxRadius(this.getHeight()/2);
            Log.d("maxHeight", String.valueOf(this.getHeight()));
        }

        if (!progressive) {
            if (radius > maxRadius) {
                if (layout) {
                    stopPulsing();
                } else {
                    radius = startingRadius;
                }
            } else {
                radius += increaseAmount;
            }

            canvas.drawCircle(startingX == 0 ? this.getPivotX() : startingX, startingY==0 ? this.getPivotY() : startingY, radius, paint);
        }else { //progressive
            radius = progress;

            canvas.drawCircle(startingX == 0 ? this.getPivotX() : startingX, startingY==0 ? this.getPivotY() : startingY, radius, paint);
        }
    }
}