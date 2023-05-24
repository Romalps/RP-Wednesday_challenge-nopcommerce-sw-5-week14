package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class ComputerPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computersText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath= "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement softwareLink;

    public String getComputerText() {
        Reporter.log("Get Computer text " + computersText.toString());
        CustomListeners.test.log(Status.PASS, "Get Computer text " + computersText);
        return getTextFromElement(computersText);
    }

    public void verifyComputerText(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getComputerText()));
    }

    public void clickOnDesktopsLink() {
        Reporter.log("Click on Desktops Link " + desktopsLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Desktops Link " + desktopsLink);
        clickOnElement(desktopsLink);
    }

    public void clickOnNotebooksLink() {
        Reporter.log("Click on Notebooks Link " + notebooksLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Notebooks Link " + notebooksLink);
        clickOnElement(notebooksLink);
    }

    public void clickOnSoftwareLink() {
        Reporter.log("Click on Software Link " + softwareLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Software Link " + softwareLink);
        clickOnElement(softwareLink);
    }
}
