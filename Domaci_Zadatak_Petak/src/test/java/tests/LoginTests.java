package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void logingInWithOkCredentials() {
        homepage.clickOnAuthenticationLink();
        formAuthenticationPage.inputInUsernameField("tomsmith");
        formAuthenticationPage.inputInPasswordField("SuperSecretPassword!");
        formAuthenticationPage.clickOnLoginButton();

        Assert.assertEquals(driver.getCurrentUrl(), "https://the-internet.herokuapp.com/secure");
    }

    @Test
    public void logingInFailWithWrongUsername() {
        homepage.clickOnAuthenticationLink();
        formAuthenticationPage.inputInUsernameField("tomsmit");
        formAuthenticationPage.inputInPasswordField("SuperSecretPassword!");
        formAuthenticationPage.clickOnLoginButton();

        Assert.assertTrue(formAuthenticationPage.getErrorField().isDisplayed());

    }

    @Test
    public void logingInFailWithWrongPassword() {
        homepage.clickOnAuthenticationLink();
        formAuthenticationPage.inputInUsernameField("tomsmit");
        formAuthenticationPage.inputInPasswordField("SuperSecretPass");
        formAuthenticationPage.clickOnLoginButton();

        Assert.assertEquals(formAuthenticationPage.getErrorField().getText(), "Your username is invalid!\n×");

    }


}
