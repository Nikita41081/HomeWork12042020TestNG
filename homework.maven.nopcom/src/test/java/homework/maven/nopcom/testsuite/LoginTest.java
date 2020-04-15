package homework.maven.nopcom.testsuite;

import homework.maven.nopcom.pages.HomePage;
import homework.maven.nopcom.pages.LoginPage;
import homework.maven.nopcom.testbase.TestBase;
import homework.maven.nopcom.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(groups = {"Regression"})
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign In!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test(groups = {"Sanity","Regression"})
    public void userShouldLoginSuccessfully() throws InterruptedException {
        homePage.clickOnElement(By.xpath("//a[@class='ico-login']"));
        loginPage.enterEmailId("nikita41081@yahoo.com");
        loginPage.enterPassword("nikita1234");
        loginPage.clickOnLoginButton();
        Thread.sleep(5000);
        String expectedText = "Welcome to our store";
        String actualText = loginPage.getWelcomeText1();
        Assert.assertEquals(expectedText, actualText);
    }
    @Test(groups = {"Smoke","Regression"})
    public void userShouldNotLoginSuccessfully() throws InterruptedException {
        homePage.clickOnElement(By.xpath("//a[@class='ico-login']"));
        loginPage.enterEmailId("nikita41081@yahoo.com");
        loginPage.enterPassword("nikita1234");
        loginPage.clickOnLoginButton();
        Thread.sleep(5000);
        String expectedText = "Welcome to our store!";
        String actualText = loginPage.getWelcomeText1();
        Assert.assertEquals(expectedText, actualText);
    }

}
