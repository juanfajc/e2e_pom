package com.pageobjects;

import com.pageconstants.NewsLetterConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewsletterPage {
    private WebDriver driver;

    @FindBy(xpath = NewsLetterConstants.RB_LIST)
    private List<WebElement> rbList;

    @FindBy(xpath = NewsLetterConstants.BTN_CONTINUE)
    private WebElement btnContinue;

    public NewsletterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getBtnContinue() {
        return btnContinue;
    }

    public void changeNewsletter() {
        if (rbList.get(0).isSelected()) {
            rbList.get(1).click();
        } else if (rbList.get(1).isSelected()) {
            rbList.get(0).click();
        }
    }
}
