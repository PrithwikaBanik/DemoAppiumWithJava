package drivers;

/**
 * @author niajulhasan
 */

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class AndroidDriver {
    public static AppiumDriver createDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", "/path/to/your/app.apk");
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            return new AppiumDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create AndroidDriver", e);
        }
    }
}


