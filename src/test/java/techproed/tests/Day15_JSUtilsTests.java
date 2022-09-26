package techproed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;
import techproed.utilities.JSUtils;
import techproed.utilities.ReusableMethods;


public class Day15_JSUtilsTests {

    @Test
    public void scrollIntoViewTest(){
//        Going to teh URL
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
//        Scroll into Pricing Plan Element
        WebElement pricingPlan = Driver.getDriver().findElement(By.xpath("//*[.='Pricing Plan']"));
        JSUtils.scrollIntoViewJS(pricingPlan);

        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }

    @Test
    public void clickWithJSTest(){

        LoginPage loginPage=new LoginPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        ReusableMethods.waitFor(2);

        JSUtils.clickElementByJS(loginPage.loginDropdown);
        JSUtils.clickElementByJS(loginPage.signInButton);
        JSUtils.clickElementByJS(loginPage.loginButton);

    }

    @Test
    public void scrollDownThePage(){

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        JSUtils.scrollDownByJS();


    }

    @Test
    public void flashTest(){
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));
        JSUtils.clickElementByJS(loginPage.loginDropdown);
        JSUtils.clickElementByJS(loginPage.signInButton);
        JSUtils.flash(loginPage.loginButton);

    }

}