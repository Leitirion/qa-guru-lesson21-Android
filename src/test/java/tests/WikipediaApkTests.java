package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WikipediaApkTests {

    private AndroidDriver driver;

    @BeforeAll
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Pixel_4_API_30");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

//    @Test
    public void sampleTest() {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Explore");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Saved");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Search");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Edits");
        el4.click();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}