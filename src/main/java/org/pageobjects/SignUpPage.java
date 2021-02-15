package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    private WebDriver driver;

    private By privacyCheckBoxBy = By.xpath("//input[@type='checkbox' and @name='agree']");
    private By continueBtnBy = By.xpath("//input[@value='Continue']");
    private By inputFirstNameBy = By.id("input-firstname");
    private By inputLastNameBy = By.id("input-lastname");
    private By inputEmailBy = By.id("input-email");
    private By inputPhoneBy = By.id("input-telephone");
    private By inputPasswordBy = By.id("input-password");
    private By inputPasswordConfirmBy = By.id("input-confirm");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getPrivacyCheckBox() {

        return driver.findElement(privacyCheckBoxBy);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtnBy);
    }

    public WebElement getInputFirstName() {
        return driver.findElement(inputFirstNameBy);
    }

    public WebElement getInputLastName() {

        return driver.findElement(inputLastNameBy);
    }

    public WebElement getInputEmail() {

        return driver.findElement(inputEmailBy);
    }

    public WebElement getInputPhone() {

        return driver.findElement(inputPhoneBy);
    }

    public WebElement getInputPassword() {

        return driver.findElement(inputPasswordBy);
    }

    public WebElement getInputPasswordConfirm() {
        return driver.findElement(inputPasswordConfirmBy);
    }

}
