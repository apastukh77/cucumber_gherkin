/**
 * Created by apastukh.
 * Date: 10.10.2023
 * Project Name: cucumber_gherkin
 */

package pages;

import student.Student;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DemoqaUtils;

import java.time.Duration;
import java.util.List;

import static libs.Constants.TimeoutVariables.EXPLICITY_WAIT;
import static libs.Constants.TimeoutVariables.IMPLICITY_WAIT;
import static libs.Constants.Urls.DEMOQA_STUDENT_REGISTRATION;


public class DemoqaPage {

    private WebDriver driver;

    By logo = By.xpath("/*/header/a/img");
    By practiceFormText = By.xpath("//*/div[@class='main-header']");
    By practiceFormTextBackground = By.xpath("//*/div[@class='container playgound-body']/div[contains(@class, 'pattern-backgound')]");
    By formName = By.cssSelector("div.practice-form-wrapper > h5");
    By nameLabel = By.xpath("//*[@id='userName-label']");
    By emailLabel = By.xpath("//*[@id='userEmail-label']");
    By genderLabel = By.xpath("//*/div[contains(text(), 'Gender')]");
    By mobileLabel = By.xpath("//*[@id='userNumber-label']");
    By dateOfBirthLabel = By.xpath("//*[@id= 'dateOfBirth-label']");
    By subjectsLabel = By.xpath("//*[@id='subjects-label' and text()='Subjects']");
    By hobbiesLabel = By.xpath("//*[@id='subjects-label' and text()='Hobbies']");
    By pictureLabel = By.xpath("//*[@id='subjects-label' and text()='Picture']");
    By currentAddressLabel = By.xpath("//*[@id='currentAddress-label']");
    By stateAndCityLabel = By.xpath("//*[@id='stateCity-label']");
    By firstNameInput = By.xpath("//*[@id='firstName']");
    By lastNameInput = By.xpath("//*[@id='lastName']");
    By emailInput = By.xpath("//*[@id='userEmail']");
    By maleRadioBtn = By.xpath("//*/label[contains(text(), 'Male')]");
    By femaleRadioBtn = By.xpath("//*/label[contains(text(), 'Female')]");
    By otherRadioBtn = By.xpath("//*/label[contains(text(), 'Other')]");
    By mobileInput = By.xpath("//*[@id='userNumber']");
    By dateOfBirthInput = By.xpath("//*[@id='dateOfBirthInput']");
    By subjectsInput = By.xpath("//*/div[contains(@class, 'subjects-auto-complete__v')]");
    By subjectsInputInside = By.xpath("//*/div[contains(@class, 'subjects-auto-complete__v')]/div[contains(@class, '-placeholder')]");
    By mathsSubject = By.xpath("//*[@id='react-select-2-option-0']");
    By sportsCheckBox = By.xpath("//*/label[text()='Sports']");
    By readingCheckBox = By.xpath("//*/label[text()='Reading']");
    By musicCheckBox = By.xpath("//*/label[text()='Music']");
    By selectPictureLabel = By.xpath("//*/label[@for='uploadPicture']");
    By chooseFileInput = By.xpath("//*[@id='uploadPicture']");
    By currentAddressTextArea = By.xpath("//*[@id='currentAddress']");
    By selectStateDropDown = By.xpath("//*[@id='state']");
    By selectStatePlaceholderDropDown = By.xpath("//*[@id='state']//div[contains(@class,'-placeholder')]");
    By selectStateArrowBlockDropDown = By.xpath("//*[@id='state']//div[contains(@class,'-indicatorContainer')]");
    By selectCityDropDown = By.xpath("//*[@id='city']");
    By selectCityPlaceholderDropDown = By.xpath("//*[@id='city']//div[contains(@class,'-placeholder')]");
    By selectCityArrowBlockDropDown = By.xpath("//*[@id='city']/div[contains(@class,'-control')]/div[2]");
    By monthBlockCalendar = By.xpath("//*[@id='dateOfBirth']//div[contains(@class,'__month-container')]");
    By monthHeaderBlockCalendar = By.xpath("//*[@id='dateOfBirth']//div[@class='react-datepicker__header']");
    By monthYearTitleCalendar = By.xpath("//*/div[@class='react-datepicker__header']/div[contains(@class,'month')]");
    By monthDropDownCalendar = By.xpath("//*[@id='dateOfBirth']//select[contains(@class,'month')]");
    By listOfMonthDropDownCalendar = By.xpath("//*[@id='dateOfBirth']//select[contains(@class,'month')]/option");
    By januaryDropDownCalendar = By.xpath("//*[@id='dateOfBirth']//select/option[@value='0']");

    By yearDropDownCalendar = By.xpath("//*[@id='dateOfBirth']//select[contains(@class,'year')]");

