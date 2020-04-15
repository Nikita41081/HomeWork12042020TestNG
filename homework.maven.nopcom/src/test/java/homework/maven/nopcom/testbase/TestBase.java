package homework.maven.nopcom.testbase;

import homework.maven.nopcom.basepage.BasePage;
import homework.maven.nopcom.browserselector.BrowserSelector;
import homework.maven.nopcom.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty= new LoadProperty();
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod(groups = {"Smoke","Regression", "sanity"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod (groups = {"Smoke","Regression", "sanity"})
    public void tearDown() {
        driver.quit();
    }
}
