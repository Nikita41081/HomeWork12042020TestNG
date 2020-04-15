package uk.co.barclays.testsuite;

import org.testng.annotations.Test;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;
import uk.co.barclays.utility.Utility;

public class BranchFinderToSwitchTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserCanFindABranchToSwitchBank() {
        homePage.mouseHoverOnBankMenuItem();
        homePage.mouseHoverAndClickOnSwitchingBankAccountToBarclays();
        homePage.clickOnNewToUsBtn();
        Utility.scrollWindowUp(200);
        homePage.clickOnBranchFinderButton();
        homePage.enterLocationInLocationField();
        homePage.clickOnSearchBtn();
    }
}


