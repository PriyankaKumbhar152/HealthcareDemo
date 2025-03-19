package HealthcarePages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import healthcareKeywords.Keyword1;

public class LoginPageHealthcare {

	@FindBy(xpath = "//input[@id=\"username\"]")                                    // xpath for username
	public WebElement Username;

	@FindBy(xpath = "//input[@id=\"password\"]")                                        //xpath for password
	public WebElement Password;

	@FindBy(xpath = "//ul[@id=\"sessionLocation\"]")                                   //xpath foe location for session
	public WebElement Session;
	
	@FindBy(xpath = "//input[@id=\"loginButton\"]")                                   //xpath for login
	public WebElement Login;


	@FindBy(xpath="//div[@id=\"error-message\"]")                                   //xpath for error message for username
	public static WebElement errorMessageforusername;
		
	@FindBy(xpath="//span[@id=\"sessionLocationError\"]")                                   //xpath for error message for location
	public static WebElement errorMessage;
	
	@FindBy(xpath ="//li[@id=\"Pharmacy\"]")                                             //xpath for location pharmacy
    public static WebElement Pharmacy;
	
	public LoginPageHealthcare() {                                                    // create constructor of loginhealthcare
	PageFactory.initElements(Keyword1.getDriver(),this);
	} 
	public void enterUsernamee(String text) {                                         //calling method for username
		Username.sendKeys(text);
	}

	public void enterPassword(String text) {                                          //calling method for password
		Password.sendKeys(text);
	}
	public void clickonLogin(Object driver) {                                                     //calling method for login button
      Login.click();
      FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(6000));
		wait.withMessage("waited to long but didnt appar");
	}
	
	public void clickonPharmacy(Object driver) {
		Pharmacy.click();
	}
	
	 public static String getErrorMessageforusername(String text) {
			return errorMessageforusername.getText();
			}
	 
	 public static String getErrorMessage(String text) {
			return errorMessage.getText();
			}
}
	

