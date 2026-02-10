package StepDefinition;

import io.cucumber.java.en.*;
import pages.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        loginPage = new LoginPage(driver);
    }

    @When("user enters valid username and password")
    public void user_enters_valid_credentials() {
        loginPage.enterUsername("testuser");
        loginPage.enterPassword("password");
        loginPage.clickLogin();
    }

    @Then("user should see the dashboard")
    public void user_should_see_dashboard() {
        assertTrue(driver.getTitle().contains("Dashboard"));
        driver.quit();
    }
}
