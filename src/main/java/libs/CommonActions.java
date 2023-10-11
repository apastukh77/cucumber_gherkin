/**
 * Created by apastukh.
 * Date: 10.10.2023
 * Project Name: cucumber_gherkin
 */

package libs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class CommonActions {
    public static WebDriver createDriver() {
        File fileChromeDriver = new File("C:/Program Files/WebDriver/bin/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", fileChromeDriver.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        return new ChromeDriver(options);
    }
}
