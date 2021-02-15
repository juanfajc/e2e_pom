package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    private By myAccountBy = By.xpath("//a[@title = 'My Account']");
    private By registerBy = By.xpath("//a[contains(., 'Register')]");
    private By loginBy = By.xpath("//a[contains(., 'Login')]");
    private String URL = "https://demo.opencart.com/";

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getMyAccount() {
        return driver.findElement(myAccountBy);
    }

    public WebElement getRegister() {
        return driver.findElement(registerBy);
    }

    public WebElement getLogin() {
        return driver.findElement(loginBy);
    }

    public String getURL() {
        return URL;
    }
}
