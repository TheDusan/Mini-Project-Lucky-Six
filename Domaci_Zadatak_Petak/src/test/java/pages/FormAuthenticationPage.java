package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationPage {

    WebDriver driver;

    WebElement usernameInputField;

    WebElement passwordField;

    WebElement loginButton;

    WebElement errorField;

    public FormAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInputField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.className("radius"));
    }

    public WebElement getErrorField() {
        return driver.findElement(By.id("flash"));
    }

    public void inputInUsernameField(String value) {
        getUsernameInputField().sendKeys(value);
    }

    public void inputInPasswordField(String value) {
        getPasswordField().sendKeys(value);
    }

    public void clickOnLoginButton() {
        getLoginButton().click();
    }
}
