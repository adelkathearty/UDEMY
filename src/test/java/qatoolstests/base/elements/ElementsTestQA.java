package qatoolstests.base.elements;

import org.junit.jupiter.api.Test;
import qatoolstests.base.BaseTestQA;
import qatools.pages.base.elements.ElementsPageQA;

import static qatools.constants.ConstantsQA.Urls.ELEMENTS_URL;


public class ElementsTestQA extends BaseTestQA {

    @Test

    public void testPage() {
        ElementsPageQA.visitUrl(ELEMENTS_URL);
        ElementsPageQA.visitTextBox();
        ElementsPageQA.enterName();
        ElementsPageQA.enterEmail();
        ElementsPageQA.enterCurrentAddress();
        ElementsPageQA.enterPermamentAddress();
        ElementsPageQA.sumbitInfo();
    }
}