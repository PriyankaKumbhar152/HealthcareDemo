package HealthcarePages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import healthcareKeywords.Keyword1;

public class ManageProviderSchedulePageHealthcare {

	
	@FindBy(xpath="//a[@id=\"appointmentschedulingui-scheduleProviders-app\"]")
	public WebElement ManageProviderSchedule;
	
	@FindBy(xpath="//select[@ng-options=\"l.display for l in locations\"]")
	public WebElement LocationList;
	
	@FindBy(xpath="//input[@ng-model=\"providerFilter\"]")
	public WebElement Provider;
	
	@FindBy(xpath="//input[@id=\"viewAppointmentBlock\"]")
	public WebElement Services;
	
	@FindBy(xpath="//a[@ng-click=\"displayViewAll()\"]")
	public WebElement ViewDetails;   

	@FindBy(xpath="//a[@class=\"ng-binding\"][text()='Gynecology']")
	public WebElement Gynecology;
	
	@FindBy(xpath="//a[text()='infection']")
    public WebElement Infection;
	
	public ManageProviderSchedulePageHealthcare() {
		PageFactory.initElements(Keyword1.getDriver(), this);
	}

	public void ManageProviderSchedule(Object driver) {
	ManageProviderSchedule.click();	
	 FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
	    wait.pollingEvery(Duration.ofMillis(1000));
		wait.withMessage("waited to long but didnt appar");   
	

	}
    public void selectLocationList(Object Exceptions, Object driver)  {                                        //for location dropdown	
   // LocationList.sendKeys("");
    
     Select select = new Select(LocationList);                                                              //to handlemultidropdownlist 
    select.selectByVisibleText("");
    FluentWait wait = new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(15));
    wait.pollingEvery(Duration.ofMillis(1000));
	wait.withMessage("waited to long but didnt appar");                                  
	ArrayList exceptions = new ArrayList<Exception>();                                                   //use arraylist for exception handling
	exceptions.add(NoSuchElementException.class);
	exceptions.add(IllegalArgumentException.class);
	wait.ignoreAll(exceptions);
}
  

	public void Provider(String text) {
    Provider.sendKeys(text);
	}
    public void Services(Object driver) { 
    Services.click();
    
  
    
    FluentWait wait = new FluentWait(driver);
   	wait.withTimeout(Duration.ofSeconds(15));
       wait.pollingEvery(Duration.ofMillis(1000));
   	wait.withMessage("waited to long but didnt appar");                                  
   	ArrayList exceptions = new ArrayList<Exception>();                                          //use arraylist for exception handling
   	exceptions.add(NoSuchElementException.class);
   	exceptions.add(UnexpectedTagNameException.class);
   	exceptions.add(IllegalArgumentException.class);
   	exceptions.add(ElementNotInteractableException.class);
   	wait.ignoreAll(exceptions);
    }
    public void ViewDetails() {
    ViewDetails.click();
    }
    public void Gynecology() {
    	Gynecology.click();
    }
    public void Infection() {
    Infection.click();
    }
    
}
    

	

