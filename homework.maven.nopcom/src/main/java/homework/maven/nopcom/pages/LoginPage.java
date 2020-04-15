package homework.maven.nopcom.pages;

import homework.maven.nopcom.utility.Utility;
import org.openqa.selenium.By;

public class    LoginPage extends Utility {
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText1 = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");


    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String getWelcomeText1() {
        return getTextFromElement(welcomeText1);
    }


}
