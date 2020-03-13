package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("config.properties");
        launchBroswer();

        driver.get(readFromPropFileObj.getUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

    }

    @AfterClass
    public void afterClass(){
//        driver.quit();
    }

    public void launchBroswer(){

        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("config.properties");

        String browsername = readFromPropFileObj.getBrowser();
        if(browsername.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", readFromPropFileObj.getDriverPath());
            driver = new ChromeDriver();
        }


    }
}

