package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

    WebDriver driver;

    WebElement formAuthenticationLink;

    public Homepage(WebDriver driver) {
        this.driver = driver;

    }

    public WebElement getFormAuthenticationLink() {
        return driver.findElement(By.linkText("Form Authentication"));
    }

    public void clickOnAuthenticationLink() {
        getFormAuthenticationLink().click();
    }
}
