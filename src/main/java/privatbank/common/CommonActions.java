package privatbank.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static privatbank.common.Config.BROWSER_AND_PLATFORM;


public class CommonActions {

    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM) {
            case "CHROME_MACOS":
                System.setProperty("webdriver.chrome.driver", "src/main/chromedriver");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
        return driver;
    }
}
