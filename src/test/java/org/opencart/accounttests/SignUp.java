package org.opencart.accounttests;

import org.dataprovider.SignUpDataProvider;
import org.opencart.Base;
import org.pageobjects.MainPage;
import org.pageobjects.SignUpFormPage;
import org.pageobjects.SignUpSuccessPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp extends Base {
    private MainPage mainPage;
    private SignUpFormPage signUpPageFormPage;
    private SignUpSuccessPage signUpSuccessPage;

    @BeforeTest
    public void initialize() {
        driver = initializeDriver();
        //instantiate pom objects
        mainPage = new MainPage(driver);
        signUpPageFormPage = new SignUpFormPage(driver);
        signUpSuccessPage = new SignUpSuccessPage(driver);
        //we go to the URL
        driver.get(mainPage.getURL());
    }

    @Test (dataProvider = "valid data", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationValidData(String firstName, String lastName, String email, String phone,
                                              String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        signUpPageFormPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPageFormPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPageFormPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPageFormPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPageFormPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPageFormPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPageFormPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPageFormPage.getContinueBtn().click();
        // Message displayed: Your Account Has Been Created!
        Assert.assertEquals(true, signUpSuccessPage.getLblSuccess().isDisplayed());
    }

    @Test (dataProvider = "missing fields", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationMissingField(String firstName, String lastName, String email, String phone,
                                                 String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        if(firstName != null){
            signUpPageFormPage.getInputFirstName().sendKeys(firstName);
        }
        //4. Enter last name
        if(lastName != null){
            signUpPageFormPage.getInputLastName().sendKeys(lastName);
        }
        //5. Enter email
        if(email != null){
            signUpPageFormPage.getInputEmail().sendKeys(email);
        }
        //6. Enter telephone
        if(phone != null){
            signUpPageFormPage.getInputPhone().sendKeys(phone);
        }
        //7. Enter password
        if(password != null){
            signUpPageFormPage.getInputPassword().sendKeys(password);
        }
        //8. Enter confirm password
        if(passwordConfirm != null){
            signUpPageFormPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        }
        //9. Check privacy and policy checkbox
        signUpPageFormPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPageFormPage.getContinueBtn().click();
        // Error have to appear
        Assert.assertEquals(true, signUpPageFormPage.getLblAnyError().isDisplayed());
    }

    @Test (dataProvider = "email missing at", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationInvalidEmailMissingAt(String firstName, String lastName, String email, String phone,
                                                          String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        signUpPageFormPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPageFormPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPageFormPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPageFormPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPageFormPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPageFormPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPageFormPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPageFormPage.getContinueBtn().click();
        // Message displayed: Missing @

    }

    @Test (dataProvider = "email missing dot com", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationInvalidEmailMissingDotCom(String firstName, String lastName, String email, String phone,
                                                              String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        signUpPageFormPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPageFormPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPageFormPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPageFormPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPageFormPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPageFormPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPageFormPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPageFormPage.getContinueBtn().click();
        // Message displayed: Missing .com
        Assert.assertEquals(true, signUpPageFormPage.getLblEmailError().isDisplayed());
    }

    @Test (dataProvider = "different passwords", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationDifferentPasswords(String firstName, String lastName, String email, String phone,
                                                       String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        signUpPageFormPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPageFormPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPageFormPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPageFormPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPageFormPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPageFormPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPageFormPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPageFormPage.getContinueBtn().click();
        // Message displayed: Password does not match
        Assert.assertEquals(true, signUpPageFormPage.getLblMismatchPasswordError().isDisplayed());
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
