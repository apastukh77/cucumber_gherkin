/**
 * Created by apastukh.
 * Date: 10.10.2023
 * Project Name: cucumber_gherkin
 */

package libs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TestsHelper {

    public static WebDriver webDriver = CommonActions.createDriver("chrome   ");


    public static void toBeCleared() {
        if (Config.CLEAR_COOKIES) {
            JavascriptExecutor js = (JavascriptExecutor) webDriver;
            webDriver.manage().deleteAllCookies();
            js.executeScript("window.sessionStorage.clear()");
        }
    }

    public static void closeBrowser() {
        if (Config.HOLD_BROWSER_OPEN) {
            webDriver.close();
            webDriver.quit();
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
