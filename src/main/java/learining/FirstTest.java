import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

// что бы уникализировать xpath - внести в скобки круглые и по списки элементов квадратные скобки после хпаса и номер элемента

public class FirstTest {
    @Test
    public void testSearchGoogle() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/chromedriver");

        WebDriver driver = new ChromeDriver();

//создание таймаута для ожидания
//        int timeout = 10;
//        Duration timeoutDuration = Duration.ofSeconds(timeout);
//        WebDriverWait wait = new WebDriverWait(driver, timeoutDuration);

        driver.get("https://javascript.info/alert-prompt-confirm");

        //alert
        WebElement alertRun = driver.findElement(By.xpath("(//a[@title='run'])[1]"));
        alertRun.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        alertRun.click();
        System.out.println("text from the alert >>>>>>>>>>>>>>>  " + alert.getText());
        alert.accept();

        //confirm

        WebElement confirmRun = driver.findElement(By.xpath("(//a[@title='run'])[5]"));
        confirmRun.click();

        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();
        confirm.accept();

        //promt

        WebElement promtRun = driver.findElement(By.xpath("(//a[@title='run'])[2]"));
        promtRun.click();

        Alert promt = driver.switchTo().alert();
        promt.sendKeys("25");
        promt.accept();
        promt.accept();


    }

}


//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//        WebElement loginButton = driver.findElement(By.xpath("(//button[normalize-space()='Sign in'])[1]"));

//        Cookie tz = driver.manage().getCookieNamed("tz");
//        System.out.println("tz->" + tz);
// добавление кук
//        Cookie authCookie = new Cookie("user_session", "YFwDTzscc2Xz2Hx_4owZ5rW0jUftX4I5514EegNcC99xfIGD");
//        driver.manage().addCookie(authCookie);
//        driver.navigate().refresh();

//        Set<Cookie> cookies = driver.manage().getCookies();
//        System.out.println("Cookies=>" +  cookies);

//
//    WebElement dropdownbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button"));
//
//        dropdownbutton.click();
//
//                WebElement dropdownbutton2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/span/button"));
//
//                dropdownbutton2.click();
//
//                WebElement dropdownbutton3 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li[1]/span/button"));
//
//                dropdownbutton3.click();
//
//                WebElement clickbutton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li[1]/ol/li[3]/span/label/span[1]"));
//
//                clickbutton.click();


//
//    WebElement AddValue = driver.findElement(By.xpath("(//button[normalize-space()='Add'])[1]"));
//
//        AddValue.click();
//
//                WebElement inputFirstName = driver.findElement(By.xpath("(//input[@id='firstName'])[1]"));
//
//                inputFirstName.sendKeys("Vladimir");
//
//                WebElement inputLastName = driver.findElement(By.xpath("(//input[@id='lastName'])[1]"));
//
//                inputLastName.sendKeys("Pirogov");
//
//                WebElement inputEmail = driver.findElement(By.xpath("(//input[@id='userEmail'])[1]"));
//
//                inputEmail.sendKeys("freak@gmail.com");
//
//                WebElement inputAge = driver.findElement(By.xpath("(//input[@id='age'])[1]"));
//
//                inputAge.sendKeys("28");
//
//                WebElement inputSalary = driver.findElement(By.xpath("(//input[@id='salary'])[1]"));
//
//                inputSalary.sendKeys("1500");
//
//                WebElement inputDepartment = driver.findElement(By.xpath("(//input[@id='department'])[1]"));
//
//                inputDepartment.sendKeys("QA Automation");
//
//                WebElement submitButton = driver.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]"));


//    WebElement button = driver.findElement(By.xpath("(//button[normalize-space()='Double Click Me'])[1]"));
//
//        actiondoubleclick.doubleClick(button).perform();
//
//        WebElement button2 = driver.findElement(By.xpath("(//button[normalize-space()='Right Click Me'])[1]"));
//
//        actioncontextclick.contextClick(button2).perform();
//
//        WebElement button3 = driver.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]"));
//
//        button3.click();


//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        WebElement inputField = driver.findElement(By.xpath("(//input[@id='uploadFile'])[1]"));
//
//        inputField.sendKeys("/Users/personalized/Desktop/selenium/UDEMY/src/main/chromedriver");


//        WebElement signinButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[normalize-space()='Sign in'])[1]")));
//
//        String textContentButton = signinButton.getAttribute("textContent");
//
//        System.out.println("textContentButton->" + textContentButton);
//
//        Assert.assertEquals("Sign in", textContentButton);
//
//        driver.navigate().to("https://next.privat24.ua/mobile");
//
//        WebElement inputFiledAmount = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@placeholder='200.00'])[1]")));
//
//        String defaultValue = inputFiledAmount.getAttribute("value");
//
//        System.out.println("DefaultAmount->" + defaultValue);
//
//        driver.quit();


// ожидание

//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        WebElement goToExchangeRates = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='rates_bMirB70gRx'])[1]")));
//        goToExchangeRates.click();
//
//        WebElement buttonExchange = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[2]/section/div/div[2]/div[2]/div/div/div[4]/div/button")));
//        buttonExchange.click();


//    WebElement buttonOk = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okButton']")));
//        buttonOk.click();
//
//        WebElement textWelcome = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='awesome']")));
//
//        Assert.assertEquals("Thanks!", textWelcome.getText());
//
//        Alert alert = driver.switchTo().alert();