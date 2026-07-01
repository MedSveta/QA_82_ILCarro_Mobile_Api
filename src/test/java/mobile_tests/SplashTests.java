package mobile_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class SplashTests extends TestBase{
    @Test
    public void versionPositiveTest(){
        Assert.assertTrue(new SplashScreen(driver)
                .validateVersionApp("Version 1.0.0"));
    }
}
