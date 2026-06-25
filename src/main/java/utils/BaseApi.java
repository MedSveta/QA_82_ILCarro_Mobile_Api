package utils;

public interface BaseApi {
    String BASE_URL = "https://ilcarro-backend.herokuapp.com";
    String REGISTRATION_URL = "/v1/user/registration/usernamepassword";
    String LOGIN_URL = "/v1/user/login/usernamepassword";
    String ADD_NEW_CAR_URL = "/v1/cars";
    String GET_ALL_CARS_URL = "/v1/cars/my";
    String DELETE_CAR_URL = "/v1/cars/";


    String AUTH = "Authorization";
}
