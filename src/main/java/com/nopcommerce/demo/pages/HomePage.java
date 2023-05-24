package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computers;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement electronics;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']")
    WebElement apparel;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']")
    WebElement digitalDownloads;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Books']")
    WebElement books;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']")
    WebElement jewelry;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    WebElement giftCards;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopCommerceLogo;
    @CacheLookup
    @FindBy(linkText = "My account")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement logoutLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLinkDisplay;

    public void clickOnComputersLink() {
        Reporter.log("Click on Computers Link " + computers.toString());
        CustomListeners.test.log(Status.PASS, "Click on Computers Link " + computers);
        clickOnElement(computers);
    }

    public void clickOnElectronicsLink() {
        Reporter.log("Click on Electronics Link" + electronics.toString());
        CustomListeners.test.log(Status.PASS, "Click on Link" + electronics);
        clickOnElement(electronics);
    }

    public void clickOnApparelLink() {
        Reporter.log("Click on Apparel Link" + apparel.toString());
        CustomListeners.test.log(Status.PASS, "Click on Apparel Link" + apparel);
        clickOnElement(apparel);
    }

    public void clickOnDigitalDownloadsLink() {
        Reporter.log("Click on  Digital Downloads Link" + digitalDownloads.toString());
        CustomListeners.test.log(Status.PASS, "Click on  Digital Downloads Link" + digitalDownloads);
        clickOnElement(digitalDownloads);
    }

    public void clickOnBooksLink() {
        Reporter.log("Click on Books Link" + books.toString());
        CustomListeners.test.log(Status.PASS, "Click on Books Link" + books);
        clickOnElement(books);
    }

    public void clickOnJewelryLink() {
        Reporter.log("Click on Jewelry link " + jewelry.toString());
        CustomListeners.test.log(Status.PASS, "Click on Jewelry link " + jewelry);
        clickOnElement(jewelry);
    }

    public void clickOnGiftCardsLink() {
        Reporter.log("Click on Gift Cards Link" + giftCards.toString());
        CustomListeners.test.log(Status.PASS, "Click on Gift Cards Link" + giftCards);
        clickOnElement(giftCards);
    }

    public void clickOnLoginLink() {
        Reporter.log("Click on  Login Link" + loginLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on  Login Link" + loginLink);
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Click on Register Link" + registerLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Register Link" + registerLink);
        clickOnElement(registerLink);
    }

    public void clickOnNopCommerceLogoLink() {
        Reporter.log("Click on Nop commerce Logo Link" + nopCommerceLogo.toString());
        CustomListeners.test.log(Status.PASS, "Click on Nop commerce Logo Link" + nopCommerceLogo);
        clickOnElement(nopCommerceLogo);
    }

    public void clickOnMyAccountLink() {
        Reporter.log("Click on My Account Link " + myAccountLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on My Account Link " + myAccountLink);
        clickOnElement(myAccountLink);
    }

    public void clickOnLogoutLink() {
        Reporter.log("Click on Logout Link" + logoutLink.toString());
        CustomListeners.test.log(Status.PASS, "Click on Logout Link" + logoutLink);
        clickOnElement(logoutLink);
    }

    public void verifyLogoutLinkIsDisplay() {
        Assert.assertTrue(logoutLink.isDisplayed());
    }

    public void verifyLoginLinkIsDisplay() {
        Assert.assertTrue(loginLinkDisplay.isDisplayed());
    }
}
