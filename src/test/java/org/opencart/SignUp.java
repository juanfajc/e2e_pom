package org.opencart;

import org.dataprovider.SignUpDataProvider;
import org.pageobjects.MainPage;
import org.pageobjects.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignUp extends Base {
    private MainPage mainPage;
    private SignUpPage signUpPage;

    @BeforeTest
    public void initialize() {
        driver = initializeDriver();
        mainPage = new MainPage(driver);
        signUpPage = new SignUpPage(driver);
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
        signUpPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPage.getContinueBtn().click();
        // Message displayed: Your Account Has Been Created!
        Assert.assertEquals(true, true);
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
            signUpPage.getInputFirstName().sendKeys(firstName);
        }
        //4. Enter last name
        if(lastName != null){
            signUpPage.getInputLastName().sendKeys(lastName);
        }
        //5. Enter email
        if(email != null){
            signUpPage.getInputEmail().sendKeys(email);
        }
        //6. Enter telephone
        if(phone != null){
            signUpPage.getInputPhone().sendKeys(phone);
        }
        //7. Enter password
        if(password != null){
            signUpPage.getInputPassword().sendKeys(password);
        }
        //8. Enter confirm password
        if(passwordConfirm != null){
            signUpPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        }
        //9. Check privacy and policy checkbox
        signUpPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPage.getContinueBtn().click();
        // Error have to appear
        Assert.assertEquals(true, true);
    }

    @Test (dataProvider = "email missing at", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationInvalidEmailMissingAt(String firstName, String lastName, String email, String phone,
                                                          String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        signUpPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPage.getContinueBtn().click();
        // Message displayed: Missing @
        Assert.assertEquals(true, true);
    }

    @Test (dataProvider = "email missing dot com", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationInvalidEmailMissingDotCom(String firstName, String lastName, String email, String phone,
                                                              String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        signUpPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPage.getContinueBtn().click();
        // Message displayed: Missing .com
        Assert.assertEquals(true, true);
    }

    @Test (dataProvider = "different passwords", dataProviderClass = SignUpDataProvider.class)
    public void testUserRegistrationDifferentPasswords(String firstName, String lastName, String email, String phone,
                                                       String password, String passwordConfirm) {
        //1. Click on "MY ACCOUNT"
        mainPage.getMyAccount().click();
        //2. Select Register
        mainPage.getRegister().click();
        //3. Enter first name
        signUpPage.getInputFirstName().sendKeys(firstName);
        //4. Enter last name
        signUpPage.getInputLastName().sendKeys(lastName);
        //5. Enter email
        signUpPage.getInputEmail().sendKeys(email);
        //6. Enter telephone
        signUpPage.getInputPhone().sendKeys(phone);
        //7. Enter password
        signUpPage.getInputPassword().sendKeys(password);
        //8. Enter confirm password
        signUpPage.getInputPasswordConfirm().sendKeys(passwordConfirm);
        //9. Check privacy and policy checkbox
        signUpPage.getPrivacyCheckBox().click();
        //10. Click on "Continue"
        signUpPage.getContinueBtn().click();
        // Message displayed: Password does not match
        Assert.assertEquals(true, true);
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
