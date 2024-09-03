package drivers;

/**
 * @author niajulhasan
 */
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class IOSDriver {

    public static AppiumDriver createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone Simulator");
        capabilities.setCapability("app", "/path/to/your/app.app");
        capabilities.setCapability("automationName", "XCUITest");

        try {
            return new AppiumDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create AndroidDriver", e);
        }
    }
}

