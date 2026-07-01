package mobile_tests;

import org.testng.annotations.Test;
import screens.SearchScreen;
import screens.SplashScreen;

public class RegistrationTests extends TestBase{
    @Test
    public void registrationPositiveTest(){
        new SplashScreen(driver).goToSearchScreen();
        SearchScreen searchScreen = new SearchScreen(driver);
        searchScreen.clickBtnDots();
        searchScreen.clickBtnRegistration();
    }
}
