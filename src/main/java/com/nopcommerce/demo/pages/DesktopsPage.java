package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopsText;
    @CacheLookup
    @FindBy(xpath = "//select[@name='products-orderby']")
    WebElement sortByDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='products-pagesize']")
    WebElement displayDropDown;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement selectBuildYourOwnComputerFromProductList;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Digital Storm VANQUISH 3 Custom Performance PC']")
    WebElement selectDigitalStromVanquish3CustomPerformancePCFromProductList;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Lenovo IdeaCentre 600 All-in-One PC']")
    WebElement selectLenovoIdeaCentre600AllInOnePC;

    public String getDesktopText() {
        Reporter.log("Get desktop text " + desktopsText.toString());
        CustomListeners.test.log(Status.PASS, "Get desktop text " + desktopsText);
        return getTextFromElement(desktopsText);
    }

    public void verifyDesktopsText(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getDesktopText()));
    }

    public void selectSortByFromDropDown(String sortBy) {
        Reporter.log("Select Sort By from Dropdown " + sortBy.toString());
        CustomListeners.test.log(Status.PASS, "Select Sort By from Dropdown " + sortBy);
        selectByVisibleTextFromDropDown(sortByDropDown, sortBy);
    }

    public void selectDisplayFromDropdown(String display) {
        Reporter.log("Select Display from Dropdown " + display.toString());
        CustomListeners.test.log(Status.PASS, "Select Display from Dropdown " + display);
        selectByVisibleTextFromDropDown(displayDropDown, display);
    }

    public void selectProductList(String productList) {

        switch (productList){
            case "Build your own computer":
            Reporter.log("Select Build your own computer from Product List " + productList.toString());
            CustomListeners.test.log(Status.PASS, "Select Build your own computer from Product List " + productList);
            clickOnElement(selectBuildYourOwnComputerFromProductList);
            break;
            case "Digital Storm VANQUISH 3 Custom Performance PC":
                Reporter.log("Select Digital Storm VANQUISH 3 Custom Performance PC Product List " + productList.toString());
                CustomListeners.test.log(Status.PASS, "Select Digital Storm VANQUISH 3 Custom Performance PC Product List " + productList);
                clickOnElement(selectDigitalStromVanquish3CustomPerformancePCFromProductList);
                break;
            case "Lenovo IdeaCentre 600 All-in-One PC":
                Reporter.log("Select Lenovo IdeaCentre 600 All-in-One PC from Product List " + productList.toString());
                CustomListeners.test.log(Status.PASS, "Select Lenovo IdeaCentre 600 All-in-One PC from Product List " + productList);
                clickOnElement(selectLenovoIdeaCentre600AllInOnePC);
                break;

        }
    }


}
