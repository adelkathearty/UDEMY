package visatest.BasePageTest;

import org.junit.jupiter.api.Test;
import visatest.base.VisaBaseTest;
import vietnamvisa.Page.BasePageVisa.BasePageVisa;
import static vietnamvisa.Constants.VisaConstants.Urls.CONFIRMATION_PAGE;

public class BasePageTest extends VisaBaseTest {
    @Test

    public void testPage() {

        BasePageVisa.visitUrl(CONFIRMATION_PAGE);
        BasePageVisa.pressConfirm();
        BasePageVisa.pressNext();

    }
}


