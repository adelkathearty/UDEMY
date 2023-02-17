package privatbankstests.tests.loans.positive;

import org.junit.jupiter.api.Test;
import privatbank.pages.base.BasePage;
import privatbankstests.tests.base.BaseTest;

import static privatbank.constants.Constants.Urls.CAR_LOANS_URL;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    public void selectAgreementsTabInPublicSession() {
        basePage.goTourl(CAR_LOANS_URL);
        carLoansPage.selectAgreemetsTab();
        basePage.isAuthWidgetPresent();
    }
}
