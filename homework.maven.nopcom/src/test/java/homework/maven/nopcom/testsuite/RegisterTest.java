package homework.maven.nopcom.testsuite;

import homework.maven.nopcom.pages.HomePage;
import homework.maven.nopcom.pages.LoginPage;
import homework.maven.nopcom.pages.RegisterPage;
import homework.maven.nopcom.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    @Test(groups = {"Regression", "smoke"})
    public void verifyUserCanRegisterInRegistrationPageSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterLink();
        registerPage.clickOnRadioButton();
        registerPage.enterFirstName("Nikita");
        registerPage.enterLastName("Patel");
        registerPage.enterEmailId("abc123@yahoo.com");
        registerPage.enterCompanyName("Prime Testing");
        registerPage.enterPassword("1234abcd");
        registerPage.enterConfirmPassword("1234abcd");
        registerPage.clickOnRegisterButton();
        Thread.sleep(5000);
        String expectedText = "Your registration completed";
        String actualText = registerPage.getRegistrationCompletionText();
        Assert.assertEquals(expectedText, actualText);
    }
}
