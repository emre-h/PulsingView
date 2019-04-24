package com.emre.pulsingview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.emre.pulsingviewlibrary.PulsingLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        PulsingView pulsingView = findViewById(R.id.pulsingView);

        pulsingView.setColor(Color.parseColor("#4DFFFFFF"));
        pulsingView.setMaxRadius(200);//maximum radius of circle
        pulsingView.setIncreaseAmount(5);//radius increase amount per delay
        pulsingView.setDelayMillis(15);//handler's delay millis. you can set FPS via changing this value
        pulsingView.setStartingRadius(0);//starting radius of circle
        */

        PulsingLayout pulsingLayout = findViewById(R.id.pulsingLayout);

        pulsingLayout.setColor(Color.parseColor("#448AFF"));
        pulsingLayout.setBackgroundColorOfLayout(Color.parseColor("#000000"));

        //pulsingLayout.setProgressive(true);
        //pulsingLayout.setProgress();
    }
}