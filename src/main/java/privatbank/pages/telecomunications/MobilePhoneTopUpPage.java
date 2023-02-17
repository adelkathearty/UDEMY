package privatbank.pages.telecomunications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import privatbank.pages.base.BasePage;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobilePhoneTopUpPage extends BasePage {

    public MobilePhoneTopUpPage(WebDriver driver) {
        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, 10);
    public final By buttonWallet = By.xpath("(//div[@data-qa-node='debitSourceSource'])[1]");

    public MobilePhoneTopUpPage selectCardFromWallet() {
        wait.until(ExpectedConditions.presenceOfElementLocated(buttonWallet)).click();

        return this;
    }
}
