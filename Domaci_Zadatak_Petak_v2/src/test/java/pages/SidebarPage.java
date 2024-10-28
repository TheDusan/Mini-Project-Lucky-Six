package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SidebarPage extends BaseTest {

    public SidebarPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "text")
    public List<WebElement> menuItems;

    public void clickOnPracticeForm() {
        for (WebElement element : menuItems) {
            if (element.getText().equalsIgnoreCase("Practice Form")) {
                element.click();
                break;
            }
        }
    }
}
