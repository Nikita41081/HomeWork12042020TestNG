package uk.gov.harrow.testsuite;

import org.testng.annotations.Test;
import uk.gov.harrow.pages.BenefitsPage;
import uk.gov.harrow.pages.HomePage;
import uk.gov.harrow.pages.MainMenuPage;
import uk.gov.harrow.testbase.TestBase;

public class BenefitTest extends TestBase {
    HomePage homePage = new HomePage();
    BenefitsPage benefitsPage = new BenefitsPage();
    MainMenuPage mainMenuPage = new MainMenuPage();

    @Test
    public void verifyUserIsAbleToNavigateToBenefitsPage() {
        homePage.clickOnServicesButton();
        mainMenuPage.mouseHoverOnBenefitsAndClick();
        benefitsPage.clickOnApplyForHousingBenefitLink();
        benefitsPage.clickOnEntitlementCalcBtn();
        benefitsPage.clickOnStartBtn();
        benefitsPage.clickOnMortgageOrOwnedOutright();
        benefitsPage.enterPostCodeInPostCodeField();
        benefitsPage.clickOnNextBtn();
    }
}
