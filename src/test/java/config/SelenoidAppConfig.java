package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.LoadType.MERGE;

@Config.LoadPolicy(MERGE)
@Config.Sources({
        "system:properties",
        "classpath:selenoid.properties"
})

public interface SelenoidAppConfig extends Config {

    @Key("selenoid.url")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String getSelenoidUrl();

    @Key("selenoid.device.name")
    String getSelenoidDeviceName();

    @Key("selenoid.os.version")
    @DefaultValue("11.0")
    String getSelenoidOsVersion();
}