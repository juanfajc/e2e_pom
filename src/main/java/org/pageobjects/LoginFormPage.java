package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginFormPage {
    private WebDriver driver;

    private By inputUsernameBy = By.id("input-email");
    private By inputPasswordBy = By.id("input-password");
    private By btnLogin = By.xpath("//input[@value='Login']");

    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputUsername(){
        return driver.findElement(inputUsernameBy);
    }

    public WebElement getInputPassword(){
        return driver.findElement(inputPasswordBy);
    }

    public WebElement getBtnLogin(){
        return driver.findElement(btnLogin);
    }
}
