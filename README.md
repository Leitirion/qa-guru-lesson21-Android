# **Tests for guru.qa lesson #21**


###Mobile tests for Android with Appium, AVD, config files.

---
1) Create ```.properties``` files for ```browsertack```, ```local```, ```emulator```, ```selenoid``` in ```src/test/java/resources```


2) Run test on browserstack:
    ```bash
    ./gradlew clean test -DdeviceHost=browserstack
    ```

    Run test emulator:
    ```bash
    ./gradlew clean test -DdeviceHost=emulator
    ```

    Run test local (default):
    ```bash
    ./gradlew clean test -DdeviceHost=local
    ```

   Run test with selenoid:
   ```bash
   ./gradlew clean test -DdeviceHost=selenoid
   ```
---
### Structure of .properties files

1) ```browserstack.properties```

    ```bash
    browserstack.user=<YOUR_USER_NAME>
    browserstack.key=<YOUR_USER_KEY>
    browserstack.app=bs://9774245d2f8ea96c5f9e123fd7e9f5bf377d6b09 (for andoid 11 and Pixel 4)
    ```

2) ```emulator.properties```

    ```bash
    emulator.app=src/test/resources/app-alpha-universal-release.apk
    emulator.url=http://127.0.0.1:4723/wd/hub
    emulator.device.name=Pixel_4_API_30
    emulator.os.version=11.0
    ```


3) ```local.properties```

    ```bash
    local.app=src/test/resources/app-alpha-universal-release.apk
    local.url=http://127.0.0.1:4723/wd/hub
    local.device.name=<YOUR_DEVICE_NAME>
    local.os.version=10.0
    ```

4) ```selenoid.properties```

    ```bash
   selenoid.url=http://user1:1234@selenoid.autotests.cloud/wd/hub/
   selenoid.device.name=android
   selenoid.os.version=10.0
    ```
