package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {
    private WebDriver driver;

    private By lblEmptyOrderBy = By.xpath("//p[text()='You have not made any previous orders!']");
    private By continueBtnBy = By.xpath("//a[text()='Continue']");

    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblEmptyOrder () {
        return driver.findElement(lblEmptyOrderBy);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtnBy);
    }
}
