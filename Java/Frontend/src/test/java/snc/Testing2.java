package snc;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import snc.BaseTest;

public class Testing2 {
    BaseTest setupDriver = new BaseTest();

    @BeforeTest
    public void setupDriver(){
        setupDriver.setupDriver();
    }
    @Test
    public void openChrome(){
        setupDriver.getDriver().get("http://www.youtube.com");
    }   
}
