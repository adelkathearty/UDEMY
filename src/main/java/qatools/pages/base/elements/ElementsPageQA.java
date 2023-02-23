package qatools.pages.base.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import static qatools.constants.ConstantsQA.Addresses.firstAddress;
import static qatools.constants.ConstantsQA.Addresses.secondAddress;
import static qatools.constants.ConstantsQA.Names.nameOne;

public class ElementsPageQA {

    public WebDriver driver;

    public ElementsPageQA(WebDriver driver) {
        this.driver = driver;
    }

    public void visitUrl(String url) {
        driver.get(url);
    }

    public final By textBoxButton = By.xpath("(//li[@id='item-0'])[1]");
    public final By nameBox = By.xpath("(//input[@id='userName'])[1]");
    public final By emailBox = By.xpath("(//input[@id='userEmail'])[1]");
    public final By currentAddressBox = By.xpath("(//textarea[@id='currentAddress'])[1]");
    public final By permanentAddressBox = By.xpath("(//textarea[@id='permanentAddress'])[1]");
    public final By submitButton = By.xpath("(//button[normalize-space()='Submit'])[1]");


    public ElementsPageQA visitTextBox() {
        driver.findElement(textBoxButton).click();
        return this;
    }

    public ElementsPageQA enterName() {
        driver.findElement(nameBox).sendKeys(nameOne);
        return this;
    }

    public ElementsPageQA enterEmail() {
        driver.findElement(emailBox).sendKeys("ivanovivan@gmail.com");
        return this;
    }

    public ElementsPageQA enterCurrentAddress() {
        driver.findElement(currentAddressBox).sendKeys(firstAddress);
        return this;
    }

    public ElementsPageQA enterPermamentAddress() {
        driver.findElement(permanentAddressBox).sendKeys(secondAddress);
        return this;
    }

    public ElementsPageQA submitInfo() {
        driver.findElement(submitButton).click();
        return this;
    }
}