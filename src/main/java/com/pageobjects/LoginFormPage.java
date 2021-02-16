package com.pageobjects;

import com.pageconstants.LoginFormConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFormPage {
    private WebDriver driver;

    @FindBy(id = LoginFormConstants.INPUT_USERNAME)
    private WebElement inputUsername;

    @FindBy(id = LoginFormConstants.INPUT_PASSWORD)
    private WebElement inputPassword;

    @FindBy(xpath = LoginFormConstants.BTN_LOGIN)
    private WebElement btnLogin;

    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputUsername() {
        return inputUsername;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }
}
