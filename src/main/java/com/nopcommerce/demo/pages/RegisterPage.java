package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class RegisterPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(xpath = "//input[@value='M']")
    WebElement maleRadio;
    @CacheLookup
    @FindBy(xpath = "//input[@value='F']")
    WebElement femaleRadio;
    @CacheLookup
    @FindBy(xpath = "//input[@name='FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='LastName']")
    WebElement lastnameField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dayFromDateOfBirthDropDowns;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthFromDateOfBirthDropDowns;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearFromDateOfBirthDropDowns;
    @CacheLookup
    @FindBy(xpath = "//input[@name='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='FirstName']")
    WebElement firstNameRequiredErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Last name is required.')]")
    WebElement lastNameRequiredErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Email is required.')]")
    WebElement emailRequiredErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='Password']//span[contains(text(),'Password is required.')]")
    WebElement passwordRequiredErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='ConfirmPassword']//span[contains(text(),'Password is required.')]")
    WebElement confirmPasswordRequiredErrorMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public void verifyRegisterText(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getRegisterText()));
    }

    public void selectMaleOrFemaleRadioButton(String maleOrFemale) {
        switch (maleOrFemale) {
            case "Female":
                Reporter.log("Select Female Radio button " + femaleRadio.toString());
                CustomListeners.test.log(Status.PASS, "Select Female Radio button " + femaleRadio);
                clickOnElement(femaleRadio);
                break;
            case "Male":
                Reporter.log("Select Male Radio button " + maleRadio.toString());
                CustomListeners.test.log(Status.PASS, "Select Male Radio button " + maleRadio);
                clickOnElement(maleRadio);
                break;
        }

    }

    public void enterFirstname(String firstname) {
        Reporter.log("Enter Firstname " + firstname.toString());
        CustomListeners.test.log(Status.PASS, "Enter Firstname " + firstname);
        sendTextToElement(firstNameField, firstname);

    }

    public void enterLastName(String lastname) {
        Reporter.log("Enter Lastname " + lastname.toString());
        CustomListeners.test.log(Status.PASS, "Enter Lastname " + lastname);
        sendTextToElement(lastnameField, lastname);
    }

    public void selectDayFromDateOfBirth(String day) {
        Reporter.log("Select day from date of Birth field " + day.toString());
        CustomListeners.test.log(Status.PASS, "Select day from date of Birth field " + day);
        selectByVisibleTextFromDropDown(dayFromDateOfBirthDropDowns, day);
    }

    public void selectMonthFromDateOfBirth(String month) {
        Reporter.log("Select Month from date of Birth field " + month.toString());
        CustomListeners.test.log(Status.PASS, "Select Month from date of Birth field " + month);
        selectByVisibleTextFromDropDown(monthFromDateOfBirthDropDowns, month);
    }

    public void selectYearFromDateOfBirth(String year) {
        Reporter.log("Select Year from date of Birth field " + year.toString());
        CustomListeners.test.log(Status.PASS, "Select Year from date of Birth field " + year);
        selectByVisibleTextFromDropDown(yearFromDateOfBirthDropDowns, year);
    }

    public void enterEmail(String email) {
        Reporter.log("Enter Email " + email.toString());
        CustomListeners.test.log(Status.PASS, "Enter Email " + email);
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter Password " + password.toString());
        CustomListeners.test.log(Status.PASS, "Enter Password " + password);
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        Reporter.log("Enter Confirm Password " + confirmPassword.toString());
        CustomListeners.test.log(Status.PASS, "Enter Confirm Password " + confirmPassword);
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        Reporter.log("Click on Register button " + registerButton.toString());
        CustomListeners.test.log(Status.PASS, "Click on Register button " + registerButton);
        clickOnElement(registerButton);
    }

    public String getFirstNameIsRequiredText() {
        Reporter.log("Get First name is required text " + firstNameRequiredErrorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get First name is required text " + firstNameRequiredErrorMessage);
        return getTextFromElement(firstNameRequiredErrorMessage);
    }

    public void verifyTheErrorMessageFirstNameIsRequired(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getFirstNameIsRequiredText()));
    }

    public String getLastnameIsRequiredText() {
        Reporter.log("Get Last name is required text " + lastNameRequiredErrorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Last name is required text " + lastNameRequiredErrorMessage);
        return getTextFromElement(lastNameRequiredErrorMessage);
    }

    public void verifyTheErrorMessageLastNameIsRequired(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getLastnameIsRequiredText()));
    }

    public String getEmailIsRequiredText() {
        Reporter.log("Get Email is required text " + emailRequiredErrorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Email is required text " + emailRequiredErrorMessage);
        return getTextFromElement(emailRequiredErrorMessage);
    }

    public void verifyTheErrorMessageEmailIsRequired(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getEmailIsRequiredText()));
    }

    public String getPasswordIsRequiredText() {
        Reporter.log("Get Password is required text " + passwordRequiredErrorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Password is required text " + passwordRequiredErrorMessage);
        return getTextFromElement(passwordRequiredErrorMessage);
    }

    public void verifyTheErrorMessagePasswordIsRequired(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getPasswordIsRequiredText()));
    }

    public String getConfirmPasswordIsRequiredText() {
        Reporter.log("Get Confirm Password is required text " + confirmPasswordRequiredErrorMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Confirm Password is required text " + confirmPasswordRequiredErrorMessage);
        return getTextFromElement(confirmPasswordRequiredErrorMessage);
    }

    public void verifyTheErrorMessageConfirmPasswordIsRequired(String expectedMessage) {
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getConfirmPasswordIsRequiredText()));
    }

    public String getRegistrationCompletedMessage() {
        Reporter.log("Get Registration completed message " + registrationCompletedMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Registration completed message " + registrationCompletedMessage);
        return getTextFromElement(registrationCompletedMessage);
    }

    public void verifyMessageYourRegistrationCompleted(String expectedMessage) {

        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getRegistrationCompletedMessage()));

    }
}
