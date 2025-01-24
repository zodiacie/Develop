package snc;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import snc.BaseTest;

public class Testing {
    BaseTest setupDriver = new BaseTest();
    
    @BeforeTest
    public void setupDriver(){
        setupDriver.setupDriver();
    }
    
    @Test
    public void incidentTesting() throws IOException, InterruptedException{
        HomePage homepage = PageFactory.initElements(setupDriver.getDriver(), HomePage.class);
        homepage.incidentPage().incidentVerification();
        //homepage.incidentPage().incidentCreation();
        //homepage.incidentPage().searchFunction();
    }
    /*@AfterTest
    public void closeDriver(){
        setupDriver.closeDriver();
    }*/
}