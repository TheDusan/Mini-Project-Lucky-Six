package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepagePage extends BaseTest {

    public HomepagePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "menu-item-20")
    public WebElement practiceButton;

    public void clickOnPracticeButton() {
        practiceButton.click();
    }
}
