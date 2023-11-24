package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.loginPage;
import utilityCommand.BrowserDriver;

public class loginSteps {
    private loginPage loginPage;

    @Given("user navigates to login")
    public void user_navigates_to_login() {
        BrowserDriver.openLoginPage();
        loginPage = new loginPage(BrowserDriver.getDriver());
    }

    @When("user enter valid username {string} and password {string}")
    public void enterValidUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("user enter invalid username {string} and password {string}")
    public void enterInvalidUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("clicks on the login button")
    public void clickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("user should be redirected to the home page")
    public void assertHomePageRedirection() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals("URL redirection after successful login is incorrect", expectedUrl, BrowserDriver.getDriver().getCurrentUrl());
        BrowserDriver.closeDriver();
    }

    @Then("user should see an error message {string}")
    public void assertErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals("Incorrect error message displayed", expectedErrorMessage, actualErrorMessage);
        BrowserDriver.closeDriver();
    }
}

