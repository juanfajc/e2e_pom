package com.pageobjects;

import com.pageconstants.SignUpSuccessConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpSuccessPage {
    private WebDriver driver;

    @FindBy(xpath = SignUpSuccessConstants.LBL_SUCCESS)
    private WebElement lblSuccess;

    public SignUpSuccessPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblSuccess() {
        return lblSuccess;
    }
}
