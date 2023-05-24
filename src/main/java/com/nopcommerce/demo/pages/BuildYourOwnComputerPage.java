package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerText;
    @CacheLookup
    @FindBy(xpath = "//select[@name='product_attribute_1']")
    WebElement processorDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement ramDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@value='6']")
    WebElement HDDRadiosFor320GB;
    @CacheLookup
    @FindBy(xpath = "//input[@value='7']")
    WebElement HDDRadioFor400GB;
    @CacheLookup
    @FindBy(xpath = "//input[@value='8']")
    WebElement osRadioVistaHome;
    @CacheLookup
    @FindBy(xpath = "//input[@value='9']")
    WebElement osRadioForVistaPremium;
    @CacheLookup
    @FindBy(xpath = "//input[@value='10']")
    WebElement softwareCheckBoxesForMicrosoftOffice;
    @CacheLookup
    @FindBy(xpath = "//input[@value='11']")
    WebElement softwareCheckBoxesForAcrobatReader;
    @CacheLookup
    @FindBy(xpath = "//input[@value='12']")
    WebElement softwareCheckBoxesForTotalCommanders;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']")
    WebElement productMessage;

    public String getBuildYourOwnComputerText() {
        Reporter.log("Get Build Your Own Computer Text " + buildYourOwnComputerText.toString());
        CustomListeners.test.log(Status.PASS, "Get Build Your Own Computer Text " + buildYourOwnComputerText);
        return getTextFromElement(buildYourOwnComputerText);

    }

    public void verifyBuildYourOwnComputerText(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getBuildYourOwnComputerText()));

    }

    public void selectProcessorFromDropDown(String processor) {
        Reporter.log("Select Processors from dropdown " + processor.toString());
        CustomListeners.test.log(Status.PASS, "Select Processors from dropdown " + processor);
        selectByVisibleTextFromDropDown(processorDropDown, processor);
    }

    public void selectRamFromDropDown(String ram) {
        Reporter.log("Select ram From Dropdown " + ram.toString());
        CustomListeners.test.log(Status.PASS, "Select ram From Dropdown " + ram);
        selectByVisibleTextFromDropDown(ramDropDown, ram);

    }

    public void selectHDDRadioButton(String HDD) {
        switch (HDD) {
            case "320 GB":
                Reporter.log(" Select 320 GB " + HDD.toString());
                CustomListeners.test.log(Status.PASS, " Select 320 GB " + HDD);
                clickOnElement(HDDRadiosFor320GB);
                break;
            case "400 GB [+$100.00]":
                Reporter.log(" Select 400 GB [+$100.00] " + HDD.toString());
                CustomListeners.test.log(Status.PASS, " Select 400 GB [+$100.00] " + HDD);
                clickOnElement(HDDRadioFor400GB);
                break;
        }
    }

    public void selectOSRadioButton(String os) {
        switch (os) {
            case "Vista Home [+$50.00]":
                Reporter.log(" Select Vista Home [+$50.00] " + os.toString());
                CustomListeners.test.log(Status.PASS, " Select Vista Home [+$50.00] " + os);
                clickOnElement(osRadioVistaHome);
                break;
            case "Vista Premium [+$60.00]":
                Reporter.log(" Select Vista Premium [+$60.00] " + os.toString());
                CustomListeners.test.log(Status.PASS, " SelectVista Premium [+$60.00] " + os);
                clickOnElement(osRadioForVistaPremium);
                break;
        }
    }

    public void selectSoftwareCheckBoxes(String software) {
        switch (software) {
            case "Microsoft Office [+$50.00]":
                Reporter.log("Select Microsoft Office [+$50.00]  " + software.toString());
                CustomListeners.test.log(Status.PASS, "Select Microsoft Office [+$50.00]  " + software);
               // clickOnElement(softwareCheckBoxesForMicrosoftOffice);
                break;
            case "Acrobat Reader [+$10.00]":
                Reporter.log("Select Acrobat Reader [+$10.00]  " + software.toString());
                CustomListeners.test.log(Status.PASS, "Select Acrobat Reader [+$10.00]  " + software);
                clickOnElement(softwareCheckBoxesForMicrosoftOffice);
                clickOnElement(softwareCheckBoxesForAcrobatReader);
                break;
            case "Total Commander [+$5.00]":
                Reporter.log("SelectTotal Commander [+$5.00] " + software.toString());
                CustomListeners.test.log(Status.PASS, "Select Microsoft Office [+$50.00]  " + software);
                clickOnElement(softwareCheckBoxesForMicrosoftOffice);
                clickOnElement(softwareCheckBoxesForTotalCommanders);
                break;

        }
    }


    public void clickOnAddToCartButton() {
        Reporter.log("Click on Add to cart button " + addToCartButton.toString());
        CustomListeners.test.log(Status.PASS, " Click on Add to cart button " + addToCartButton);
        clickOnElement(addToCartButton);

    }

    public String getTheProductHasBeenAddedToYourShoppingCart() {
        Reporter.log("Get the product has been added to your shopping cart message " + productMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get the product has been added to your shopping cart message " + productMessage);
        return getTextFromElement(productMessage);
    }
public void verifyMessageTheProductHasBeenAddedToYourShoppingCart(String expectedMessage){
        Assert.assertEquals(getTheProductHasBeenAddedToYourShoppingCart(),expectedMessage);
}

}
