package qatools.pages.base.forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static qatools.constants.ConstantsQA.Addresses.firstAddress;

public class FormsPageQA {

    public WebDriver driver;

    public FormsPageQA(WebDriver driver) {
        this.driver = driver;
    }

    public void visitUrl(String url) {
        driver.get(url);
    }

    public final By firstName = By.xpath("(//input[@id='firstName'])[1]");
    public final By lastName = By.xpath("(//input[@id='lastName'])[1]");
    public final By emailAddress = By.xpath("(//input[@id='userEmail'])[1]");
    public final By genderButton = By.xpath("(//label[normalize-space()='Male'])[1]");
    public final By mobileNumber = By.xpath("(//input[@id='userNumber'])[1]");
    public final By birthDate = By.xpath("(//input[@id='dateOfBirthInput'])[1]");
    public final By subjects = By.xpath("(//div[@class='css-1g6gooi'])[1]");
    public final By hobbies = By.xpath("(//label[normalize-space()='Reading'])[1]");
    public final By uploadPicture = By.xpath("(//input[@id='uploadPicture'])[1]");
    public final By currentAddress = By.xpath("(//textarea[@id='currentAddress'])[1]");
    public final By stateList = By.xpath("(//div[contains(@class,'css-1hwfws3')])[2]");
    public final By cityList = By.xpath("(//div[contains(@class,'css-1hwfws3')])[3]");
    public final By submitButton = By.xpath("(//button[normalize-space()='Submit'])[1]");


    public FormsPageQA enterFirstName() {
        driver.findElement(firstName).sendKeys("Vladimir");
        return this;
    }

    public FormsPageQA enterLastName() {
        driver.findElement(lastName).sendKeys("Pushkin");
        return this;
    }

    public FormsPageQA enterEmail() {
        driver.findElement(emailAddress).sendKeys("pushkin11@gmail.com");
        return this;
    }

    public FormsPageQA selectGender() {
        driver.findElement(genderButton).click();
        return this;
    }

    public FormsPageQA enterMobileNumber() {
        driver.findElement(mobileNumber).sendKeys("+79994142312");
        return this;
    }

    public FormsPageQA enterBirthDate() {
        driver.findElement(birthDate).clear();
        return this;
    }

//    public FormsPageQA chooseSubjects() {
//        driver.findElement(subjects).sendKeys("Computer Science");
//        return this;
//    }

    public FormsPageQA chooseHobby() {
        driver.findElement(hobbies).click();
        return this;
    }

    public FormsPageQA uploadPic() {
        driver.findElement(uploadPicture).sendKeys("/Users/personalized/Desktop/selenium/UDEMY/src/temp/file_6.jpg");
        return this;
    }

    public FormsPageQA inputAddress() {
        driver.findElement(currentAddress).sendKeys(firstAddress);
        return this;
    }

    public FormsPageQA selectState() {
        driver.findElement(stateList).sendKeys("NCR");
        driver.findElement(stateList).submit();
        Select dropdown = new Select(driver.findElement(stateList));
        dropdown.selectByIndex(0);

        return this;

    }

}