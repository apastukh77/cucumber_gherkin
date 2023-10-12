/**
 * Created by apastukh.
 * Date: 10.10.2023
 * Project Name: cucumber_gherkin
 */

package libs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.File;

public class CommonActions {
    public static WebDriver createDriver(String browser) {
        browser = browser.trim();
        if (browser.equalsIgnoreCase("chrome")) {
            File fileChromeDriver = new File("C:/Program Files/WebDriver/bin/chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-fullscreen");
            return new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            File fileGeckoDriver = new File("C:/Program Files/WebDriver/gecko/geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", fileGeckoDriver.getAbsolutePath());
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-fullscreen", "--kiosk");
            return new FirefoxDriver(options);
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browser);
        }
    }
}
