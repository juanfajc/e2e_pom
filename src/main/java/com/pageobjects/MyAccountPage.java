package com.pageobjects;

import com.pageconstants.MyAccountConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    private WebDriver driver;

    @FindBy(linkText = MyAccountConstants.LBL_YOUR_STORE)
    private WebElement lblYourStore;

    @FindBy(linkText = MyAccountConstants.LINK_EDIT_ACCOUNT)
    private WebElement linkEditAccount;

    @FindBy(linkText = MyAccountConstants.LINK_CHANGE_PASSWORD)
    private WebElement linkChangePassword;

    @FindBy(linkText = MyAccountConstants.LINK_MODIFY_ADDRESS_BOOK)
    private WebElement linkModifyAddressBook;

    @FindBy(linkText = MyAccountConstants.LINK_MODIFY_WISHLIST)
    private WebElement linkModifyWishlist;

    @FindBy(linkText = MyAccountConstants.LINK_ORDER_HISTORY)
    private WebElement linkOrderHistory;

    @FindBy(linkText = MyAccountConstants.LINK_NEWSLETTER)
    private WebElement linkNewsletter;

    @FindBy(xpath = MyAccountConstants.LBL_SUCCESS_EDIT)
    private WebElement lblSuccessEdit;

    @FindBy(xpath = MyAccountConstants.LBL_SUCCESS_NEWSLETTER)
    private WebElement lblSuccessNewsLetter;


    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblYourStore() {
        return lblYourStore;
    }

    public WebElement getLinkEditAccount() {
        return linkEditAccount;
    }

    public WebElement getLinkChangePassword() {
        return linkChangePassword;
    }

    public WebElement getLinkModifyAddressBook() {
        return linkModifyAddressBook;
    }

    public WebElement getLinkModifyWishlist() {
        return linkModifyWishlist;
    }

    public WebElement getLinkOrderHistory() {
        return linkOrderHistory;
    }

    public WebElement getLinkNewsletter() {
        return linkNewsletter;
    }

    public WebElement getLblSuccessEdit() {
        return lblSuccessEdit;
    }

    public WebElement getLblSuccessNewsLetter() {
        return lblSuccessNewsLetter;
    }
}
