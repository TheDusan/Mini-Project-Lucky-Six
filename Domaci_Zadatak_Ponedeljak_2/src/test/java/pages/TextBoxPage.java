package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
    WebDriver driver;
    WebElement usernameInputField;
    WebElement emailInputField;
    WebElement currentAddressInputField;
    WebElement permanentAddressInputField;
    WebElement submitButton;
    WebElement outputDiv;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInputField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailInputField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddressInputField() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressInputField() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getOutputDiv() {
        return driver.findElement(By.id("output"));
    }

    public void fieldInput(WebElement element, String input) {
        element.clear();
        element.sendKeys(input);
    }

    public void clickOnButton(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

}
