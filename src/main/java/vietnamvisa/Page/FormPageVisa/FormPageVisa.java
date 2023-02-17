package vietnamvisa.Page.FormPageVisa;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import vietnamvisa.Page.BasePageVisa.BasePageVisa;

public class FormPageVisa {


    public WebDriver driver;

    public FormPageVisa(WebDriver driver) {
        this.driver = driver;
    }

    public void visitUrl(String url) {
        driver.get(url);
    }


    public final By fullName = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_ten'])[1]");
    // fullName это два значения из таблицы FirstName + LastName
    public final By dateOfBirth = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_ngaySinh'])[1]");

    public final By maleButton = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_gioiTinh-nam'])[1]");

    public final By nationalityList = By.xpath("(//select[@id='_khaithithucdientu_WAR_eVisaportlet_quocTichHienTai'])[1]");

    public final By religionField = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_tonGiao'])[1]");

    public final By facePhotoButton = By.xpath("(//h6[@class='text-muted'][normalize-space()='Select'])[1]");

    public final By passportPhotoButton = By.xpath("(//div[@class='file-input'])[2]");


    public FormPageVisa enterName() {
        driver.findElement(fullName).sendKeys("Vladimir Jopkin");
        return this;
    }

    public FormPageVisa enterDate() {
        driver.findElement(dateOfBirth).sendKeys("10/10/1997");
        return this;
    }

    public FormPageVisa chooseGenderMale() {
        driver.findElement(maleButton).click();
        return this;
    }

    public FormPageVisa chooseNationality() {

        WebElement dropdown = driver.findElement(By.xpath("(//select[@id='_khaithithucdientu_WAR_eVisaportlet_quocTichHienTai'])[1]"));
        Select select = new Select(dropdown);
        select.selectByValue("RUS");
        return this;
    }

        /*
        второй вариант
        driver.findElement(nationalityList).sendKeys("Russia");
        driver.findElement(nationalityList).submit();
         */

    public FormPageVisa enterReligion() {
        driver.findElement(religionField).sendKeys("Not religious");
        return this;
    }

    public FormPageVisa inputFacePhoto() {
//        driver.findElement(facePhotoButton).sendKeys("src/main/resources/permanent/file_16.jpg");

        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement facePhotoInput = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='_khaithithucdientu_WAR_eVisaportlet_anhDaiDien']")));
//        WebElement facePhotoInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[@class='text-muted'][normalize-space()='Select'])[1]")));
        facePhotoInput.sendKeys("src/main/resources/permanent/file_16.jpg");
        return this;
    }

}