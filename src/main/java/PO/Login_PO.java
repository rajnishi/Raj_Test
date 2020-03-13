package PO;

import BasePackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_PO extends BasePage {
    public Login_PO(WebDriver driver) {
        super(driver);
    }

    public By Username_xpath = By.xpath("//input[@name='email']");
    public By Password_xpath = By.xpath("//input[@name='password']");
    public By LoginBtn_xpath = By.xpath("//div[text()='Login']");



}
