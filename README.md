# Calculator_Android_Application
## Smart Calculator – More Than Just Numbers! 🧮
## This Smart_Calculator application completely Developed and added features by ME, thanks.

#### An all-in-one Android calculator designed for real-time calculations, smooth performance, and effortless conversions. Whether it’s math, unit conversions, length, date/age, temperature, ALU operations, time, discounts, or data calculations, this app does it all with lightning-fast results!
#### 💡 Successfully Developed & Ready to Publish on Play Store!
## Try my Calculator_Website_application
🚀 Live Demo of Web Calculator
[Check out the live Calculator here](https://hemanthsaiburla.github.io/Calculator_Web_App/)
<br>
## Try my Android Calculator Application in your Phone

🚀 Live APK
[Check out the live Calculator Android App(Apk)](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/APK_folder/Calculator.apk)

#### Suggestion: Please use this application in Full Screen Mode in phone 📲📱


💡 No unnecessary selections, only smart copying of results! Works on all screen sizes with history tracking up to 100 calculations. Experience a modern, intuitive UI with dark mode support – because calculations should be easy, efficient, and stylish! 🔥
## 🔥 Key Features:
<pre>
✅ Real-Time Calculations – No need to press "="; results update as you type!
✅ Smooth UI & Optimized Performance – No block collisions on different screen sizes.
✅ History Management – Stores up to 100 previous calculations, easily adjustable in JS.
✅ Dark Mode Support – For comfortable usage in low light.
✅ Auto-Adjust Screen Ratio – Works flawlessly on all screen sizes, including tablets.
✅ Smart Copy Functionality – Users can only copy relevant data (results & input).
✅ Navigation Fixes – Solved back stack issues for better in-app movement.
✅ Screen Rotation Disabled – Ensures consistency and avoids layout shifts.
✅ Equal Padding for All Buttons & Devices – For a balanced and professional look.
</pre>

## 🛠️ Tech Stack Used:
 Make sure you have the following installed:
 1. For testing purposr, Use Visual Studio Code or Windsurf or Edit Plus etc.
 2. Android Studio for building Android Apk.
 3. To check your android application export apk in build blick in android studio or use for real time operation in phone, enable developer options in you phone, also enable install apps using USB cable in your phone.

## Technologies Used
HTMl, CSS, JS, Java

# Interfaces(or) UI of Calculator_App
## App Logo
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Logo.png)

## App in Phone screen
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/App_Logo_in_Phone.jpg)

## Calculator Home UI
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Calculator.jpg)

## History UI
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/History.jpg)

## All-in-Conversion UI
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Converter.jpg)

## Date/Age Page UI
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Date_Age.jpg)

## Speed Page
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Speed.jpg)

## Mass Page
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Mass.jpg)

## Data Page
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Data.jpg)

## Temperature Page
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Temperature.jpg)

## Discount Page
![image alt](https://github.com/HemanthsaiBurla/Calculator_Android_Application-APK/blob/main/UI_images/Discount.jpg)












## File Structure
```
Calculator/
│── .gitignore              # Ignore unnecessary files for GitHub
│── README.md               # Documentation about the project
│── build.gradle            # Gradle build script
│── settings.gradle         # Project settings
│
├── app/
│   ├── build/              # Compiled APK files (DO NOT UPLOAD)
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml  # App configuration
│   │   │   ├── java/com/example/calculator/
│   │   │   │   ├── MainActivity.java  # MainActivity file
│   │   │   │   ├── HistoryActivity.java  # History Management
│   │   │   │   ├── Utils.java  # Utility functions for calculations
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml   # Main UI layout
│   │   │   │   │   ├── activity_history.xml  # History UI layout
│   │   │   │   ├── mipmap/
│   │   │   │   │   ├── ic_launcher.png   # App logo (MDPI)
│   │   │   │   │   ├── ic_launcher_round.png  # Round logo
│   │   │   │   ├── assets/
│   │   │   │   │   ├── index.html   # Calculator WebView HTML file
│   │   │   │   │   ├── style.css    # Styles for the calculator
│   │   │   │   │   ├── script.js    # JavaScript logic for UI
│   │   │   ├── values/
│   │   │   │   ├── strings.xml  # Strings used in the app
│   │   │   │   ├── colors.xml   # Colors used in UI
│   │   │   │   ├── themes.xml   # Theme settings
│   ├── libs/                    # External libraries (if any)
│   ├── gradle/                   # Gradle wrapper
│   ├── proguard-rules.pro        # Security settings (if used)
│
├── gradle/
│── gradlew                      # Gradle wrapper for Linux/Mac
│── gradlew.bat                  # Gradle wrapper for Windows

```
### Building Your APK in Android Studio
  Follow these steps to build and generate the APK:
#### Step 1: Open Android Studio
1. Launch Android Studio and open your project
#### Step 2: Switch to Project View
1. From the left panel, select Project instead of Android.
#### Step 3: Locate the res Folder
1. Expand app/src/main/res/.
#### Step 4: Create a New assets Folder
1. Right-click res → New → Folder → Assets Folder.
2. Click Finish (this folder will store HTML, CSS, and JavaScript files).
#### Step 5: Add HTML, CSS, and JS Files
1. Copy your 30+ HTML, CSS, and JS files into app/src/main/assets/.
### Steps to Add a Logo in the res/mipmap Folder
#### Prepare Your Logo: 
1. The image should be in PNG format with multiple resolutions (e.g., mdpi, hdpi, xhdpi, xxhdpi, xxxhdpi).
#### Navigate to res/mipmap:
1. Expand app/src/main/res/mipmap.
2. Right-click mipmap → New → Image Asset.
#### Select the Logo File:
1. Browse and select your logo file.
2. Click Next and Finish (Android Studio will generate icons for different resolutions).
### Steps to Load HTML in MainActivity.java
1. Open MainActivity.java (inside app/src/main/java/com.yourpackage/).
2. Modify WebView Settings:
 i. Enable JavaScript.
ii. Load the HTML file from the assets folder.
3. Set WebView as the Main Content:

### Steps to Generate an APK in Android Studio
#### Check Gradle Configuration:
1. Open Gradle Scripts → build.gradle (Module: app) and ensure minSdkVersion and targetSdkVersion are set correctly.
#### Build the APK:
1. Click Build → Build Bundle(s) / APK(s) → Build APK(s).
#### Locate the APK:
1. After building, go to app/build/outputs/apk/debug/app-debug.apk.
#### Test on a Device:
1. Transfer the APK to a phone and install it.

#### Sign the APK for Play Store (if publishing):
1. Click Build → Generate Signed Bundle/APK.
   This ensures your Calculator app is ready for release!
#### Thanks for following any Queries mail us.




















# License
 
 This project is licensed under the MIT License.
 
# Contributing
 
 Feel free to submit issues or pull requests to improve this project.
 
 Made with ❤️ by [HemanthSai Burla](https://www.linkedin.com/in/hemanthsaiburla/)













