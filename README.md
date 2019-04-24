# PulsingView
An Android Library

# What does it work

Includes two views:
-PulsingView
-PulsingLayout

PulsingView can be used for indeterminate progresses.

PulsingLayout is based on RelativeLayout and includes pulsing view.
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

	ependencies {
	        implementation 'com.github.metahex:PulsingView:master-SNAPSHOT'
	}

# Preview

![](layout.gif) a
![](pulsing.gif)

