package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class homePage {
    private final WebDriver driver;
    public homePage(WebDriver driver) {
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
    private WebElement getBurgerMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
    }
    private WebElement getLogoutButton() {
        return driver.findElement(By.id("logout_sidebar_link"));
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
    public void clickBurgerMenu() {
        getBurgerMenu().click();
    }
    public void clickLogoutButton() {
        getLogoutButton().click();
    }
}
