package step_definitions;

import drivers.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

/**
 * @author niajulhasan
 */
public class Hooks {
    public static AppiumDriver driver;

    @Before
    public void setUp() {
        // Determine the platform from environment or configuration
        String platform = System.getProperty("platform", "browser"); // Default to chrome
        driver = DriverFactory.createDriver(platform);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
