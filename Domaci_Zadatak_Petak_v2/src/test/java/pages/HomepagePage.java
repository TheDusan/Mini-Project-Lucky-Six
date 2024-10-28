package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomepagePage extends BaseTest {

    public HomepagePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "card-up")
    public List<WebElement> cards;

    public void scrollToForms() {
        scrollToElement(cards.get(1));
    }

    public void clickOnFormsButton() {
        cards.get(1).click();
    }

    public void tearDown() {
        driver.quit();
    }
}
