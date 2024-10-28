package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Homepage {

    WebDriver driver;

    WebElement elementsButton;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getElementsButton() {
        return driver.findElements(By.className("card-body"));
    }

    public void clickOnCard(String cardName) {
        for (int i = 0; i < getElementsButton().size(); i++) {
            if (getElementsButton().get(i).getText().equals(cardName)) {
                getElementsButton().get(i).click();
                break;
            }
        }
    }

}

