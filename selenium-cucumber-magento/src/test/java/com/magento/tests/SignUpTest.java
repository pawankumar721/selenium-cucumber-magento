package com.magento.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.magento.LoginPage;

public class SignUpTest {
    @Test
    public void testLogin() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("pawan.kumar@testing.com");
        loginPage.enterPassword("Password123");
        loginPage.clickSignInButton();
        // Validate successful login
    }
}