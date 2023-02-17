package vietnamvisa.Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import vietnamvisa.Common.VisaConfig;

import java.util.concurrent.TimeUnit;

import static vietnamvisa.Common.VisaConfig.BROWSER_AND_PLATFORM;

public class VisaCommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (VisaConfig.BROWSER_AND_PLATFORM) {
            case "CHROME_MACOS":
                System.setProperty("webdriver.chrome.driver", "src/main/chromedriver");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }
        return driver;
    }

}
