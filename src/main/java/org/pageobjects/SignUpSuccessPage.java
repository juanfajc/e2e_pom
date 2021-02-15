package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUpSuccessPage {
    private WebDriver driver;

    private By lblSuccessBy = By.xpath("//h1[contains(., 'Your Account Has Been Created')]");

    public SignUpSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblSuccess() {
        return driver.findElement(lblSuccessBy);
    }
}
