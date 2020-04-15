package uk.gov.harrow.pages;

import org.openqa.selenium.By;
import uk.gov.harrow.utility.Utility;

public class MainMenuPage extends Utility {
    By mainMenuAerialLabel = By.xpath("//a[contains(text(),'Benefits')]");

    public void mouseHoverOnBenefitsAndClick(){
        waitUntilElementToBeClickable(mainMenuAerialLabel, 20);
        clickOnElement(mainMenuAerialLabel);
        }
}
