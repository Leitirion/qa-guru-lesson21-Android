package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:local.properties"
})

public interface LocalConfig extends Config {

    @Key("local.app")
    @DefaultValue("src/test/resources/app-alpha-universal-release.apk")
    String getLocalApp();

    @Key("local.url")
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    String getLocalUrl();

    @Key("local.device.name")
    String getLocalDevice();

    @Key("local.os.version")
    @DefaultValue("11.0")
    String getLocalOsVersion();
}