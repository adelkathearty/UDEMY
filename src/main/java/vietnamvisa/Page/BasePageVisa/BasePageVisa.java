package vietnamvisa.Page.BasePageVisa;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePageVisa {

    public WebDriver driver;

    public BasePageVisa(WebDriver driver) {
        this.driver = driver;
    }

    public void visitUrl(String url) {
        driver.get(url);
    }

    public final By confirmButton = By.xpath("(//div)[28]");

    public final By nextButton = By.xpath("(//button[normalize-space()='Next'])[1]");

    public BasePageVisa pressConfirm() {
        driver.findElement(confirmButton).click();
        return this;
    }

    public BasePageVisa pressNext() {
        driver.findElement(nextButton).click();
        driver.navigate().refresh();
        return this;
    }

}
