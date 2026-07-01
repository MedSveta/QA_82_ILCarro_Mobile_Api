package mobile_tests;

import config.AppiumConfig;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBase {
    protected static AppiumDriver driver;

    @BeforeMethod
    public void setup() {
        driver = AppiumConfig.createAppiumDriver();
    }

    @Test(enabled = false)
    public void start(){
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }
}
