package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen extends BaseScreen {
    public SplashScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/version_text']")
    AndroidElement versionTextViev;

    public String getCurrentVersion(){
        return versionTextViev.getText();
    }

    public AuthScreen checkCurrentVersion(String version){
        isShouldHave(versionTextViev,version,5);
        return new AuthScreen(driver);
    }

}
