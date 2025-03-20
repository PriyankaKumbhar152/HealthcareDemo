package HealthcarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import healthcareKeywords.Keyword1;

public class FindPatientRecordForHealthcare {

	@FindBy(xpath="//a[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")

	WebElement FindPatientRecord;
	
	@FindBy(xpath="//input[@id=\"patient-search\"]")
	WebElement SearchByIdOrName;
	
	public FindPatientRecordForHealthcare() {
	     PageFactory.initElements(Keyword1.getDriver(),this);
	} 
	
	public void clickonFindPatientRecord() {
		FindPatientRecord.click();
	}
	public void SearchByIdOrName(CharSequence text) {
		SearchByIdOrName.sendKeys(text);
	}
}
