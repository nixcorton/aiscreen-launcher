## 📦 How to Use

### 1. Clone the repository:

git clone https://github.com/nixcorton/aiscreen-launcher.git
cd aiscreen-launcher
### 2. Open in Android Studio
Open the folder as a new Android project

Make sure the SDK version is compatible (API 28 or above)

### 3. Build the APK
In Android Studio:

Go to Build → Build APK(s)

Or use Build → Generate Signed Bundle / APK if needed

### 4. Install on your target device
Make sure ADB is working and the device is connected:

bash
Копировать
Редактировать
adb install -r app/build/outputs/apk/debug/app-debug.apk
### 5. Run the app once manually (required by Android)
bash
Копировать
Редактировать
adb shell monkey -p com.example.myapplication -c android.intent.category.LAUNCHER 1
After this, Android will allow it to receive BOOT_COMPLETED events.

### 6. Reboot the device
After a reboot, the app will:

Launch automatically in the background

Start AiScreen app

Lock the user inside the app with startLockTask()
