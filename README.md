# BusinessCardApp

An Android application project for a business card app, built with the Android Gradle build system and AndroidX libraries.

## Project Details

- **Platform:** Android
- **Language configuration:** Java 8 compatibility
- **Minimum Android SDK:** 24
- **Compile / target SDK:** 34
- **Build system:** Gradle with Kotlin DSL
- **UI libraries:** AndroidX AppCompat, Material Components, Activity, and ConstraintLayout
- **Testing dependencies:** JUnit, AndroidX Test, and Espresso

## Getting Started

### Requirements

- Android Studio
- A compatible JDK
- Android SDK Platform 34
- Android SDK Build-Tools installed through Android Studio

### Open and Run

1. Clone the repository:
   ```bash
   git clone https://github.com/SRIKALYANBHAVANTHI/BusinessCardApp.git
   ```
2. Open the cloned folder in Android Studio.
3. Allow Gradle to sync and download the required dependencies.
4. Select an Android emulator or connect an Android device.
5. Run the **app** configuration.

You can also build the debug APK from the project root:

```bash
./gradlew assembleDebug
```

On Windows:

```bat
gradlew.bat assembleDebug
```

## Project Structure

```text
BusinessCardApp/
├── app/
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   ├── java/
│       │   └── res/
│       ├── androidTest/
│       └── test/
├── gradle/
├── build.gradle.kts
├── gradle.properties
└── settings.gradle.kts
```

## Dependencies

The app module uses the version-catalog aliases configured in the project for AppCompat, Material Components, AndroidX Activity, ConstraintLayout, JUnit, AndroidX Test, and Espresso.

---

Created by [Srikalyan Bhavanthi](https://github.com/SRIKALYANBHAVANTHI).
