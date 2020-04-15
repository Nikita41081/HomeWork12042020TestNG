package com.orangehrm.pages;

import com.orangehrm.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By contactSalesBtn = By.xpath("//a[contains(@class,'btn-orange contact-ohrm')]");
    By firstNameField = By.name("firstname");
    By lastNameField = By.name("lastname");
    By companyNameField = By.name("company");
    By numberOfEmployeesDropDownMenu = By.name("numemployees");
    By phoneNumberField = By.name("phone");
    By jobTitleField = By.name("jobtitle");
    By emailField = By.name("email");
    By countryDropDownMenu = By.name("country");
    By commentField = By.name("message");
    By submitBtn = By.xpath("//input[@class='hs-button primary large']");
    By confirmationText = By.xpath("//p[contains(text(),'We have received your request.')]");

    public void clickOnContactSalesBtn() {
        clickOnElement(contactSalesBtn);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterCompanyName(String companyName) {
        sendTextToElement(companyNameField, companyName);
    }

    public void selectNumberOfEmployeesFromDropDown(String value) {
        selectByValueFromDropDown(numberOfEmployeesDropDownMenu, value);
    }

    public void enterPhoneNumber(String phoneNo) {
        sendTextToElement(phoneNumberField, phoneNo);
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitleField, jobTitle);
    }

    public void enterEmailID(String email) {
        sendTextToElement(emailField, email);
    }

    public void selectCountryNameFromDropDown(String countryName) {
        selectByValueFromDropDown(countryDropDownMenu, countryName);
    }

    public void enterComment(String comment) {
        sendTextToElement(commentField, comment);
    }

    public void clickOnSubmitBtn() {
        waitUntilElementToBeClickable(submitBtn, 50);
    }

    public String compareTheConfirmationText() {
        return getTextFromElement(confirmationText);
    }
}
