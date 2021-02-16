package com.pageobjects;

import com.pageconstants.EditAccountInfoFormConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountInfoFormPage {
    private WebDriver driver;

    @FindBy(id = EditAccountInfoFormConstants.INPUT_FIRST_NAME)
    private WebElement inputFirstName;

    @FindBy(id = EditAccountInfoFormConstants.INPUT_LAST_NAME)
    private WebElement inputLastName;

    @FindBy(id = EditAccountInfoFormConstants.INPUT_EMAIL)
    private WebElement inputEmail;

    @FindBy(id = EditAccountInfoFormConstants.INPUT_PHONE)
    private WebElement inputPhone;

    @FindBy(xpath = EditAccountInfoFormConstants.BTN_CONTINUE)
    private WebElement btnContinue;

    @FindBy(xpath = EditAccountInfoFormConstants.BTN_BACK)
    private WebElement btnBack;

    @FindBy(xpath = EditAccountInfoFormConstants.LBL_ERROR_WRONG_EMAIL)
    private WebElement lblErrorWrongEmail;

    public EditAccountInfoFormPage(WebDriver driver) {
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

    public WebElement getBtnContinue() {
        return btnContinue;
    }

    public WebElement getBtnBack() {
        return btnBack;
    }

    public WebElement getLblErrorWrongEmail() {
        return lblErrorWrongEmail;
    }
}
