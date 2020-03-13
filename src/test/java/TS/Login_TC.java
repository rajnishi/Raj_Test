package TS;

import BasePackage.BaseTest;
import BasePackage.ReadFromPropFile;
import PO.Login_PO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_TC extends BaseTest {

    @Test

    public void verifyLoginPage(){
        Login_PO login_poObj = new Login_PO(driver);
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("loginCredential.properties");

        Assert.assertTrue(login_poObj.enterTextInInputBox(login_poObj.Username_xpath, readFromPropFileObj.getUserName()),"Unable to enter username");
        Assert.assertTrue(login_poObj.enterTextInInputBox(login_poObj.Password_xpath, readFromPropFileObj.getpassword()),"Unable to enter password");
        Assert.assertTrue(login_poObj.clickOnlinkBtn(login_poObj.LoginBtn_xpath),"Unable to click on login button");



    }
}
