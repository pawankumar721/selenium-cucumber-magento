package com.magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By email = By.id("email");
    By password = By.id("pass");
    By signInButton = By.id("send2");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String emailId) {
        driver.findElement(email).sendKeys(emailId);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }
}
