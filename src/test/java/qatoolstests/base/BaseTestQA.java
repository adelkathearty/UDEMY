package qatoolstests.base;

import qatools.common.CommonActionsQA;
import qatools.pages.base.elements.ElementsPageQA;
import qatools.pages.base.forms.FormsPageQA;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static qatools.common.ConfigQA.CLEAR_COOKIES;
import static qatools.common.ConfigQA.HOLD_BROWSER_OPEN;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTestQA {

    protected WebDriver driver = CommonActionsQA.createDriver();
    protected ElementsPageQA ElementsPageQA = new ElementsPageQA(driver);
    protected FormsPageQA FormsPageQA = new FormsPageQA(driver);

    @AfterEach
    void cleanCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }

    }

    @AfterAll
    void close() {
        if (!HOLD_BROWSER_OPEN) {
            driver.close();
        }
    }
}
