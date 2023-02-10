package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CustomerPage;
import pages.SearchCustomerPage;
import utilities.ReusableMethods;

public class CustomerStepDefinitions {

    CustomerPage customerPage = new CustomerPage();
    SearchCustomerPage searchCustomerPage = new SearchCustomerPage();
    Faker faker = new Faker();

    @Then("user can view dashboard")
    public void user_can_view_dashboard() {
        Assert.assertTrue(customerPage.dashBordText.isDisplayed());
    }
    @When("user click on customers menu")
    public void user_click_on_customers_menu() {
      customerPage.customerIcon.click();
        ReusableMethods.waitFor(2);
    }
    @When("click on customers menu item")
    public void click_on_customers_menu_item() {
        customerPage.customerMenu.click();

    }
    @When("click on Add new button")
    public void click_on_add_new_button() {
        customerPage.addNewButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user can view Add new customer page")
    public void user_can_view_add_new_customer_page() {
      Assert.assertTrue(customerPage.addNewCustomerText.isDisplayed());
    }
    @When("user enter customer info")
    public void user_enter_customer_info() {
        customerPage.emailInput.sendKeys(faker.internet().emailAddress());
        customerPage.passwordInput.sendKeys(faker.internet().password());
        customerPage.firstnameInput.sendKeys(faker.name().firstName());
        customerPage.lastnameInput.sendKeys(faker.name().lastName());
        customerPage.lastnameInput.sendKeys(faker.name().lastName());
        customerPage.femaleOption.click();
        customerPage.dateOfBirth.sendKeys("05/03/1990");
        ReusableMethods.waitFor(2);
    }
    @When("click on Save button")
    public void click_on_save_button() {
        customerPage.saveButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("user can view confirmation message {string}")
    public void user_can_view_confirmation_message(String string) {
     Assert.assertTrue(customerPage.successfulMessage.isDisplayed());

    }
    @When("enter customer email")
    public void enter_customer_email() {
     searchCustomerPage.searchEmail.sendKeys("victoria_victoria@nopCommerce.com");
        ReusableMethods.waitFor(2);
    }
    @When("click on search button")
    public void click_on_search_button() {
     searchCustomerPage.searchButton.click();
     ReusableMethods.waitFor(3);
    }
    @Then("user should found email in the search table")
    public void user_should_found_email_in_the_search_table() {
    Assert.assertTrue(searchCustomerPage.emailText.getText().contains("victoria_victoria@nopCommerce.com"));
    }

    @When("enter customer firstname")
    public void enter_customer_firstname() {
     searchCustomerPage.searchFirstName.sendKeys("Victoria");
    }
    @When("enter customer lastname")
    public void enter_customer_lastname() {
      searchCustomerPage.searchLastName.sendKeys("Terces");
    }
    @Then("user should found name in the search table")
    public void user_should_found_name_in_the_search_table() {
      Assert.assertTrue(searchCustomerPage.nameText.getText().contains("Victoria Terces"));
    }



}
