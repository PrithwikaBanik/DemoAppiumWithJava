package step_definitions;

/**
 * @author niajulhasan
 */

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    private final WebDriver driver = Hooks.driver;

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
        driver.get("http://google.com");
    }
}
