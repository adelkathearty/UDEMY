package vietnamvisa.Page.FormPageVisa;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import vietnamvisa.Page.BasePageVisa.BasePageVisa;

import static vietnamvisa.Constants.VisaConstants.Addresses.PERMANENT_ADDRESS;
import static vietnamvisa.Constants.VisaConstants.Addresses.VIETNAM_ADDRESS;

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

    public final By nationalityOnBirth = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_quocTichGoc'])[1]");

    public final By occupationField = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_ngheNghiep'])[1]");

    public final By permanentAddressFied = By.xpath(("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_diaChiThuongTru'])[1]"));

    public final By phoneNumberField = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_soDienThoai'])[1]");

    public final By emailField = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_email'])[1]");

    public final By confirmEmailField = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_reEmail'])[1]");

    public final By passNumberField = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_soHoChieu'])[1]");

    public final By passportType = By.xpath("(//select[@id='_khaithithucdientu_WAR_eVisaportlet_loaiHoChieu'])[1]");

    public final By passExpDate = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_ngayCoGiaTri'])[1]");

    public final By dateOfEntry = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_ngayNhapCanh'])[1]");

    public final By tempAddressField = By.xpath("(//input[@id='_khaithithucdientu_WAR_eVisaportlet_diaChi'])[1]");

    public final By assuranceButton = By.xpath("(//div)[228]");


//    public final By facePhotoButton = By.xpath("(//h6[@class='text-muted'][normalize-space()='Select'])[1]");
//
//    public final By passportPhotoButton = By.xpath("(//div[@class='file-input'])[2]");


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

    public FormPageVisa ChooseNationalityOnBirth() {

        driver.findElement(nationalityOnBirth).clear();
        driver.findElement(nationalityOnBirth).sendKeys("Russian");
        return this;
    }


    public FormPageVisa enterReligion() {
        driver.findElement(religionField).sendKeys("Not religious");
        return this;
    }

    public FormPageVisa enterOccupation() {
        driver.findElement(occupationField).sendKeys("Manager");
        return this;
    }

    public FormPageVisa enterPermanentAddress() {
        driver.findElement(permanentAddressFied).sendKeys(PERMANENT_ADDRESS);
        return this;
    }

    public FormPageVisa enterPhoneNumber() {
        driver.findElement(phoneNumberField).sendKeys("+84999231122");
        return this;
    }

    public FormPageVisa enterEmail() {
        driver.findElement(emailField).sendKeys("pupkinv97@gmail.com");
        return this;
    }

    public FormPageVisa confirmEmail() {
        driver.findElement(confirmEmailField).sendKeys("pupkinv97@gmail.com");
        return this;
    }

    public FormPageVisa enterPassNumm() {
        driver.findElement(passNumberField).sendKeys("759292141");

        WebElement passTypeDropdown = driver.findElement(By.xpath("(//select[@id='_khaithithucdientu_WAR_eVisaportlet_loaiHoChieu'])[1]"));
        Select selectPassType = new Select(passTypeDropdown);
        selectPassType.selectByValue("PT");
        return this;
    }

    public FormPageVisa enterExpDate() {
        driver.findElement(passExpDate).sendKeys("10/10/2028");
        return this;
    }

    public FormPageVisa chooseEntryDate() {
        driver.findElement(dateOfEntry).sendKeys("10/05/2023");
        return this;
    }

    public FormPageVisa enterTempAddress() {
        driver.findElement(tempAddressField).sendKeys(VIETNAM_ADDRESS);
        WebElement cityDropdown = driver.findElement(By.xpath("(//select[@id='_khaithithucdientu_WAR_eVisaportlet_maTtTT'])[1]"));
        Select selectCity = new Select(cityDropdown);
        selectCity.selectByValue("701");
        return this;
    }

    public FormPageVisa chooseEntryPoint() {
        WebElement entryCheckPoint = driver.findElement(By.xpath("(//select[@id='_khaithithucdientu_WAR_eVisaportlet_cuaKhauNhapCanh'])[1]"));
        Select selectEntry = new Select(entryCheckPoint);
        selectEntry.selectByValue("STS");
        return this;
    }

    public FormPageVisa chooseExitPoint() {
        WebElement ExitCheckPoint = driver.findElement(By.xpath("(//select[@id='_khaithithucdientu_WAR_eVisaportlet_cuaKhauXuatCanh'])[1]"));
        Select selectExit = new Select(ExitCheckPoint);
        selectExit.selectByValue("STS");
        return this;
    }

    public FormPageVisa pressAssureButton() {
        driver.findElement(assuranceButton).click();
        return this;
    }


}


//    public FormPageVisa inputFacePhoto() {
////        driver.findElement(facePhotoButton).sendKeys("src/main/resources/permanent/file_16.jpg");
//
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        WebElement facePhotoInput = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='span2'])[1]")));
////        WebElement facePhotoInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//h6[@class='text-muted'][normalize-space()='Select'])[1]")));
//        facePhotoInput.sendKeys("src/main/resources/permanent/file_16.jpg");
//        return this;
//    }

