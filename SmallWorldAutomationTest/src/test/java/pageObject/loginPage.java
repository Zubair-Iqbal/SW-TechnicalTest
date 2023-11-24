package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    private final WebDriver driver;
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement getUsernameField() {
        return driver.findElement(By.id("user-name"));
    }
    private WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }
    private WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }
    private WebElement getErrorMessageElement() {
        return driver.findElement(By.cssSelector("h3[data-test='error']"));
    }
    public void enterUsername(String username) {
        getUsernameField().sendKeys(username);
    }
    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }
    public void clickLoginButton() {
        getLoginButton().click();
    }
    public String getErrorMessage() {
        return getErrorMessageElement().getText();
    }
}
