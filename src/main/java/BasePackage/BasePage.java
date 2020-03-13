package BasePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean clickOnlinkBtn(By by){
        try{
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webElement.click();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public boolean enterTextInInputBox(By by, String text){
        try{
            WebElement webElement = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webElement.sendKeys(text);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }




}
