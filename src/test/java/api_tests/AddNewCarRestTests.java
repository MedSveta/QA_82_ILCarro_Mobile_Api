package api_tests;

import controllers.CarController;
import dto.Car;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.CarFactory;

public class AddNewCarRestTests extends CarController {
    @Test
    public void addNewCarPositiveRestTest(){
        Car car = CarFactory.positiveCar();
        Response response = addNewCar(car);
        Assert.assertEquals(response
                .getStatusCode(), 200);
    }
}
