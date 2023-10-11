/**
 * Created by apastukh.
 * Date: 10.10.2023
 * Project Name: cucumber_gherkin
 */

package Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private List<Boolean> hobbies;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String mobileNumber;
    private String dateOfBirth;
    private String subjects;
    private boolean hobbiesSports;
    private boolean hobbiesReading;
    private boolean hobbiesMusic;
    private String picturePath;
    private String currentAddress;
    private String state;
    private String city;

    public Student(String firstName, String lastName, String email, String gender, String mobileNumber,
                   String dateOfBirth, String subjects, boolean hobbiesSports, boolean hobbiesReading,
                   boolean hobbiesMusic, String picturePath, String currentAddress, String state, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobileNumber = mobileNumber;
        this.dateOfBirth = dateOfBirth;
        this.subjects = subjects;
        this.hobbies = new ArrayList<>(Arrays.asList(hobbiesSports, hobbiesReading, hobbiesMusic));
        this.picturePath = picturePath;
        this.currentAddress = currentAddress;
        this.state = state;
        this.city = city;
    }

    public List<Boolean> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Boolean> hobbies) {
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public boolean isHobbiesSports() {
        return hobbiesSports;
    }

    public void setHobbiesSports(boolean hobbiesSports) {
        this.hobbiesSports = hobbiesSports;
    }

    public boolean isHobbiesReading() {
        return hobbiesReading;
    }

    public void setHobbiesReading(boolean hobbiesReading) {
        this.hobbiesReading = hobbiesReading;
    }

    public boolean isHobbiesMusic() {
        return hobbiesMusic;
    }

    public void setHobbiesMusic(boolean hobbiesMusic) {
        this.hobbiesMusic = hobbiesMusic;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hobbies=" + hobbies +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", subjects='" + subjects + '\'' +
                ", picturePath='" + picturePath + '\'' +
                ", currentAddress='" + currentAddress + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
