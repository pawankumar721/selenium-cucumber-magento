package com.magento.stepdefinitaions;
import com.magento.SignUpPage;
import com.magento.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SignUpSteps {
    WebDriver driver = new ChromeDriver();
    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("I am on the Sign-Up page")
    public void i_am_on_the_sign_up_page() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    @When("I enter {string} as first name, {string} as last name, {string} as email, and {string} as password")
    public void i_enter_details(String firstName, String lastName, String email, String password) {
        signUpPage.enterFirstName(firstName);
        signUpPage.enterLastName(lastName);
        signUpPage.enterEmail(email);
        signUpPage.enterPassword(password);
        signUpPage.enterConfirmPassword(password);
    }

    @When("I click on the Create an Account button")
    public void i_click_on_the_create_an_account_button() {
        signUpPage.clickSignUpButton();
    }

    @Then("I should see a confirmation message")
    public void i_should_see_a_confirmation_message() {
        // Validate successful account creation
    }
}
