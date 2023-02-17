package privatbankstests.tests.base;

import privatbank.common.CommonActions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import privatbank.pages.base.BasePage;
import privatbank.pages.loans.CarLoansPage;
import privatbank.pages.telecomunications.MobilePhoneTopUpPage;
import privatbankstests.tests.loans.positive.CarLoansPositiveTest;

import static privatbank.common.Config.CLEAR_COOKIES;
import static privatbank.common.Config.HOLD_BROWSER_OPEN;


//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CarLoansPage carLoansPage = new CarLoansPage(driver);
    protected MobilePhoneTopUpPage MobilePhoneTopUpPage = new MobilePhoneTopUpPage(driver);

//    protected CarLoansPositiveTest CarLoansPositiveTest = new CarLoansPositiveTest(driver);

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
