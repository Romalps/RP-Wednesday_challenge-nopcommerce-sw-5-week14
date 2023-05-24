package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
            WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
WebElement invalidLoginMessage;
    public void enterEmail(String email){
        Reporter.log("Enter Email "+email.toString());
        CustomListeners.test.log(Status.PASS,"Enter Email "+email);
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        Reporter.log("Enter Password "+password.toString());
        CustomListeners.test.log(Status.PASS,"Enter Password "+password);
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        Reporter.log("Click on Login Button "+loginButton.toString());
        CustomListeners.test.log(Status.PASS,"Click on Login Button "+loginButton);
        clickOnElement(loginButton);
    }
    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
public void verifyThatWelcomePleaseSignInMessageIsDisplay(String expectedMessage){
    Assert.assertTrue(expectedMessage.equalsIgnoreCase(getWelcomeText()));
}
public String getLoginUnsuccessfulErrorMessage(){
        return getTextFromElement(invalidLoginMessage);
}
public void verifyLoginUnsuccessfulErrorMessage(String expectedMessage){
        Assert.assertTrue(expectedMessage.equalsIgnoreCase(getLoginUnsuccessfulErrorMessage()));
}


}
