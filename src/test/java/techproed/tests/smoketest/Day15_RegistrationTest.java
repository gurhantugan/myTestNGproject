package techproed.tests.smoketest;

import com.github.javafaker.Faker;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.RegistrationPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class Day15_RegistrationTest {

    RegistrationPage registrationPage;

    Faker faker=new Faker();

    @Test
    public void registrationTest(){

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_registration"));
        //Driver.getDriver().findElement(By.id("ssn")).sendKeys("111111111");

        registrationPage=new RegistrationPage();
        registrationPage.ssn.sendKeys(faker.idNumber().ssnValid());

        registrationPage.firstName.sendKeys(faker.name().firstName());
        registrationPage.lastName.sendKeys(faker.name().lastName());
        registrationPage.address.sendKeys(faker.address().fullAddress());
        registrationPage.mobilephone.sendKeys(faker.phoneNumber().cellPhone());
        registrationPage.username.sendKeys(faker.name().username());
        registrationPage.firstPassword.sendKeys(faker.internet().password());

        registrationPage.secondPassword.sendKeys(faker.internet().password());
        registrationPage.submitButton.click();



    }
    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();
    }

}
