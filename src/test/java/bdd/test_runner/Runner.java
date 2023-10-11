/**
 * Created by apastukh.
 * Date: 10.10.2023
 * Project Name: cucumber_gherkin
 */

package bdd.test_runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = {"bdd/StudentStepDefinition", "/src/main/java/libs"}, plugin ={"pretty", "html:target/cucumber-html-report","json:cucumber.json"})
public class Runner {
}
