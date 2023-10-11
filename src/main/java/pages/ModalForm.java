/**
 * Created by apastukh.
 * Date: 11.10.2023
 * Project Name: cucumber_gherkin
 */

package pages;

import student.Student;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

public class ModalForm {
    WebDriver driver;

    By listOfValuesModalForm = By.xpath("//table/tbody/tr/td[2]");

    public ModalForm(WebDriver driver) {
        this.driver = driver;
    }

    public void checkValuesModalForm(Student student) {

        List<String> allTextContentsValuesDataList = getTextContentList();

        assertNameMatches(student, allTextContentsValuesDataList.get(0));
        assertEmailMatches(student, allTextContentsValuesDataList.get(1));
        assertGenderMatches(student, allTextContentsValuesDataList.get(2));
        assertMobileMatches(student, allTextContentsValuesDataList.get(3));
        assertDateOfBirthMatches(student, allTextContentsValuesDataList.get(4));
        assertSubjectsMatches(student, allTextContentsValuesDataList.get(5));
        assertHobbiesMatches(student, allTextContentsValuesDataList.get(6));
        assertPictureMatches(student, allTextContentsValuesDataList.get(7));
        assertAddressMatches(student, allTextContentsValuesDataList.get(8));
        assertStateAndCityMatches(student, allTextContentsValuesDataList.get(9));

    }

    private List<String> getTextContentList() {
        String attrTextContent = "textContent";
        List<WebElement> tableCellsList = driver.findElements(listOfValuesModalForm);
        List<String> allTextContentsValuesDataList = new ArrayList<>();
        for (WebElement e : tableCellsList) {
            allTextContentsValuesDataList.add(e.getAttribute(attrTextContent));
        }
        return allTextContentsValuesDataList;
    }

    private void assertNameMatches(Student student, String textContent) {
        String[] nameParts = textContent.split(" ");
        assertEquals(student.getFirstName(), nameParts[0], "First Name doesn't match.");
        assertEquals(student.getLastName(), nameParts[1], "Last Name doesn't match.");
    }

    private void assertEmailMatches(Student student, String textContent) {
        assertEquals(student.getEmail(), textContent, "Email doesn't match.");
    }

    private void assertGenderMatches(Student student, String textContent) {
        assertEquals(student.getGender(), textContent, "Gender doesn't match.");
    }

    private void assertMobileMatches(Student student, String textContent) {
        assertEquals(student.getMobileNumber(), textContent, "Mobile doesn't match.");
    }

    private void assertDateOfBirthMatches(Student student, String textContent) {
        String[] arr = textContent.split(",");
        String str = arr[0].substring(0, 6);
        assertEquals(student.getDateOfBirth(), str + " " + arr[1], "Date Of Birth doesn't match.");
    }

    private void assertSubjectsMatches(Student student, String textContent) {
        assertEquals(student.getSubjects(), textContent, "Subjects doesn't match.");
    }

    private void assertHobbiesMatches(Student student, String textContent) {

        String[] arr = textContent.split(", ");
        System.out.println(Arrays.toString(arr));
        List<Boolean> listBool = new ArrayList<>();
        List<String> allValues = Arrays.asList("Sports", "Reading", "Music");
        for (String value : allValues) {
            listBool.add(Arrays.asList(arr).contains(value));
        }
        assertEquals(student.getHobbies(), listBool, "Hobbies doesn't match.");
    }

    private void assertPictureMatches(Student student, String textContent) {
        assertTrue(student.getPicturePath().contains(textContent), "Picture doesn't match.");
    }

    private void assertAddressMatches(Student student, String textContent) {
        assertEquals(student.getCurrentAddress(), textContent, "Address doesn't match.");
    }

    private void assertStateAndCityMatches(Student student, String textContent) {

        String[] arr = textContent.split(" ");
        assertEquals(student.getState(), arr[0], "State doesn't match.");
        assertEquals(student.getCity(), arr[1], "City doesn't match.");
    }

}
