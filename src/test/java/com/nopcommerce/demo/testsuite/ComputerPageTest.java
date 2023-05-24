package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();


    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        // Click on Computer tab
        homePage.clickOnComputersLink();
        //   Verify "Computer" text
        computerPage.verifyComputerText("Computers");

    }

    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // Click on Computer tab
        homePage.clickOnComputersLink();
        //   Click on Desktops link
        computerPage.clickOnDesktopsLink();
        //   Verify "Desktops" text
        desktopsPage.verifyDesktopsText("Desktops");
    }

    @Test (dataProvider = "value", dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYourOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {

        // Click on Computer tab
        homePage.clickOnComputersLink();
        //   Click on Desktops link
        computerPage.clickOnDesktopsLink();
        // Click on product name "Build your own computer"
        desktopsPage.selectProductList("Build your own computer");
        buildYourOwnComputerPage.verifyBuildYourOwnComputerText("Build your own computer");
        //   Select processor "processor"
        buildYourOwnComputerPage.selectProcessorFromDropDown(processor);

        //   Select RAM "ram"
        buildYourOwnComputerPage.selectRamFromDropDown(ram);
        //   Select HDD "hdd"
        buildYourOwnComputerPage.selectHDDRadioButton(hdd);
        //   Select OS "os"
        buildYourOwnComputerPage.selectOSRadioButton(os);
        //   Select Software "software"
        buildYourOwnComputerPage.selectSoftwareCheckBoxes(software);
        //   Click on "ADD TO CART" Button
        buildYourOwnComputerPage.clickOnAddToCartButton();
        //   Verify message "The product has been added to your shopping cart"
        buildYourOwnComputerPage.verifyMessageTheProductHasBeenAddedToYourShoppingCart("The product has been added to your shopping cart");

    }


}
