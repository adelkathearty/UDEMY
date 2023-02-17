package privatbank.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static privatbank.constants.Constants.TimeoutVariables.EXPLICITLY_WAIT;


public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public final By authWidget = By.xpath("//form[@action='/']");

    public void goTourl(String url) {
        driver.get(url);
    }

    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICITLY_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

    public void isAuthWidgetPresent() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(authWidget));
    }
}
