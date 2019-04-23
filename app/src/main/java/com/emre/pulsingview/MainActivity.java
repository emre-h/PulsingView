package com.emre.pulsingview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        PulsingLayout pulsingView = findViewById(R.id.pulsingView);

        pulsingView.setProgressive(false);

        for (int i=0; i<500; i++){
            pulsingView.setProgress(i);
        }
        */
    }
}