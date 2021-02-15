package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
    private WebDriver driver;

    private By lblWishlistBy = By.xpath("//p[text()='Your wish list is empty.']");

    public WishlistPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblWishlist () {
        return driver.findElement(lblWishlistBy);
    }
}
