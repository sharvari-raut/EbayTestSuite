import Utils.BrowserControl;
import Utils.BrowserDriver;
import org.testng.annotations.*;


public class BaseScript {

    @BeforeSuite
    public void launchBrowser() {
        BrowserControl.startBrowser("chrome");
        BrowserControl.accessUrl("https://www.ebay.com/");
        BrowserControl.maximizeBrowser();
    }

    @AfterSuite
    public void closeBrowser(){
        BrowserControl.closeBrowser();
    }
}
