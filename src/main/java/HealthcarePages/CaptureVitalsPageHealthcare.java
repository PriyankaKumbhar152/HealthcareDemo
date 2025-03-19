package HealthcarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import healthcareKeywords.Keyword1;

public class CaptureVitalsPageHealthcare {

	
	@FindBy(xpath="//a[@id=\"referenceapplication-vitals-referenceapplication-vitals-extension\"]")
	public WebElement CaptureVitals;
	
	@FindBy(xpath="//input[@id=\"patient-search\"]")
	public WebElement SearchName;
	
	 public CaptureVitalsPageHealthcare() {
     PageFactory.initElements(Keyword1.getDriver(),this);
		} 
	 
	 public void clickonCaptureVitals() {
		 CaptureVitals.click();
	 }
	public void SearchName(String text) {
		SearchName.sendKeys(text);
	}
}
