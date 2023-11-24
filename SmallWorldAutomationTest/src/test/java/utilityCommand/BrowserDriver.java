package utilityCommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserDriver {
    private static WebDriver driver;
    public static WebDriver initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
    public static void openLoginPage() {
        driver = initializeWebDriver();
        driver.get("https://www.saucedemo.com/");
    }
    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
}
