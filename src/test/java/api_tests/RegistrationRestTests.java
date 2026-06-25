package api_tests;

import controllers.AuthenticationController;
import dto.ErrorMessageDto;
import dto.ResponseMessageDto;
import dto.TokenDto;
import dto.User;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.UserFactory;

public class RegistrationRestTests
        extends AuthenticationController {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void registrationRestPositiveTest(){
        User user = UserFactory.positiveUser();
        Assert.assertEquals(registrationLogin
                (user, REGISTRATION_URL)
                .getStatusCode(), 200);
    }

    @Test
    public void loginRestPositiveTest(){
        User user = User.builder()
                .username("sima_simonova370@gmail.com")
                .password("BSas124!")
                .build();
        Response response = registrationLogin
                (user, LOGIN_URL);
        softAssert.assertEquals(response
                .getStatusCode(), 200);
//        TokenDto tokenDto = response.getBody()
//                .as(TokenDto.class);
//        System.out.println(tokenDto.getToken());
        softAssert.assertAll();
    }

    @Test
    public void registrationRestNegativeTest(){
        User user = UserFactory.positiveUser();
        user.setUsername("sertwq123vrte.com");
        Response response = registrationLogin
                (user, REGISTRATION_URL);
        softAssert.assertEquals(response
                .getStatusCode(), 400,
                "validate status code");
        ErrorMessageDto errorMessageDto = response
                .getBody().as(ErrorMessageDto.class);
        softAssert.assertEquals(errorMessageDto
                .getError(), "Bad Request",
                "validate errorName");
        System.out.println(errorMessageDto);
        softAssert.assertAll();
    }
}
