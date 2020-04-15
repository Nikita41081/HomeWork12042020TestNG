package com.orangehrm.testsuite;

import com.orangehrm.pages.HomePage;
import com.orangehrm.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactSalesTest1 extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserIsAbleToSubmitContactSalesDetails() throws InterruptedException {
        homePage.clickOnContactSalesBtn();
        homePage.enterFirstName("Nikita");
        homePage.enterLastName("Patel");
        homePage.enterCompanyName("ORGHRM");
        homePage.selectNumberOfEmployeesFromDropDown("301 - 350");
        homePage.enterPhoneNumber("3789342569");
        homePage.enterJobTitle("Customer Service Assistant");
        homePage.enterEmailID("Nikita41081@yahoo.com");
        homePage.selectCountryNameFromDropDown("Zambia");
        homePage.enterComment("None");
        homePage.clickOnSubmitBtn();
        Thread.sleep(5000);
        String expectedText = "We have received your request.";
        String actualText = homePage.compareTheConfirmationText();
        Assert.assertEquals(expectedText, actualText);
    }

}
