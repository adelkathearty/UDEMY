package privatbankstests.tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import privatbankstests.tests.base.BaseTest;

import static privatbank.constants.Constants.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneTopUpPositiveTest extends BaseTest {
    @Test
    public void checkIsRedirectToAuth() {
        basePage.goTourl(MOBILE_PAYMENT_URL);
        MobilePhoneTopUpPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();

    }
}