    By _1990DropDownCalendar = By.xpath("//*[@id='dateOfBirth']//select/option[@value='1990']");
    By listOfYearsDropDownCalendar = By.xpath("//*[@id='dateOfBirth']//select/option");
    By previousMonthArrowCalendar = By.xpath("//*[@id='dateOfBirth']//button[text()='Previous Month']");
    By nextMonthArrowCalendar = By.xpath("//*[@id='dateOfBirth']//button[text()='Next Month']");
    By dayNamesBlockCalendar = By.xpath("//*[@id='dateOfBirth']//div[contains(@class,'__day-names')]");
    By suDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[text()='Su']");
    By moDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[text()='Mo']");
    By tuDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[text()='Tu']");
    By weDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[text()='We']");
    By thDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[text()='Th']");
    By frDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[text()='Fr']");
    By saDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[text()='Sa']");
    By weeksSndDaysBlockCalendar = By.xpath("//*[@id='dateOfBirth']//div[@role='listbox']");
    By currentDayCalendar = By.xpath("//*[@id='dateOfBirth']//div[contains(@class,'selected')]");
    By dayOfFirstRowWeekCalendar = By.xpath("//*[@id='dateOfBirth']//div[@class='react-datepicker__month']/div[1]/div[5]");
    By dayOfSecondRowWeekCalendar = By.xpath("//*[@id='dateOfBirth']//div[@class='react-datepicker__month']/div[2]/div[5]");
    By dayOfThirdRowWeekCalendar = By.xpath("//*[@id='dateOfBirth']//div[@class='react-datepicker__month']/div[3]/div[5]");
    By dayOfFourthRowWeekCalendar = By.xpath("//*[@id='dateOfBirth']//div[@class='react-datepicker__month']/div[4]/div[5]");
    By dayOfFifthRowWeekCalendar = By.xpath("//*[@id='dateOfBirth']//div[@class='react-datepicker__month']/div[5]/div[5]");
    By dayOfSixthRowWeekCalendar = By.xpath("//*[@id='dateOfBirth']//div[@class='react-datepicker__month']/div[6]/div[5]");
    By listOfDaysChosenMonth = By.xpath("//*[@id=\"dateOfBirth\"]//div[@class='react-datepicker__month']/div/div[not(contains(@Class, '--outside-month'))]");
    By ncrStateDropDown = By.xpath("//*[@id='react-select-3-option-0' and text()='NCR']");
    By uttarPradeshStateDropDown = By.xpath("//*[@id='react-select-3-option-1' and text()='Uttar Pradesh']");
    By haryanaStateDropDown = By.xpath("//*[@id='react-select-3-option-2' and text()='Haryana']");
    By rajasthanStateDropDown = By.xpath("//*[@id='react-select-3-option-3' and text()='Rajasthan']");
    By agraCityDropDown = By.xpath("//*[@id='react-select-4-option-0' and text()='Delhi']");
    By lucknowCityDropDown = By.xpath("//*[@id='react-select-4-option-1' and text()='Lucknow']");
    By merrutCityDropDown = By.xpath("//*[@id='react-select-4-option-2' and text()='Merrut']");
    By submitBtn = By.xpath("//*[@id='submit']");
    By rightSideAddsSection = By.xpath("//*[@id='RightSide_Advertisement']");
    By elementsLeftPannel = By.xpath("//*[@id='app']//div[1]/span//div[@class='header-text' and text()='Elements']");
    By elementsArrowDownLeftPannel = By.xpath("//*[@id='app']//div[1]/span//div[@class='header-right']/div[@class='icon']");
    By elementsSeparatorLeftPannel = By.xpath("//*[@id='app']//div[1]/span//div[@class='separator']");
    By formsLeftPannel = By.xpath("//*[@id='app']//div[2]/span//div[@class='header-text' and text()='Forms']");
    By formsArrowDownLeftPannel = By.xpath("//*[@id='app']//div[2]/span//div[@class='header-right']/div[@class='icon']");
    By formsSeparatorLeftPannel = By.xpath("//*[@id='app']//div[2]/span//div[@class='separator']");
    By alertsFrameWindowsLeftPannel = By.xpath("//*[@id='app']//div[3]/span//div[@class='header-text' and text()='Alerts, Frame & Windows']");
    By alertsFrameWindowsArrowDownLeftPannel = By.xpath("//*[@id= 'app']//div[3]/span//div[@class='header-right']/div[@class='icon']");
    By alertsFrameWindowsSeparatorLeftPannel = By.xpath("//*[@id='app']//div[3]/span//div[@class='separator']");
    By widgetsLeftPannel = By.xpath("//*[@id='app']//div[4]/span//div[@class='header-text' and text()='Widgets']");
    By widgetsArrowDownLeftPannel = By.xpath("//*[@id='app']//div[4]/span//div[@class='header-right']/div[@class='icon']");
    By widgetsSeparatorLeftPannel = By.xpath("//*[@id='app']//div[4]/span//div[@class='separator']");
    By interactionsLeftPannel = By.xpath("//*[@id='app']//div[5]/span//div[@class='header-text' and text()='Interactions']");
    By interactionsArrowDownLeftPannel = By.xpath("//*[@id='app']//div[5]/span//div[@class='header-right']/div[@class='icon']");
    By interactionsSeparatorLeftPannel = By.xpath("//*[@id='app']//div[5]/span//div[@class='separator']");
    By bookStoreApplicationLeftPannel = By.xpath("//*[@id='app']//div[6]/span//div[@class='header-text' and text()='Book Store Application']");
    By bookStoreApplicationArrowDownLeftPannel = By.xpath("//*[@id='app']//div[6]/span//div[@class='header-right']/div[@class='icon']");
    By bookStoreApplicationSeparatorLeftPannel = By.xpath("//*[@id='app']//div[6]/span//div[@class='separator']");
    By leftPannel = By.xpath("//*[@id='app']//div[@class='left-pannel']");
    By elementsBlockLeftPannel = By.xpath("(//*[@id='app']//div[@class='left-pannel']//div[@class='element-group'])[1]");
    By formsBlockLeftPannel = By.xpath("(//*[@id='app']//div[@class='left-pannel']//div[@class='element-group'])[2]");
    By alertsFrameWindowsBlockLeftPannel = By.xpath("(//*[@id='app']//div[@class='left-pannel']//div[@class='element-group'])[3]");
    By widgetsBlockLeftPannel = By.xpath("(//*[@id='app']//div[@class='left-pannel']//div[@class='element-group'])[4]");
    By interactionsBlockLeftPannel = By.xpath("(//*[@id='app']//div[@class='left-pannel']//div[@class='element-group'])[5]");
    By bookStoreApplicationBlockLeftPannel = By.xpath("(//*[@id='app']//div[@class='left-pannel']//div[@class='element-group'])[6]");


