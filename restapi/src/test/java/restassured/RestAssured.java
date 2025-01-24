package restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class RestAssured {

    @Test
    public void testAPI(){
        given().
            get("https://reqres.in").
            then().statusCode(200).log().body();
    }    
}