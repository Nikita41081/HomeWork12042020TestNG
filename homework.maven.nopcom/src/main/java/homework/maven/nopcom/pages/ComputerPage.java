package homework.maven.nopcom.pages;

import homework.maven.nopcom.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By desktopsTab = By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]");
    By buildYourOwnComputerImage = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[1]//a[1]//img[1]");
    By hddRadioButton = By.xpath("//input[@id='product_attribute_3_7']");
    By addToCartBtn = By.xpath("//input[@id='add-to-cart-button-1']");
    By addToShoppingCartText = By.xpath("//p[@class='content']");

    public void mouseHoverOnDesktopAndClick() {
        mouseHoverToElementAndClick(desktopsTab);
    }
    public void clickOnBuildYourOwnComputerImage(){
        clickOnElement(buildYourOwnComputerImage);
    }
    public void clickOnHddRadioBtn(){
        waitUntilElementToBeClickable(hddRadioButton, 20);
        clickOnElement(hddRadioButton);
    }
    public void clickOnAddToCartBtn(){
        clickOnElement(addToCartBtn);
    }
    public String addToCartConfirmationText(){
        return getTextFromElement(addToShoppingCartText);
    }
}
