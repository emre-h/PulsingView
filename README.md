# PulsingView
An Android Library

# What can it be used for

Includes two views:
-PulsingView
-PulsingLayout

PulsingView can be used for indeterminate progresses.

PulsingLayout is based on RelativeLayout and includes PulsingView.
PulsingLayout can be used for animated relative layout.


# Implementation

Firstly, add JitPack repo

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Add build.gradle dependency

	dependencies {
	        implementation 'com.github.metahex:PulsingView:-SNAPSHOT'
	}
	
# Usage

## PulsingView

	PulsingView pulsingView = findViewById(R.id.pulsingView);

        pulsingView.setColor(Color.parseColor("#4DFFFFFF"));
        pulsingView.setMaxRadius(200);//maximum radius of circle 
        pulsingView.setIncreaseAmount(5);//radius increase amount per delay
        pulsingView.setDelayMillis(15);//handler's delay millis. you can set FPS via changing this value
        pulsingView.setStartingRadius(0);//starting radius of circle

## PulsingLayout
	
	PulsingLayout pulsingLayout = findViewById(R.id.pulsingLayout);
        
        pulsingLayout.setColor(Color.parseColor("#448AFF"));
        pulsingLayout.setBackgroundColorOfLayout(Color.parseColor("#000000"));
	
	//pulsingLayout.setProgressive(true); 
        //pulsingLayout.setProgress(50); In development stage, do not use it for now 

# Preview

# PulsingLayout

![](layout.gif)

# PulsingView

![](pulsing.gif)

