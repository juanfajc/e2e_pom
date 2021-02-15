package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    private WebDriver driver;

    private By lblYourStoreBy = By.linkText("Your Store");
    private By linkEditAccountBy = By.linkText("Edit your account information");
    private By linkChangePasswordBy = By.linkText("Change your password");
    private By linkModifyAddressBookBy = By.linkText("Modify your address book entries");
    private By linkModifyWishListBy = By.linkText("Modify your wish list");
    private By successEditMessageBy = By.xpath("//div[contains(@class, 'alert-success') and contains(., 'Success: Your account has been successfully updated.')]");
    private By successNewsletterMessageBy = By.xpath("//div[contains(@class, 'alert-success') and contains(., 'Success: Your newsletter subscription has been successfully updated!')]");
    private By linkOrderHistoryBy = By.linkText("View your order history");
    private By linkNewsletterBy = By.linkText("Subscribe / unsubscribe to newsletter");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblYourStore() {
        return driver.findElement(lblYourStoreBy);
    }

    public WebElement getLinkEditAccount() {
        return driver.findElement(linkEditAccountBy);
    }

    public WebElement getLinkChangePassword() {
        return driver.findElement(linkChangePasswordBy);
    }

    public WebElement getLinkModifyAddressBook() {
        return driver.findElement(linkModifyAddressBookBy);
    }

    public WebElement getLinkModifyWishList() {
        return driver.findElement(linkModifyWishListBy);
    }

    public WebElement getSuccessEditMessage() {
        return driver.findElement(successEditMessageBy);
    }

    public WebElement getSuccessNewsletterMessage() {
        return driver.findElement(successNewsletterMessageBy);
    }

    public WebElement getLinkOrderHistory(){
        return driver.findElement(linkOrderHistoryBy);
    }

    public WebElement getLinkNewsLetterBy(){
        return driver.findElement(linkNewsletterBy);
    }
}
