package com.pageobjects;

import com.pageconstants.SignUpFormConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpFormPage {
    private WebDriver driver;

    @FindBy(id = SignUpFormConstants.INPUT_FIRST_NAME)
    private WebElement inputFirstName;

    @FindBy(id = SignUpFormConstants.INPUT_LAST_NAME)
    private WebElement inputLastName;

    @FindBy(id = SignUpFormConstants.INPUT_EMAIL)
    private WebElement inputEmail;

    @FindBy(id = SignUpFormConstants.INPUT_PHONE)
    private WebElement inputPhone;

    @FindBy(id = SignUpFormConstants.INPUT_PASSWORD)
    private WebElement inputPassword;

    @FindBy(id = SignUpFormConstants.INPUT_PASSWORD_CONFIRM)
    private WebElement inputPasswordConfirm;

    @FindBy(xpath = SignUpFormConstants.CHK_PRIVACY)
    private WebElement chkPrivacy;

    @FindBy(xpath = SignUpFormConstants.BTN_CONTINUE)
    private WebElement btnContinue;

    @FindBy(className = SignUpFormConstants.LBL_ERROR_GENERAL)
    private WebElement lblErrorGeneral;

    @FindBy(xpath = SignUpFormConstants.LBL_ERROR_WRONG_EMAIL)
    private WebElement lblErrorWrongEmail;

    @FindBy(xpath = SignUpFormConstants.LBL_ERROR_MISMATCH_PASSWORD)
    private WebElement lblErrorMismatchPassword;

    public SignUpFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputFirstName() {
        return inputFirstName;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public WebElement getInputPhone() {
        return inputPhone;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getInputPasswordConfirm() {
        return inputPasswordConfirm;
    }

    public WebElement getChkPrivacy() {
        return chkPrivacy;
    }

    public WebElement getBtnContinue() {
        return btnContinue;
    }

    public WebElement getLblErrorGeneral() {
        return lblErrorGeneral;
    }

    public WebElement getLblErrorWrongEmail() {
        return lblErrorWrongEmail;
    }

    public WebElement getLblErrorMismatchPassword() {
        return lblErrorMismatchPassword;
    }
}
