package snc;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.By;

public class IncidentPage {
    //Incident Resolve
    @FindBy(xpath = "//*[@id=\"incident.state\"]")
    WebElement state;
    @FindBy(xpath = "//*[@id=\"lookup.incident.assigned_to\"]")
    WebElement assignmentbutton;
    @FindBy(xpath ="/html/body/div[1]/div[1]/span/div/div[6]/div[1]/table/tbody/tr[1]/td[3]/a")
    WebElement assignmentmember;
    @FindBy(xpath = "//*[@id=\"tabs2_section\"]/span[1]/span[1]")
    WebElement closuretab;
    @FindBy(xpath = "//*[@id=\"incident.close_code\"]")
    WebElement closecode;
    @FindBy(xpath = "//*[@id=\"incident.close_notes\"]")
    WebElement closurenotes;

    //Incident Creation
    @FindBy(xpath = "//*[@id=\"14641d70c611228501114133b3cc88a1\"]/div/div")
    WebElement incidentlink;
    @FindBy(xpath = "//*[@id=\"sys_display.incident.caller_id\"]")
    WebElement caller;
    @FindBy(xpath = "//*[@id=\"sys_display.incident.assignment_group\"]")
    WebElement assignmentgroup;
    @FindBy(xpath = "//*[@id=\"sys_display.incident.cmdb_ci\"]")
    WebElement affectedci;
    @FindBy(xpath = "//*[@id=\"incident.u_incident_type\"]")
    WebElement incidenttype;
    @FindBy(xpath = "//*[@id=\"incident.category\"]")
    WebElement category;
    @FindBy(xpath = "//*[@id=\"incident.subcategory\"]")
    WebElement subcategory;
    @FindBy(xpath = "//*[@id=\"sys_display.incident.u_opened_by_group\"]")
    WebElement openby;
    @FindBy(xpath = "//*[@id=\"incident.short_description\"]")
    WebElement shortdesc;
    @FindBy(xpath = "//*[@id=\"incident.description\"]")
    WebElement desc;
    @FindBy(xpath = "//*[@id=\"tabs2_section\"]/span[5]/span[1]")
    WebElement caseexchangetab;
    @FindBy(xpath = "//*[@id=\"sys_display.incident.u_vendor_location_contact\"]")
    WebElement locationcontact;
    @FindBy(xpath = "//*[@id=\"incident.u_vendor_make\"]")
    WebElement vendormake;
    @FindBy(xpath = "//*[@id=\"incident.u_vendor_worker_type\"]")
    WebElement vendorworktype;
    @FindBy(xpath = "//*[@id=\"incident.u_vendor_model\"]")
    WebElement vendormodel;
    @FindBy(xpath = "//*[@id=\"incident.u_vendor_tech_instruction\"]")
    WebElement techinstruction;
    @FindBy(xpath = "//*[@id=\"sysverb_update_and_stay_bottom\"]")
    WebElement save;

    //Shadow DOMs Setup.
    String cssSelectorForHost1 = "macroponent-f51912f4c700201072b211d4d8c26010";
    String cssSelectorForHost2 = "sn-polaris-layout"; 
    String cssSelectorForHost3 = "sn-polaris-header"; 
    String cssSelectorForHost4 = "sn-polaris-menu";
    String cssSelectorForHost5 = "nav:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > sn-collapsible-list:nth-child(14)";
    String cssSelectorForHost6 = "div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(1) > span:nth-child(1)";
    String cssSelectorForHost7 = "sn-search-input-wrapper";
    String cssSelectorForHost8 = "sn-component-workspace-global-search-typeahead";

    WebDriver driver;
    public IncidentPage(WebDriver driver){
        this.driver = driver;
    }

