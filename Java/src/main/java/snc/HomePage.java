package snc;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public IncidentPage incidentPage() throws IOException, InterruptedException{
        driver.get("http://cibcsit.service-now.com");
        return PageFactory.initElements(driver, IncidentPage.class);
    }   
}