    public DemoqaPage(WebDriver webDriver) {
        this.driver = webDriver;
    }


    public boolean openDemoqaPage() {
        driver.get(DEMOQA_STUDENT_REGISTRATION);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITY_WAIT));
        return isCheckDemoqaPage();
    }

    private boolean isCheckDemoqaPage() {
        boolean result = false;
        String currentUrl = driver.getCurrentUrl();
        if (!currentUrl.isEmpty() && currentUrl.equals(DEMOQA_STUDENT_REGISTRATION)) {
            System.out.println("DemoqaPage. \nIt is the Demoqa Page.");
            result = true;
            return result;
        }
        return result;
    }

    public void closeDemoqaPage() {
        System.out.println("Browser was closed!");
        driver.close();
    }

    private void fillFirstNameInput(String firstName) {
        WebElement firstNameInputWebEl = driver.findElement(firstNameInput);
        firstNameInputWebEl.sendKeys(firstName);
    }

    private void fillLastNameInput(String lastName) {
        WebElement lastNameInputWebEl = driver.findElement(lastNameInput);
        lastNameInputWebEl.sendKeys(lastName);
    }

    private void fillEmailInput(String email) {
        WebElement emailInputEebEl = driver.findElement(emailInput);
        emailInputEebEl.sendKeys(email);
    }

    private void chooseGenderRadioBtn(String gender) {
        switch (gender) {
            case "Male":
                WebElement maleRadioBtnWebEl = driver.findElement(maleRadioBtn);
                maleRadioBtnWebEl.click();
                break;
            case "Female":
                WebElement femaleRadioBtnWebEl = driver.findElement(femaleRadioBtn);
                femaleRadioBtnWebEl.click();
                break;
            case "Other":
                WebElement otherRadioBtnWebEl = driver.findElement(otherRadioBtn);
                otherRadioBtnWebEl.click();
                break;
        }
    }

    private void fillMobileInput(String mobileNumber) {
        WebElement mobileInputWebEl = driver.findElement(mobileInput);
        mobileInputWebEl.sendKeys(mobileNumber);
    }

    private void selectDateOfBirthInput(String dateOfBirth) {

        String dateOfBirthDay = dateOfBirth.substring(0, 2);
        String dateOfBirthMonth = dateOfBirth.substring(3, 6);
        String dateOfBirthYear = dateOfBirth.substring(7, 11);

        WebElement dateOfBirthInputWebEl = driver.findElement(dateOfBirthInput);
        dateOfBirthInputWebEl.click();
        List<WebElement> listOfYearsDropDownCalendarWebEl = driver.findElements(listOfYearsDropDownCalendar);
        for (WebElement e : listOfYearsDropDownCalendarWebEl) {
            if (e.getAttribute("Value").equals(dateOfBirthYear)) {
                e.click();
                break;
            }
        }

        WebElement monthDropDownCalendarWebEl = driver.findElement(monthDropDownCalendar);
        monthDropDownCalendarWebEl.click();
        List<WebElement> listOfMonthDropDownCalendarWebEl = driver.findElements(listOfMonthDropDownCalendar);
        for (WebElement e : listOfMonthDropDownCalendarWebEl) {
            if ((e.getText().substring(0, 3)).equals(dateOfBirthMonth)) {
                e.click();
                monthDropDownCalendarWebEl.click();
                break;
            }
        }

        List<WebElement> listOfDaysChosenMonthWebEl = driver.findElements(listOfDaysChosenMonth);
        for (WebElement e : listOfDaysChosenMonthWebEl) {
            if ((e.getText()).equals(dateOfBirthDay)) {
                e.click();
                break;
            }
        }
    }

    private void fillSubjectInput(String subjects) {
        WebElement subjectsInputWebEl = waitElementIsVisible(subjectsInput);
        subjectsInputWebEl.click();

        WebElement subjectsInputwe = driver.findElement(By.id("subjectsInput"));
        subjectsInputwe.sendKeys(subjects);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITY_WAIT));

        WebElement mathsSubjectWebEl = waitElementIsVisible(mathsSubject);
        mathsSubjectWebEl.click();
    }

    private void chooseHobbiesCheckBox(List<Boolean> hobbies) {

        if (hobbies.get(0)) {
            WebElement sportsCheckBoxWebEl = driver.findElement(sportsCheckBox);
            sportsCheckBoxWebEl.click();
        }
        if (hobbies.get(1)) {
            WebElement readingCheckBoxWebEl = driver.findElement(readingCheckBox);
            readingCheckBoxWebEl.click();
        }
        if (hobbies.get(2)) {
            WebElement musicCheckBoxWebEl = driver.findElement(musicCheckBox);
            musicCheckBoxWebEl.click();
        }
    }

    private void clickSelectPictureBtn(String picturePath) {
        WebElement chooseFileInputWebEl = driver.findElement(chooseFileInput);
        chooseFileInputWebEl.sendKeys(picturePath);
    }

    private void fillCurrentAddressTextArea(String currentAddress) {
        WebElement currentAddressTextAreaWebEl = driver.findElement(currentAddressTextArea);
        currentAddressTextAreaWebEl.sendKeys(currentAddress);
        new DemoqaUtils(driver).scrollDown();
    }

    private void selectStateInput(String state) {

        WebElement selectStateDropDownWebEl = driver.findElement(selectStateDropDown);
        selectStateDropDownWebEl.click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id, 'react-select-3-option')]"));
        for (WebElement e : list) {
            if (e.getAttribute("textContent").equals(state)) {
                e.click();
                break;
            }
        }
    }

    private void selectCityInput(String city) {
        WebElement selectCityDropDownWebEl = driver.findElement(selectCityDropDown);
        selectCityDropDownWebEl.click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(@id,'react-select-4-option')]"));
        for (WebElement e : list) {
            if (e.getAttribute("textContent").equals(city)) {
                System.out.println(city);
                System.out.println(e.getAttribute("textContent"));
                e.click();
                break;
            }
        }
    }

    public ModalForm clickSubmitBtn() {
        new DemoqaUtils(driver).zoomDown();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('submit').click();", "");
        return new ModalForm(driver);
    }

    public void fillAllMandatoryFields(Student student) {
        fillFirstNameInput(student.getFirstName());
        fillLastNameInput(student.getLastName());
        fillEmailInput(student.getEmail());
        chooseGenderRadioBtn(student.getGender());
        fillMobileInput(student.getMobileNumber());
        selectDateOfBirthInput(student.getDateOfBirth());
        List<String> subjects = student.getSubjects();
        for (String subject : subjects) {
            fillSubjectInput(subject);
        }
        chooseHobbiesCheckBox(student.getHobbies());
        clickSelectPictureBtn(student.getPicturePath());
        fillCurrentAddressTextArea(student.getCurrentAddress());
        selectStateInput(student.getState());
        selectCityInput(student.getCity());
    }

    private void focusOut() {
        WebElement formNameWebEl = driver.findElement(formName);
        formNameWebEl.click();
    }

    private WebElement waitElementIsVisible(By locator) {
        if (locator == null) {
            return null;
        }
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(EXPLICITY_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }

}
