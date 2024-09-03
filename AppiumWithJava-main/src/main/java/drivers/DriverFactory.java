package drivers;

import io.appium.java_client.AppiumDriver;

/**
 * @author niajulhasan
 */

public class DriverFactory {
    public static AppiumDriver createDriver(String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return AndroidDriver.createDriver();
            case "ios":
                return IOSDriver.createDriver();
            case "browser":
                return BrowserDriver.createDriver();
            default:
                throw new IllegalArgumentException("Unknown platform: " + platform);
        }
    }
}
