/**
 * Created by apastukh.
 * Date: 10.10.2023
 * Project Name: cucumber_gherkin
 */

package bdd.StudentStepDefinition;

import student.Student;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import libs.TestsHelper;
import org.openqa.selenium.WebDriver;
import pages.DemoqaPage;
import pages.ModalForm;


public class Steps {

    WebDriver driver = TestsHelper.webDriver;
    DemoqaPage demoqaPage = new DemoqaPage(driver);

    ModalForm modalForm;
    Student student = new Student("Eleanora", "Stanton", "email@subdomain.domain.com",
            "Female", "7556082311",
            "10 Sep 1990", "Maths, English", false, true, true,
            "C:/Users/andri/Pictures/1667215431395.jpeg",
            "595 Jamar Forges", "NCR", "Delhi");

    @Given("^the student is on the registration page in chrome browser$")
    public void given_the_student_is_on_the_registration_page_in_chrome_browser() {
        System.out.println("Given the student is on the registration page in chrome browser");
        boolean isDemoqaPage = demoqaPage.openDemoqaPage();
        if (!isDemoqaPage) {
            demoqaPage.closeDemoqaPage();
        }
    }

    /**
     * Scenario Outline:  Student registration by selecting different Gender checkbox options checked1
     */

    @When("^the student fills in all mandatory fields with correct data$")
    public void when_the_student_fills_in_all_mandatory_fields_with_correct_data() {
        System.out.println("When the student fills in all mandatory fields with correct data");
        demoqaPage.fillAllMandatoryFields(student);
    }

    @And("^the student submits the registration form$")
    public void and_the_student_submits_the_registration_form() {
        System.out.println("the student submits the registration form");
        modalForm = demoqaPage.clickSubmitBtn();
    }

    @Then("^the student should see a registration confirmation$")
    public void then_the_student_should_see_a_registration_confirmation() {
        System.out.println("Tthe student should see a registration confirmation");
        modalForm.checkValuesModalForm(student);
    }

    @And("^close the browser$")
    public void and_the_student_close_the_browser() {
        System.out.println("And the student close the browser");
        TestsHelper.toBeCleared();
        TestsHelper.closeBrowser();
    }

}
