package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Inputs;

public class FormInputTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void formFilling() throws InterruptedException {
        homepagePage.scrollToForms();
        homepagePage.clickOnFormsButton();
        sidebarPage.clickOnPracticeForm();
        practiceFormPage.inputFirstName(Inputs.FIRST_NAME);
        practiceFormPage.inputLastName(Inputs.LAST_NAME);
        practiceFormPage.inputEmail(Inputs.EMAIL);
        practiceFormPage.scrollToElement(practiceFormPage.maleRadioButton);
        practiceFormPage.clickOnMale();
        practiceFormPage.inputMobileNumber(Inputs.PHONE_NUMBER);
        practiceFormPage.inputSubjects(Inputs.subjects);
        practiceFormPage.clickOnSportsCheckBox();
        practiceFormPage.uploadPicture(Inputs.PATH);
        practiceFormPage.inputCurrentAddress(Inputs.CURRENT_ADDRESS);
        practiceFormPage.clickOnSubmitButton();
        Assert.assertTrue(practiceFormPage.closeButton.isDisplayed());

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
