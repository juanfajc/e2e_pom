package com.pageobjects;

import com.pageconstants.MainConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = MainConstants.BTN_MY_ACCOUNT)
    private WebElement btnMyAccount;

    @FindBy(xpath = MainConstants.BTN_LOGIN)
    private WebElement btnLogin;

    @FindBy(xpath = MainConstants.BTN_REGISTER)
    private WebElement btnRegister;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getBtnMyAccount() {
        return btnMyAccount;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getBtnRegister() {
        return btnRegister;
    }

    public String getURL() {
        return MainConstants.URL;
    }
}
