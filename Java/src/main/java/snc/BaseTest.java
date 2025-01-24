package snc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest { //Comments
    WebDriver driver;

    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\woxia\\Desktop\\DOCS\\Automation\\Drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
    
    public WebDriver getDriver(){        
        return driver;
    }   

    public void closeDriver(){
        driver.close();
    }
}
