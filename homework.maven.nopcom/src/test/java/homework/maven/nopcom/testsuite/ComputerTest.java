package homework.maven.nopcom.testsuite;

import homework.maven.nopcom.pages.ComputerPage;
import homework.maven.nopcom.pages.HomePage;
import homework.maven.nopcom.pages.RegisterPage;
import homework.maven.nopcom.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    @Test(groups = {"Regression", "sanity"})
    public void verifyUserCanAddToShoppingCart() throws InterruptedException {
        homePage.mouseHoverOnComputerTab();
        computerPage.mouseHoverOnDesktopAndClick();
        computerPage.clickOnBuildYourOwnComputerImage();
        computerPage.clickOnHddRadioBtn();
        computerPage.clickOnAddToCartBtn();
        Thread.sleep(5000);
        String expectedText = "The product has been added to your ";
        String actualText = computerPage.addToCartConfirmationText();
        Assert.assertEquals(expectedText, actualText);
    }
}
