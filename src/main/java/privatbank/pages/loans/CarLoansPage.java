package privatbank.pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {

    WebDriver driver;

    public CarLoansPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By tabAgreements = By.xpath("(//div[@class='item_ryTYvf_Qfl'])[1]");

    public CarLoansPage selectAgreemetsTab() {
        driver.findElement(tabAgreements).click();
        return this;
    }
}
