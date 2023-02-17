package qatoolstests.base.forms;

import org.junit.jupiter.api.Test;
import qatoolstests.base.BaseTestQA;
import qatools.pages.base.forms.FormsPageQA;
import qatools.pages.base.elements.ElementsPageQA;

import java.text.Format;

import static qatools.constants.ConstantsQA.Urls.FORMS_URL;


public class FormPageTestQA extends BaseTestQA {
    @Test
    public void testFormsPage() {
        FormsPageQA.visitUrl(FORMS_URL);
        FormsPageQA.enterFirstName();
        FormsPageQA.enterLastName();
        FormsPageQA.enterEmail();
        FormsPageQA.selectGender();
        FormsPageQA.enterMobileNumber();
        FormsPageQA.enterBirthDate();
//        FormsPageQA.chooseSubjects();    ELEMENT IS NOT INTERACTABLE
        FormsPageQA.chooseHobby();
        FormsPageQA.uploadPic();
        FormsPageQA.inputAddress();
        FormsPageQA.selectState();

    }
}



