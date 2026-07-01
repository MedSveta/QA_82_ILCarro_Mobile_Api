package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseScreen {
    protected static AppiumDriver driver;
    public BaseScreen(AppiumDriver driver){
        BaseScreen.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator
                (driver, Duration.ofSeconds(20)), this);
    }

    public void clickWait(WebElement element) {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(element)).click();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("created exception");
        }
    }

    public boolean isTextInElementPresent(WebElement element, String text) {
        try {
            return new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions
                            .textToBePresentInElement(element, text));
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("created exception");
        }
        return false;
    }
}
