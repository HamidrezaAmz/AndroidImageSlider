[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=17)
[![](https://jitpack.io/v/HamidrezaAmz/AndroidImageSlider.svg)](https://jitpack.io/#HamidrezaAmz/AndroidImageSlider)
[![Open Source Love](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)


# AndroidImageSlider

This Repo is based on [daimajia's](https://github.com/daimajia/AndroidImageSlider) AndroidImageSlider
The old repository has lots of **Dependencies** issues, **AndroidX** support, **NineOldAndroid** problems and was not updated in a while, so I decide to create new repo and fix them.

## Demo
 
![](http://ww3.sinaimg.cn/mw690/610dc034jw1egzor66ojdg20950fknpe.gif)

## Usage
Step 1. Add the JitPack repository to your build file,
Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }
```

Step 2. Add the dependency


#### Gradle

```groovy
dependencies {
    implementation 'com.github.HamidrezaAmz:AndroidImageSlider:v1.0.8'
}
```


### Step 2

Add permissions (if necessary) to your `AndroidManifest.xml`

```xml
<!-- if you want to load images from the internet -->
<uses-permission android:name="android.permission.INTERNET" /> 

<!-- if you want to load images from a file OR from the internet -->
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```

**Note:** If you want to load images from the internet, you need both the `INTERNET` and `READ_EXTERNAL_STORAGE` permissions to allow files from the internet to be cached into local storage.

If you want to load images from drawable, then no additional permissions are necessary.


### Step 3

Add the Slider to your layout:
 
```XML
<com.potyvideo.slider.library.SliderLayout
        android:id="@+id/slider"
        android:layout_width="match_parent"
        android:layout_height="200dp"/>
```        
 
There are some default indicators. If you want to use a provided indicator:
 
```XML
<com.potyvideo.slider.library.Indicators.PagerIndicator
        android:id="@+id/custom_indicator"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:gravity="center"/>
```

Chage out [Code example](https://github.com/HamidrezaAmz/AndroidImageSlider/blob/master/demo/src/main/java/com/potyvideo/slider/demo/MainActivity.java)
 for more.
 
## Advanced usage

Please visit [Wiki](https://github.com/daimajia/AndroidImageSlider/wiki)
 
## Thanks

- [Daimajia](https://github.com/daimajia)
- [Picasso](https://github.com/square/picasso)
