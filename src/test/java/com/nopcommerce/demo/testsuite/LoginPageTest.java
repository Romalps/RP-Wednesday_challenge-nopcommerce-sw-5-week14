package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();


    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {

        // Click on login link
        homePage.clickOnLoginLink();
        //	verify that "Welcome, Please Sign In!" message display
        loginPage.verifyThatWelcomePleaseSignInMessageIsDisplay("Welcome, Please Sign In!");

    }

    @Test (groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInvalidCredentials() {

        //  Click on login link
        homePage.clickOnLoginLink();
        //	 Enter EmailId
        loginPage.enterEmail("prime1234@gmail.com");
        //	 Enter Password
        loginPage.enterPassword("Prime1234");
        //	 Click on Login Button
        loginPage.clickOnLoginButton();
        //	 Verify that the Error message
        loginPage.verifyLoginUnsuccessfulErrorMessage("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }

    @Test (groups = {"sanity","regression"})
    public void verifyThatUserShouldLoginSuccessfullyWithValidCredentials() {

        // Click on login link
        homePage.clickOnLoginLink();
        //	 Enter EmailId
        loginPage.enterEmail("prime8911@gmail.com");
        //	 Enter Password
        loginPage.enterPassword("Prime8911");
        //	 Click on Login Button
        loginPage.clickOnLoginButton();
        //	 Verify that LogOut link is display
        homePage.verifyLogoutLinkIsDisplay();
    }
@Test (groups = {"smoke","regression"})
    public void verifyThatUserShouldLogoutSuccessfully(){

    // Click on login link
    homePage.clickOnLoginLink();
    //	 Enter EmailId
    loginPage.enterEmail("prime8912@gmail.com");
    //	 Enter Password
    loginPage.enterPassword("Prime8912");
    //	 Click on Login Button
    loginPage.clickOnLoginButton();
    // Click on LogOut Link
homePage.clickOnLogoutLink();
    //	 Verify that LogIn Link Display
homePage.verifyLoginLinkIsDisplay();
}

}
