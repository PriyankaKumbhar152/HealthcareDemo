package HealthcarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import healthcareKeywords.Keyword1;

public class ActiveVisitPageForHealthcare {

	
	@FindBy(xpath="//a[@id=\"org-openmrs-module-coreapps-activeVisitsHomepageLink-org-openmrs-module-coreapps-activeVisitsHomepageLink-extension\"]")
	public WebElement ActiveVisits;
	
	@FindBy(xpath="//input[@type=\"search\"]")
	public WebElement Search;
	
	public ActiveVisitPageForHealthcare() {
	     PageFactory.initElements(Keyword1.getDriver(),this);
	} 
	public void clickonActiveVisits() {
		ActiveVisits.click();
	}
	public void Search(CharSequence text) {
		Search.sendKeys(text);
	}
}