    public void incidentVerification() throws IOException, InterruptedException{
        Thread.sleep(30000);
        SearchContext shadow1= driver.findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(cssSelectorForHost2)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(cssSelectorForHost3)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow4 = shadow3.findElement(By.cssSelector(cssSelectorForHost7)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow5 = shadow4.findElement(By.cssSelector(cssSelectorForHost8)).getShadowRoot();
        Thread.sleep(3000);
        WebElement input = shadow5.findElement(By.cssSelector("#sncwsgs-typeahead-input"));
        input.sendKeys("INC13321623");
        Thread.sleep(2000);
        input.sendKeys(Keys.ENTER);

        Thread.sleep(3000);
        WebElement iframe = shadow1.findElement(By.cssSelector("#gsft_main"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        Select se4 = new Select(state);
        se4.selectByVisibleText("Resolved");
        /*Thread.sleep(3000);
        affectedci.sendKeys("CC Outbound Dialer-39262");
        affectedci.sendKeys(Keys.ENTER);*/
        String winHandleBefore = driver.getWindowHandle();
        Thread.sleep(3000);
        assignmentbutton.click();
        // Switch to new window opened
        Thread.sleep(3000);
        Set<String> handles =  driver.getWindowHandles();
        for(String winHandle : handles){
            if (!winHandle.equals(winHandleBefore)){
                driver.switchTo().window(winHandle);
                Thread.sleep(3000);
                assignmentmember.click();
                break;
            }
        }
        // Switch back to original browser (first window)
        Thread.sleep(3000);
        driver.switchTo().window(winHandleBefore);
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        closuretab.click();
        Thread.sleep(3000);
        Select se5 = new Select(closecode);
        se5.selectByVisibleText("Solved");
        Thread.sleep(3000);
        closurenotes.sendKeys("Resolved from CIBC side");
        closurenotes.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        caseexchangetab.click();
        Thread.sleep(3000);
        techinstruction.click();
        techinstruction.sendKeys("Resolved from CIBC side");
        techinstruction.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        save.click();
    }   

    public void incidentCreation() throws IOException, InterruptedException{
        Thread.sleep(40000);
        SearchContext shadow1= driver.findElement(By.cssSelector(cssSelectorForHost1)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow2 = shadow1.findElement(By.cssSelector(cssSelectorForHost2)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow3 = shadow2.findElement(By.cssSelector(cssSelectorForHost3)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow4 = shadow3.findElement(By.cssSelector(cssSelectorForHost4)).getShadowRoot();
        Thread.sleep(3000);
        SearchContext shadow5 = shadow4.findElement(By.cssSelector(cssSelectorForHost5)).getShadowRoot();
        Thread.sleep(3000);
        shadow5.findElement(By.cssSelector(cssSelectorForHost6)).click();
        Thread.sleep(3000);
        WebElement iframe = shadow1.findElement(By.cssSelector("#gsft_main"));
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        caller.click();
        caller.sendKeys("Christine Lappalainen (cl01380)");
        caller.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        assignmentgroup.click();
        assignmentgroup.sendKeys("Vendor.soroc");
        assignmentgroup.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        affectedci.sendKeys("CC Outbound Dialer-39262");
        affectedci.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        Select se1 = new Select(incidenttype);
        se1.selectByVisibleText("Application");
        Thread.sleep(3000);
        Select se2 = new Select(category);
        se2.selectByVisibleText("Application");
        Thread.sleep(3000);
        Select se3 = new Select(subcategory);
        se3.selectByVisibleText("database");
        Thread.sleep(3000);
        openby.sendKeys("to-ibs.CI-QA");
        openby.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        shortdesc.sendKeys("testing");
        shortdesc.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        desc.sendKeys("testing");
        desc.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        caseexchangetab.click();
        Thread.sleep(3000);
        locationcontact.click();
        locationcontact.sendKeys("Collin Feltham (felthamc)");
        locationcontact.sendKeys(Keys.ENTER);
        //Following for Soroc only
        Thread.sleep(3000);
        vendormake.click();
        vendormake.sendKeys("test");
        vendormake.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        Select se4 = new Select(vendorworktype);
        se4.selectByVisibleText("Branch");
        Thread.sleep(3000);
        vendormodel.click();
        vendormodel.sendKeys("test");
        vendormodel.sendKeys(Keys.ENTER);
        //Soroc fields ends here.*/
        techinstruction.click();
        techinstruction.sendKeys("Created from CIBC side");
        techinstruction.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        save.click();
        driver.switchTo().alert().accept(); 
    }

    /*public void searchFunction() throws IOException, InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('svg').click();");
        js.executeScript("document.querySelector('#sncwsgs-typeahead-input').value = 'INC11586104';");
    }*/
}