[![](https://jitpack.io/v/HamidrezaAmz/AndroidImageSlider.svg)](https://jitpack.io/#HamidrezaAmz/AndroidImageSlider)

# AndroidImageSlider

This Repo is based on [daimajia's](https://github.com/daimajia/AndroidImageSlider) AndroidImageSlider
The old repository has lots of **Dependencies** issues, **AndroidX** support, **NineOldAndroid** problems and was not updated in a while, so I decide to create new repo and fix them.

## Demo
 
![](http://ww3.sinaimg.cn/mw690/610dc034jw1egzor66ojdg20950fknpe.gif)

## Usage

### Step 1

#### Gradle

```groovy
dependencies {
    implementation 'com.github.HamidrezaAmz:AndroidImageSlider:v1.0.1'
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
