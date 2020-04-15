package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uk.gov.harrow.utility.Utility;

public class BenefitsPage extends Utility {
    By applyForHousingBenefitLink = By.xpath("//h2[contains(text(),'Apply for Housing Benefit')]");
    By entitlementCalculatorBtn = By.xpath("//a[@class='button']");
    By startButton = By.id("StartCalculationBtn");
    By mortgageOrOwnedOutright = By.xpath("//div[contains(@class,'wrap-box housing-messages func-crop-buttons multiple-items-wrap')]//label[contains(@class,'ClaimForm.Web.Helpers.CFRadioButtonRenderedOption.4 jcf-label-active')]");
    By postCodeField = By.id("Postcode");
    By nextButton = By.id("nextButton");

    public void clickOnApplyForHousingBenefitLink(){
        clickOnElement(applyForHousingBenefitLink);
    }
    public void clickOnEntitlementCalcBtn(){
        clickOnElement(entitlementCalculatorBtn);
    }
    public void clickOnStartBtn(){
        clickOnElement(startButton);
    }
    public void clickOnMortgageOrOwnedOutright(){
        clickOnElement(mortgageOrOwnedOutright);
    }
    public void enterPostCodeInPostCodeField(){
        sendTextToElement(postCodeField,"HA3 7AL");
    }
    public void clickOnNextBtn(){
        clickOnElement(nextButton);
    }
}
