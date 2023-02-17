package qatools.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static qatools.common.ConfigQA.BROWSER_AND_PLATFORM;


public class CommonActionsQA {

    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "CHROME_MACOS":
                System.setProperty("webdriver.chrome.driver", "src/main/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
        return driver;
    }
}
