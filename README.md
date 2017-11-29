# Viking Vision
Android-based Vision System for the [F.I.R.S.T. Robotics Competition](https://www.firstinspires.org/robotics/frc). Based off of [CheezDroid](https://github.com/Team254/FRC-2017-Public/tree/master/vision_app).

# Contributing

Viking vision is developed with [Android Studio](https://developer.android.com/studio/index.html), an IDE for Android development. To start you will need to install:
- [Git](https://git-scm.com/) for revision control;
- [Android Studio](https://developer.android.com/studio/index.html) for development.

Start by forking this repository. This creates a copy in your own GitHub account.

Next, clone the repostiroy from your account. This can be done via the command line with:
```bash
git clone git@github.com:{username}/VikingVision.git
```
Open the git repository with Android studio, it should automatically detect that it is a project.

Install OpenCV by:
* Download http://sourceforge.net/projects/opencvlibrary/files/opencv-android/3.1.0/OpenCV-3.1.0-android-sdk.zip/download
* Unzip OpenCV-3.1.0-android-sdk.zip (OpenCV-android-sdk)
* Create directory app/src/main/jniLibs
* Copy OpenCV-android-sdk/sdk/native/libs/* to app/src/main/jniLibs/

## To provision a device for robot use
* Enable device admin
1. Settings App > Security > Device Administrators > Click box 'on' for VikingVision

* Enable device owner
1. adb shell
2. dpm set-device-owner org.ljrobotics.vikingvision/.VikingDeviceAdminReceiver

## How to Install ADB on the RoboRIO

Download and run the [install.osx.sh](installation/install.osx.sh) script in the installation folder. Note that this script has only been tested on Mac OS X; it hasn't been tested on Windows or Linux.
