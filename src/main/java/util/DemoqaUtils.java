/**
 * Created by apastukh.
 * Date: 11.10.2023
 * Project Name: cucumber_gherkin
 */

package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class DemoqaUtils {
    WebDriver driver;

    public DemoqaUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void zoomDown() {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.body.style.zoom = '0.85'");
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }
}
