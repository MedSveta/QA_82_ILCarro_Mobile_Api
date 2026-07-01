package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SplashScreen extends BaseScreen {
    public SplashScreen(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView" +
            "[@resource-id='com.telran.ilcarro:id/versionText']")
    WebElement versionApp;

    public boolean validateVersionApp(String text) {
        return isTextInElementPresent(versionApp, text);
    }

    public void goToSearchScreen() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By
                            .id("com.telran.ilcarro:id/findTitle")));
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("created exception");
        }
    }
}
