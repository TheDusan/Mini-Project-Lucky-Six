package pages;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PracticeFormPage extends BaseTest {

    public PracticeFormPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstNameInputField;

    @FindBy(id = "lastName")
    public WebElement lastNameInputField;

    @FindBy(id = "userEmail")
    public WebElement emailInputField;

    @FindBy(css = "label[for='gender-radio-1']")
    public WebElement maleRadioButton;

    @FindBy(id = "userNumber")
    public WebElement mobileNumberInputField;

    @FindBy(css = "#subjectsInput")
    public WebElement subjectsInputField;
    @FindBy(css = "label[for='hobbies-checkbox-1']")
    public WebElement sportsCheckBox;

    @FindBy(id = "uploadPicture")
    public WebElement chooseFileButton;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInputField;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(id="closeLargeModal")
    public WebElement closeButton;

    public void clickOnMale() {
        maleRadioButton.click();
    }

    public void inputFirstName(String firstName) {
        firstNameInputField.clear();
        firstNameInputField.sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        lastNameInputField.clear();
        lastNameInputField.sendKeys(lastName);
    }

    public void inputEmail(String email) {
        emailInputField.clear();
        emailInputField.sendKeys(email);
    }

    public void inputMobileNumber(String mobileNumber) {
        mobileNumberInputField.clear();
        mobileNumberInputField.sendKeys(mobileNumber);
    }

    public void inputSubjects(List<String> subjects) {

        for (String subject : subjects) {
            subjectsInputField.sendKeys(subject);
            subjectsInputField.sendKeys(Keys.DOWN);
            subjectsInputField.sendKeys(Keys.ENTER);

        }
    }

    public void clickOnSportsCheckBox() {
        sportsCheckBox.click();
    }

    public void uploadPicture(String path) {
        chooseFileButton.sendKeys(path);
    }

    public void inputCurrentAddress(String address) {
        currentAddressInputField.sendKeys(address);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}

