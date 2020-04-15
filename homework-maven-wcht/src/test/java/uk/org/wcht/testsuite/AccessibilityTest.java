package uk.org.wcht.testsuite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import uk.org.wcht.pages.AccessiblityPage;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;
import uk.org.wcht.utility.Utility;

import javax.swing.*;

public class AccessibilityTest extends TestBase {
HomePage homePage = new HomePage();
AccessiblityPage accessiblityPage= new AccessiblityPage();


@Test
    public void verifyUserCanNavigateToAccessiblityPage() throws InterruptedException {
    homePage.clickOnAccessibilityLink();
    accessiblityPage.mouseHoverOnYourCommunityTab();
    accessiblityPage.mouseHoverOnGetInvolvedAndClick();
    //Utility.scrollWindowUp(500);
    //Thread.sleep(5000);
    accessiblityPage.clickOnLightBitesField("Membership");
    accessiblityPage.clickOnMainMenu("Community groups");
    accessiblityPage.clickOnAllYouCanEatField("Committee members");
    accessiblityPage.clickOnTakeAwayField("Email engagement");
    accessiblityPage.clickOnYesIWouldLikeToBecomeAMember();
    accessiblityPage.clickOnYesIWouldLikeToFindOutMore();
    accessiblityPage.clickOnYesIWouldLikeUsingEmailOrFacebook();
    accessiblityPage.enterNameField("Nikita");
    accessiblityPage.enterAddressField("16 Chapel Rd, Breachwood Green, Hitchin");
    accessiblityPage.enterPostcodeField("SG4 8NU");
    accessiblityPage.clickOnHowWouldYouLikeToBeContacted("Phone");
    accessiblityPage.enterEmailID("abc@yahoo.com");
    accessiblityPage.clickOnCaptchaCheckbox();
    accessiblityPage.clickOnSubmitBtn();

}

}
