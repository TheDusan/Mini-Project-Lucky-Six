package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void validUserAndPass() {
        String username = excelReader.getStringData("Sheet1", 1, 0);
        String password = excelReader.getStringData("Sheet1", 1, 1);
        homepage.inputText(homepage.getUsernameInputField(), username);
        homepage.inputText(homepage.getPasswordInputField(), password);
        homepage.buttonClick(homepage.getLoginButton());

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");

    }

    @Test
    public void invalidUserValidPass() {
        String username = excelReader.getStringData("Sheet1", 1, 2);
        String password = excelReader.getStringData("Sheet1", 1, 1);
        homepage.inputText(homepage.getUsernameInputField(), username);
        homepage.inputText(homepage.getPasswordInputField(), password);
        homepage.buttonClick(homepage.getLoginButton());

        Assert.assertTrue(homepage.getAlertDiv().isDisplayed());
        Assert.assertEquals(homepage.getAlertDiv().getText(), "Your username is invalid!\n×");
    }

    @Test
    public void validUserInvalidPass() {
        String username = excelReader.getStringData("Sheet1", 1, 0);
        String password = excelReader.getStringData("Sheet1", 1, 3);
        homepage.inputText(homepage.getUsernameInputField(), username);
        homepage.inputText(homepage.getPasswordInputField(), password);
        homepage.buttonClick(homepage.getLoginButton());

        Assert.assertTrue(homepage.getAlertDiv().isDisplayed());
        Assert.assertEquals(homepage.getAlertDiv().getText(), "Your password is invalid!\n×");
    }

    @Test
    public void invalidUserAndPass() {
        String username = excelReader.getStringData("Sheet1", 1, 2);
        String password = excelReader.getStringData("Sheet1", 1, 3);
        homepage.inputText(homepage.getUsernameInputField(), username);
        homepage.inputText(homepage.getPasswordInputField(), password);
        homepage.buttonClick(homepage.getLoginButton());

        Assert.assertTrue(homepage.getAlertDiv().isDisplayed());
        Assert.assertEquals(homepage.getAlertDiv().getText(), "Your username is invalid!\n×");
    }

    public void tearDown() {
        driver.quit();
    }
}
