package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {
    By accessibliltyLink = By.xpath("//a[contains(text(),'Accessibility')]");

    public void clickOnAccessibilityLink(){ clickOnElement(accessibliltyLink);}
}
