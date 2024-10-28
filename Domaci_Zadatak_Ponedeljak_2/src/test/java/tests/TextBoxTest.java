package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Inputs;

public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void validMailInput() {
        enter();
        textBoxPage.fieldInput(textBoxPage.getEmailInputField(), Inputs.validEmail);
        action();
        Assert.assertEquals(textBoxPage.getOutputDiv().getText(), "Name:Clark Kent\n" +
                "Email:ckent@dailyplanet.com\n" +
                "Current Address :344 Clinton Street, Apartment 3D\n" +
                "Permanent Address :Kent Farm, Smallville"); // ne znam da li se to sto pise "permananet"
                                                            // vodi kao greska na sajtu
                                                            // ja racunam da jeste, zato ce da fejluje svaki put
    }

    @Test
    public void invalidMailInput() {
        enter();
        textBoxPage.fieldInput(textBoxPage.getEmailInputField(), Inputs.invalidEmail);
        action();
        Assert.assertEquals(textBoxPage.getOutputDiv().getText(), "");

    }

    public void enter() { // pomocna metoda, da ne pisem isto vise puta
        scrollToElement(homepage.getElementsButton().get(0));
        homepage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Text Box");
    }

    public void action() { // pomocna metoda, da ne pisem 2 puta isto
        textBoxPage.fieldInput(textBoxPage.getUsernameInputField(), Inputs.name);
        textBoxPage.fieldInput(textBoxPage.getCurrentAddressInputField(), Inputs.currentAddress);
        textBoxPage.fieldInput(textBoxPage.getPermanentAddressInputField(), Inputs.permanentAddress);
        textBoxPage.clickOnButton(textBoxPage.getSubmitButton());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
