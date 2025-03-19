package HealthcarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import healthcareKeywords.Keyword1;

public class ManageServiceTypePageHealthcare {

	@FindBy(xpath = "//a[@id=\"appointmentschedulingui-manageAppointmentTypes-app\"]")
	public WebElement Manageservicetype;

	@FindBy(xpath = "//button[@class=\"confirm appointment-type-label right\"]")
	public WebElement NewServiceType;
	
	@FindBy(xpath="//input[@id=\"name-field\"]")
	public WebElement Name;
	
	@FindBy(xpath="//input[@name=\"duration\"]")
	public WebElement Duration;
	
	@FindBy(xpath="")
	public WebElement Discription;
	
	@FindBy(xpath="//input[@id=\"save-button\"]")
	public WebElement Save;
	

	public ManageServiceTypePageHealthcare() {
		PageFactory.initElements(Keyword1.getDriver(), this);
	}

	public void clickonManageservicetype() {
		Manageservicetype.click();
	}

	public void clickonNewServiceType() {
		NewServiceType.click();
	}

	public void Name(CharSequence text) {
		Name.sendKeys(text);
	}
	public void Duration(String text) {
		Duration.sendKeys(text);
 }
   public void clickonSave() {
	   Save.click();
   }
	
	
}
