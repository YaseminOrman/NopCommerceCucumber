package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CustomerPage {
    public CustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//h1)[2]")
    public WebElement dashBordText;

    @FindBy(xpath = "//i[@class='nav-icon far fa-user']")
    public WebElement customerIcon;

    @FindBy(xpath = "//p[text()=' Customers']")
    public WebElement customerMenu;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement addNewButton;

    @FindBy(xpath = "//h1[@class='float-left']")
    public WebElement addNewCustomerText;

    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(id = "FirstName")
    public WebElement firstnameInput;

    @FindBy(id = "LastName")
    public WebElement lastnameInput;

    @FindBy(id = "Gender_Female")
    public WebElement femaleOption;

    @FindBy(id = "DateOfBirth")
    public WebElement dateOfBirth;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissable']")
    public WebElement successfulMessage;







}
