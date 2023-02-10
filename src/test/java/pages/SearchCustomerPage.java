package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SearchCustomerPage {
    public SearchCustomerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "SearchEmail")
    public WebElement searchEmail;

    @FindBy(xpath = "(//i[@class='fas fa-search'])[2]")
    public WebElement searchButton;

    @FindBy(xpath = "//table//td[2]")
    public WebElement emailText;


}
