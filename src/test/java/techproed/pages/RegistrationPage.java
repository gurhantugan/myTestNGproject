package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class RegistrationPage {
    public RegistrationPage(){
//        to instantiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }
//    WebElement ssn = findElement(By.id("ssn"));
//    @FindBy(id = "ssn")
//    public WebElement ssn;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "firstname")
    public WebElement firstName;

    @FindBy(id = "lastname")
    public WebElement lastName;

    @FindBy(id = "address")
    public WebElement address;

    @FindBy(id="mobilephone")
    public WebElement mobilephone;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="firstPassword")
    public WebElement firstPassword;

    @FindBy(id = "secondPassword")
    public WebElement secondPassword;

    @FindBy(id = "register-submit")
    public WebElement submitButton;



}