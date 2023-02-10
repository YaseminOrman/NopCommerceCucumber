package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class LoginStepDefinitions {
     LoginPage loginPage = new LoginPage();
    @Given("user opens url {string}")
    public void user_opens_url(String url1) {
       Driver.getDriver().get(url1);
       ReusableMethods.waitFor(2);
    }
    @When("user enters email as {string} and password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
      loginPage.emailBox.clear();
      loginPage.emailBox.sendKeys(email);
      loginPage.passwordBox.clear();
      loginPage.passwordBox.sendKeys(password);
    }
    @When("click on login")
    public void click_on_login() {
        loginPage.loginButton.click();

    }
    @Then("page title should be {string}")
    public void page_title_should_be(String title) {
      Assert.assertEquals(title,Driver.getDriver().getTitle());
    }
    @When("user click on log out link")
    public void user_click_on_log_out_link() {
       loginPage.logoutLink.click();
        ReusableMethods.waitFor(2);
    }
    @Then("close browser")
    public void close_browser() {
     Driver.closeDriver();
    }

}