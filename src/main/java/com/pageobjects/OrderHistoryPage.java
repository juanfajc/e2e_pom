package com.pageobjects;

import com.pageconstants.OrderHistoryConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage {
    private WebDriver driver;

    @FindBy(xpath = OrderHistoryConstants.LBL_EMPTY_ORDER)
    private WebElement lblEmptyOrder;

    @FindBy(xpath = OrderHistoryConstants.BTN_CONTINUE)
    private WebElement btnContinue;

    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLblEmptyOrder() {
        return lblEmptyOrder;
    }

    public WebElement getBtnContinue() {
        return btnContinue;
    }
}
