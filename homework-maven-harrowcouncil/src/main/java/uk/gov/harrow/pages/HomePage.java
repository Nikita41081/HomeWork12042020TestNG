package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class HomePage extends Utility {
    By serviceBtn = By.xpath("//li[@class='list__item list__item--menu']");
    By benefitsLink = By.xpath("//a[contains(text(),'Benefits')]");
    By mainMenuAerialLabel = By.xpath("//nav[@class='nav nav--primary']");


    public void clickOnServicesButton(){ clickOnElement(serviceBtn);}
    public void clickOnBenefitsLink(){ clickOnElement(benefitsLink);}
    public void mouseHoverOnBenefitsAndClick(){ mouseHoverToElementAndClick(mainMenuAerialLabel);}

}
