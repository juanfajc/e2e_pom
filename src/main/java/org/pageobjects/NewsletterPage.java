package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class NewsletterPage {
    private WebDriver driver;

    private By listRdBtnBy = By.xpath("//input[@type='radio']");
    private By continueBtnBy = By.xpath("//input[@value='Continue']");

    public NewsletterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(continueBtnBy);
    }

    public void changeNewsletter(){
        List<WebElement> rdbtnList = driver.findElements(listRdBtnBy);
        if(rdbtnList.get(0).isSelected()){
            rdbtnList.get(1).click();
        } else if (rdbtnList.get(1).isSelected()){
            rdbtnList.get(0).click();
        }
    }
}
