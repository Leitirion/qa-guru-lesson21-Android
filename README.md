# **Tests for guru.qa lesson #21**


###Mobile tests for Android with Appium, AVD, config files.

---
1) Create ```.properties``` files for ```browsertack```, ```local```, ```emulator``` in ```src/test/java/resources```


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
---
### Structure of .properties files

1) ```browserstack.properties```

    ```bash
    browserstack.user=<YOUR_USER_NAME>
    browserstack.key=<YOUR_USER_KEY>
    browserstack.app=<YOUR_APP>
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
