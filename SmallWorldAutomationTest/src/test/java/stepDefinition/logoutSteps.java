package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.homePage;
import utilityCommand.BrowserDriver;

public class logoutSteps {
    private homePage homePage;

    @Given("user navigates to login")
    public void user_navigates_to_login() {
        BrowserDriver.openLoginPage();
        homePage = new homePage(BrowserDriver.getDriver());
    }

    @When("user enter valid username {string} and password {string}")
    public void enterValidUsernameAndPassword(String username, String password) {
        homePage.enterUsername(username);
        homePage.enterPassword(password);
    }

    @And("clicks on the login button")
    public void clickOnTheLoginButton() {
        homePage.clickLoginButton();
    }

    @And("user clicks on burger menu button")
    public void user_clicks_on_burger_menu_button() {
        homePage.clickBurgerMenu();
    }

    @And("clicks on logout")
    public void clickOnLogout() {
        homePage.clickLogoutButton();
    }

    @Then("user should be logged out successfully")
    public void assertSuccessfulLogout() {
        String expectedUrl = "https://www.saucedemo.com/";
        Assert.assertEquals("URL redirection after successful logout is incorrect", expectedUrl, BrowserDriver.getDriver().getCurrentUrl());
        BrowserDriver.closeDriver();
    }
}
