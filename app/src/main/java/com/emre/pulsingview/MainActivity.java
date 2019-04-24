package com.emre.pulsingview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.emre.pulsingviewlibrary.PulsingView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PulsingView pulsingView = findViewById(R.id.pulsingView);

        pulsingView.setColor(Color.parseColor("#4DFFFFFF"));
    }
}