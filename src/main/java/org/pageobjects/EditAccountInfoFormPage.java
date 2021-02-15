package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class EditAccountInfoFormPage {
        private WebDriver driver;

        private By continueBtnBy = By.xpath("//input[@value='Continue']");
        private By inputFirstNameBy = By.id("input-firstname");
        private By inputLastNameBy = By.id("input-lastname");
        private By inputEmailBy = By.id("input-email");
        private By inputPhoneBy = By.id("input-telephone");
        private By lblWrongEmailBy = By.xpath("//div[@class='text-danger' and contains(. ,'E-Mail Address does not appear to be valid')]");

        public EditAccountInfoFormPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
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

        public WebElement getLblWrongEmailBy(){
            return driver.findElement(lblWrongEmailBy);
        }
}
