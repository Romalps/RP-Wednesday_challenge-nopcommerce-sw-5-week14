package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {
    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        registerPage = new RegisterPage();

    }

    @Test(groups = {"regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        // Click on Register Link
        homePage.clickOnRegisterLink();
        //   Verify "Register" text
        registerPage.verifyRegisterText("Register");
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {

        // Click on Register Link
        homePage.clickOnRegisterLink();
        //   Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        //   Verify the error message "First name is required."
        registerPage.verifyTheErrorMessageFirstNameIsRequired("First name is required.");
        //   Verify the error message "Last name is required."
        registerPage.verifyTheErrorMessageLastNameIsRequired("Last name is required.");
        //   Verify the error message "Email is required."
        registerPage.verifyTheErrorMessageEmailIsRequired("Email is required.");
        //   Verify the error message "Password is required."
        registerPage.verifyTheErrorMessagePasswordIsRequired("Password is required.");
        //   Verify the error message "Password is required."
        registerPage.verifyTheErrorMessageConfirmPasswordIsRequired("Password is required.");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully() {

        // Click on Register Link
        homePage.clickOnRegisterLink();
        // Select gender "Female"
        registerPage.selectMaleOrFemaleRadioButton("Female");

        //   Enter firstname
        registerPage.enterFirstname("Prime8900" + getRandomString(4));
        //   Enter lastname
        registerPage.enterLastName("Tester");
        //   Select day
        registerPage.selectDayFromDateOfBirth("8");
        //   Select month
        registerPage.selectMonthFromDateOfBirth("June");
        //   Select year
        registerPage.selectYearFromDateOfBirth("1990");
        //   Enter email
        //registerPage.enterEmail("prime8900@gmail.com");
        registerPage.enterEmail("prime " + getRandomString(4) + "@gmail.com");
        //   Enter password
        //registerPage.enterPassword("Prime8900");
        registerPage.enterPassword("Prime8901");
        //   Enter Confirm Password
        registerPage.enterConfirmPassword("Prime8900");
        //   Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
        //   Verify message "Your registration completed"
        registerPage.verifyMessageYourRegistrationCompleted("Your registration completed");

    }
}
