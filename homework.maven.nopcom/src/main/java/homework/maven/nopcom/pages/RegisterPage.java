package homework.maven.nopcom.pages;

import homework.maven.nopcom.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By femaleRadioBtn = By.id("gender-female");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    //By dayOfBirth
    By emailField = By.id("Email");
    By companyField = By.id("Company");
    By passwordField = By.id("Password");
    By confirmPWDField = By.id("ConfirmPassword");
    By registerBtn = By.id("register-button");
    By registrationCompletionText = By.xpath("//div[@class='result']");

    public void clickOnRadioButton() {
        clickOnElement(femaleRadioBtn);
    }

    public void enterFirstName(String first_name) {
        sendTextToElement(firstNameField, first_name);
    }

    public void enterLastName(String last_name) {
        sendTextToElement(lastNameField, last_name);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterCompanyName(String company_name) {
        sendTextToElement(companyField, company_name);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String ConfirmPWD) {
        sendTextToElement(confirmPWDField, ConfirmPWD);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
    }

    public String getRegistrationCompletionText() {
        return getTextFromElement(registrationCompletionText);
    }
}
