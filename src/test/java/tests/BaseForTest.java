package tests;

import com.codeborne.selenide.Configuration;
import drivers.BrowserStackMobileDriver;
import drivers.EmulatorDriver;
import drivers.LocalMobileDriver;

import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseForTest {

    @Config.Sources({
            "system:properties"
    })

    public interface DeviceHost extends Config {

        @Key("deviceHost")
        String getDeviceHost();
    }

    static DeviceHost config = ConfigFactory.create(DeviceHost.class, System.getProperties());

    @BeforeAll
    public static void setup() {
        addListener("AllureSelenide", new AllureSelenide());

        switch (config.getDeviceHost()) {
            case "browserstack":
                Configuration.browser = BrowserStackMobileDriver.class.getName();
                break;
            case "local":
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
            case "emulator":
                Configuration.browser = EmulatorDriver.class.getName();
                break;
            default:
                Configuration.browser = LocalMobileDriver.class.getName();
                break;
        }

        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void startDriver() {
        open();
    }

    @AfterEach
    public void afterEach() {
        closeWebDriver();
    }
}