package com.emre.pulsingviewlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

public class PulsingLayout extends RelativeLayout {

    private int progress = 0;
    private boolean progressive = false; //Default
    private PulsingView pulsingView;
    private RelativeLayout relativeLayout;

    public PulsingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.pulsing_layout, this, true);

        relativeLayout = findViewById(R.id.pulsingLayout);
        pulsingView = findViewById(R.id.pulsingViewx);
        pulsingView.useItForLayout(true);
        pulsingView.setMaxRadius(5000);
        pulsingView.setIncreaseAmount(10);
    }

    public void setColor(int color){
        pulsingView.setColor(color);
    }

    public void setProgressive(boolean progressive) {
        this.progressive = progressive;
        pulsingView.setProgressive(progressive);
    }

    public boolean isProgressive() {
        return progressive;
    }

    public void setProgress(int progress) {
        if (isProgressive()) {
            this.progress = progress;
            pulsingView.setProgress(progress);
        }
    }

    public int getProgress() {
        return progress;
    }
}