package uk.co.barclays.pages;

import org.openqa.selenium.By;
import uk.co.barclays.utility.Utility;

public class HomePage extends Utility {
    By bankMenuItem = By.linkText("Bank");
    By switchBankAccToBarclaysTab = By.linkText("Switching bank account to Barclays");
    By newToUsBtn = By.xpath("//a[@class='btn btn-secondary']");
    By branchFinder = By.xpath("//a[contains(text(),'Branch finder')]");
    By locationField = By.xpath("//input[@id='location']");
    By searchBtn = By.xpath("//input[@class='btn btn-primary']");

    public void mouseHoverOnBankMenuItem (){
        mouseHoverToElement(bankMenuItem);
    }
    public void mouseHoverAndClickOnSwitchingBankAccountToBarclays(){
        mouseHoverToElementAndClick(switchBankAccToBarclaysTab);
    }
    public void clickOnNewToUsBtn(){
        clickOnElement(newToUsBtn);
    }
    public void clickOnBranchFinderButton() {
        clickOnElement(branchFinder);
    }
    public void enterLocationInLocationField(){
        sendTextToElement(locationField, "Dunstable");
    }
    public void clickOnSearchBtn (){
        clickOnElement(searchBtn);
    }

}
