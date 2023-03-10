package visatest.base;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import vietnamvisa.Common.VisaCommonActions;
import vietnamvisa.Common.VisaConfig;
import vietnamvisa.Page.BasePageVisa.BasePageVisa;
import vietnamvisa.Page.FormPageVisa.FormPageVisa;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class VisaBaseTest {
    protected WebDriver driver = VisaCommonActions.createDriver();

    protected BasePageVisa BasePageVisa = new BasePageVisa(driver);
    protected FormPageVisa FormPageVisa = new FormPageVisa(driver);



    @AfterEach
    void cleanCookiesAndLocalStorage() {
        if (VisaConfig.CLEAR_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }

    }

    @AfterAll
    void close() {
        if (!VisaConfig.HOLD_BROWSER_OPEN) {
            driver.close();
        }
    }

}
