package techproed.tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    @Test
    public void test01(){
        Driver.getDriver().get("https://amazon.com");
        ekranGoruntusuAl("amazon_tc101");

    }

    public void ekranGoruntusuAl(String isim){
        TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();
        File kaynak=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File goruntu =new File(System.getProperty("user.dir")+"/"+isim+".png");
        try {
            FileUtils.copyFile(kaynak,goruntu);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
