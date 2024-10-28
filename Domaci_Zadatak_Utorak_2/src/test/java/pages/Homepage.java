package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    WebDriver driver;
    WebElement usernameInputField;
    WebElement passwordInputField;
    WebElement loginButton;
    WebElement alertDiv;


    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInputField() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordInputField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("button[type='submit']"));
    }

    public WebElement getAlertDiv() {
        return driver.findElement(By.id("flash"));
    }

    public void inputText(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }

    public void buttonClick(WebElement element) {
        element.click();
    }
}
