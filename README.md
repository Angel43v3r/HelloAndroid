# Hello Android
![Android Studio](https://github.com/Angel43v3r/HelloAndroid/blob/master/RESOURCES/Android_Studio_icon_(2023).svg)
## Assignment 6 - Hello Android Setup
### AD340 - Mobile Application Development
### North Seattle College (Spring 2026)
### Date: May 3, 2026


## Table Of Contents
1. [Objective](#objective)
2. [How to Use](#how-to-use)
3. [Contributing](#contributing)
4. [License](#license)


## Objective
In this hands-on lab, you will set up your professional Android development environment, configure an emulator, and build your first UI using Jetpack Compose, Google’s modern toolkit for building native UI.


## How to Use
### Prerequisites
Make sure you have the following installed:
- **Android Studio**

### Phase 1: Installation & Environment Setup
Before we write code, we need the engine.

1. **Download Android Studio:** Go to the [official download page](https://developer.android.com/studio) and install the latest stable version (Ladybug or newer).

2. **SDK Components:** During the setup wizard, ensure you select the **Android SDK** and**SDK Platform**, and **Android Virtual Device**

    *NOTE: In the recent version, the Android Virtual Device does not show during Initial Setup.*

3. **Performance Check:** If you are on Windows, ensure **Hyper-V** or **HAXM** is enabled in your BIOS/Features to allow the emulator to run smoothly.

### Phase 2: Create Your First Project
Now, let’s initialize a modern Android project template.

1. Open Android Studio and select **New Project**.

2. Choose **Empty Compose Activity** (This is crucial! Do not pick "Empty Views Activity").

    *NOTE: In recent version, the Empty Compose Activity does not show, select **Empty Compose** instead*

3. **Configure your project:**

    - **Name:** `HelloAndroid`

    - **Package name:** `com.example.helloandroid`

    - **Minimum SDK:** API 24 (Android 7.0) or higher.

    - **Build configuration language:** Kotlin DSL (`build.gradle.kts`).

4. Click **Finish** and wait for Gradle to finish "syncing" (this may take a few minutes on the first run).

### Phase 3: Setting Up the Android Virtual Device (AVD)
To see your app, you need a virtual phone.

1. In the top right corner of Android Studio, click the **Device Manager** icon (or go to Tools > Device Manager).

2. Click **Create Device**.

    *NOTE: In recent version, this is renamed to **Create Virtual Device**.*

3. Select a hardware profile (e.g., **Pixel 8**).

4. Select a **System Image**. Choose the latest stable API level (e.g., API 34/35). You may need to click the download icon next to the version name first.

5. Finish the wizard and click the **Play** button next to your new virtual device to launch the emulator.

### Phase 4: Customizing the UI with Jetpack Compose
In Jetpack Compose, the UI is built using functions annotated with `@Composable`. We are going to change the default greeting.

1. Open `MainActivity.kt` from the `java/com/example/helloandroid` folder.

2. Locate the `Greeting` function. 

3. Customize the UI. Modify the `Greeting` function to change the text, font size, and color. Use the code below as a guide:

4.
```
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to Android, $name!",
        color = Color.Blue,
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}
```

5. **Update the Caller:** In the onCreate method, change the name passed to the function:

- Find `Greeting("Android")` and change it to `Greeting("Your Name")`.

### Phase 5: Run and Verify
1. Ensure your AVD is running.

2. Click the green **Run** icon (Play button) in the top toolbar.

3. **Success Criteria:** The emulator should open your app and display: **"Welcome to Android, [Your Name]!"** in bold blue text.


## Contributing
Developed By: **Jovy Ann Nelson**

Instructor: **BC Ko**

Course: **AD340 - Mobile Application Development**

College: **North Seattle College**

Term: **Spring 2026**

Date: **April 27, 2026** to **May 3, 2026**

## License
This project is licensed under the MIT License. Please refer to
the [LICENSE](https://github.com/Angel43v3r/HelloAndroid/blob/master/LICENSE) for more details.
