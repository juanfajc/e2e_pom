package com.opencart.accounttests;

import com.dataprovider.LoginDataProvider;
import com.dataprovider.SignUpDataProvider;
import com.opencart.Base;
import com.opencart.common.AccountCommons;
import com.pageobjects.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyAccount extends Base {
    private AccountCommons accountCommons;
    private SignUpSuccessPage signUpSuccessPage;
    private MyAccountPage myAccountPage;
    private WishlistPage wishlistPage;
    private EditAccountInfoFormPage editAccountInfoFormPage;
    private OrderHistoryPage orderHistoryPage;
    private NewsletterPage newsletterPage;

    @BeforeTest(alwaysRun = true)
    public void initialize() {
        driver = initializeDriver();
        //instantiate pom objects
        signUpSuccessPage = new SignUpSuccessPage(driver);
        myAccountPage = new MyAccountPage(driver);
        wishlistPage = new WishlistPage(driver);
        editAccountInfoFormPage = new EditAccountInfoFormPage(driver);
        orderHistoryPage = new OrderHistoryPage(driver);
        newsletterPage = new NewsletterPage(driver);
        //instantiate account commons
        accountCommons = new AccountCommons(driver);
    }

    @Test(dataProvider = "test user", dataProviderClass = LoginDataProvider.class)
    public void testLogin(String username, String password) {
        accountCommons.login(username, password);
    }

    @Test(dependsOnMethods = "testLogin")
    public void testAccountElements() {
        //1. A message "Your Store" must be displayed at the top of the page.
        Assert.assertEquals(true, myAccountPage.getLblYourStore().isDisplayed());
        //1. A left menu must be displayed with the following items:
        //Edit your account information
        Assert.assertEquals(true, myAccountPage.getLinkEditAccount().isDisplayed());
        //Change your password
        Assert.assertEquals(true, myAccountPage.getLinkChangePassword().isDisplayed());
        //Modify your address book entries
        Assert.assertEquals(true, myAccountPage.getLinkModifyAddressBook().isDisplayed());
        //Modify your wish list
        Assert.assertEquals(true, myAccountPage.getLinkModifyWishlist().isDisplayed());
    }

    @Test(dependsOnMethods = "testLogin")
    public void testEmptyWishList() {
        //1. Click on Wishlist
        myAccountPage.getLinkModifyWishlist().click();
        //1. A message:  "Your wish list is empty." is displayed
        Assert.assertEquals(true, wishlistPage.getLblWishListEmpty().isDisplayed());
        //return to the my account page
        wishlistPage.getBtnContinue().click();
    }

    @Test(dependsOnMethods = "testLogin", dataProvider = "edit valid info", dataProviderClass = SignUpDataProvider.class)
    public void testEditSuccessMessage(String firstname, String lastName, String phone) {
        //1. Click on "Edit your account information"
        myAccountPage.getLinkEditAccount().click();
        //2. Edit any field with valid data
        editAccountInfoFormPage.getInputFirstName().clear();
        editAccountInfoFormPage.getInputFirstName().sendKeys(firstname);
        editAccountInfoFormPage.getInputLastName().clear();
        editAccountInfoFormPage.getInputLastName().sendKeys(lastName);
        editAccountInfoFormPage.getInputPhone().clear();
        editAccountInfoFormPage.getInputPhone().sendKeys(phone);
        //3. Click on continue
        editAccountInfoFormPage.getBtnContinue().click();
        //3. Redirects to "My Account"
        Assert.assertEquals(true, myAccountPage.getLblYourStore().isDisplayed());
        Assert.assertEquals(true, myAccountPage.getLinkEditAccount().isDisplayed());
        //3. Message text: "Success: Your account has been successfully updated." is displayed
        Assert.assertEquals(true, myAccountPage.getLblSuccessEdit().isDisplayed());
    }

    @Test(dependsOnMethods = "testLogin", dataProvider = "missing at email info edit", dataProviderClass = SignUpDataProvider.class)
    public void testEditMissingAtEmailMessage(String email) {
        //1. Click on Edit
        myAccountPage.getLinkEditAccount().click();
        //2. Edit email with invalid data
        editAccountInfoFormPage.getInputEmail().clear();
        editAccountInfoFormPage.getInputEmail().sendKeys(email);
        //3. Click on continue
        editAccountInfoFormPage.getBtnContinue().click();
        //3. Message displayed: Please include @ in the email address.
        //return to the my account page
        editAccountInfoFormPage.getBtnBack().click();
    }

    @Test(dependsOnMethods = "testLogin", dataProvider = "missing dot com info edit", dataProviderClass = SignUpDataProvider.class)
    public void testEditMissingDotComEmailMessage(String email) {
        //1. Click on Edit
        myAccountPage.getLinkEditAccount().click();
        //2. Edit email with invalid data
        editAccountInfoFormPage.getInputEmail().clear();
        editAccountInfoFormPage.getInputEmail().sendKeys(email);
        //3. Click on continue
        editAccountInfoFormPage.getBtnContinue().click();
        //3. Message displayed: Please include @ in the email address.
        Assert.assertEquals(true, editAccountInfoFormPage.getLblErrorWrongEmail().isDisplayed());
        //return to the my account page
        editAccountInfoFormPage.getBtnBack().click();
    }

    @Test(dependsOnMethods = "testLogin")
    public void testEmptyOrderHistory() {
        //1. Click on "Order History"
        myAccountPage.getLinkOrderHistory().click();
        //2. A message: "You have not made any previous orders!" is displayed
        Assert.assertEquals(true, orderHistoryPage.getLblEmptyOrder().isDisplayed());
        //return to the my account page
        orderHistoryPage.getBtnContinue().click();
    }

    @Test(dependsOnMethods = "testLogin")
    public void testNewsletterSubscription() {
        //1. Click on "Newsletter"
        myAccountPage.getLinkNewsletter().click();
        //2. Toggle newsletter subscription
        newsletterPage.changeNewsletter();
        newsletterPage.getBtnContinue().click();
        //2. Redirects to "My Account"
        Assert.assertEquals(true, myAccountPage.getLblYourStore().isDisplayed());
        Assert.assertEquals(true, myAccountPage.getLinkEditAccount().isDisplayed());
        //2. message" Success: Your newsletter subscription has been successfully updated!" is displayed
        Assert.assertEquals(true, myAccountPage.getLblSuccessNewsLetter().isDisplayed());
    }

    @AfterTest
    public void closeDriver() {
        driver.close();
    }
}
