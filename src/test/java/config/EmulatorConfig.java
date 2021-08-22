package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:emulator.properties"
})

public interface EmulatorConfig extends Config {

    @Key("emulator.app")
    @DefaultValue("src/test/resources/app-alpha-universal-release.apk")
    String getEmulatorApp();

    @Key("emulator.url")
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    String getEmulatorUrl();

    @Key("emulator.device.name")
    @DefaultValue("Pixel_4_API_30")
    String getEmulatorDevice();

    @Key("emulator.os.version")
    @DefaultValue("11.0")
    String getEmulatorOsVersion();
}