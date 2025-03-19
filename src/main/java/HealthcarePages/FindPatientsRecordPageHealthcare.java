package HealthcarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import healthcareKeywords.Keyword1;

public class FindPatientsRecordPageHealthcare {

	@FindBy(xpath="//a[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")
	public WebElement FindRecord;
	
	@FindBy(xpath="//input[@placeholder=\"Search by ID or Name\"]")
	public WebElement SearchPatient;
	
	 public FindPatientsRecordPageHealthcare() {
	 PageFactory.initElements(Keyword1.getDriver(),this);
	}
	public void clickonFindRecord() {
	FindRecord.click();
	}
	public void SearchPatient(CharSequence text) {
    SearchPatient.sendKeys(text);
	}
	
}
