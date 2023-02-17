package visatest.FormPageVisaTest;

import org.junit.jupiter.api.Test;
import visatest.base.VisaBaseTest;
import vietnamvisa.Page.BasePageVisa.BasePageVisa;
import vietnamvisa.Page.FormPageVisa.FormPageVisa;

import static vietnamvisa.Constants.VisaConstants.Urls.CONFIRMATION_PAGE;

public class FormPageVisaTest extends VisaBaseTest {

    @Test


    public void fillForm() {

        BasePageVisa.visitUrl(CONFIRMATION_PAGE);
        BasePageVisa.pressConfirm();
        BasePageVisa.pressNext();
        FormPageVisa.enterName();
        FormPageVisa.enterDate();
        FormPageVisa.chooseGenderMale();
        FormPageVisa.chooseNationality();
        FormPageVisa.enterReligion();
//        FormPageVisa.inputFacePhoto();
//        FormPageVisa.inputPassportPhoto();

    }
}
