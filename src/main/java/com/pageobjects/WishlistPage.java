package com.pageobjects;

import com.pageconstants.WishListConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
    private WebDriver driver;

    @FindBy(xpath = WishListConstants.LBL_WISHLIST_EMPTY)
    private WebElement lblWishListEmpty;

    @FindBy(xpath = WishListConstants.BTN_CONTINUE)
    private WebElement btnContinue;

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblWishListEmpty() {
        return lblWishListEmpty;
    }

    public WebElement getBtnContinue() {
        return btnContinue;
    }
}
