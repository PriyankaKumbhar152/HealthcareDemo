package HealthcarePages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import healthcareKeywords.Keyword1;

public class FindPatientRecordPageForHealthcare {

	@FindBy(xpath="//a[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]")
    public WebElement FindPatientRecord;
	
	@FindBy(xpath="//input[@id=\"patient-search\"]")
	public WebElement SearchByIdOrName;
	
	@FindBy(xpath="//td[text()='Priyanka Prashant Kumbhar']")
	public WebElement ClickOnname;
	
	@FindBy(xpath="//span[@class=\"show\"]")
	public WebElement ClickOnShow;
	
	@FindBy(xpath="//span[@class=\"hide\"]")
	public WebElement ClickOnHide;
	
	@FindBy(xpath="//small[@id=\"contact-info-inline-edit\"]")
	public WebElement Edit;
	
	@FindBy(xpath="//input[@id=\"address1\"]")
	public WebElement Address;
	
	@FindBy(xpath="//a[@id=\"save-form\"]")
	public WebElement SaveForm;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	public WebElement Confirm;
	
	@FindBy(css="i.icon-sticky-note")
	public WebElement StickyNote;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter a note\"]")
	public WebElement EditNote;
	
	@FindBy(xpath="//span[@class=\"icon-ok icon-white\"]")
	public WebElement OkClick;
	
	public FindPatientRecordPageForHealthcare() {
	    PageFactory.initElements(Keyword1.getDriver(),this);
	} 
	
	public void clickonFindPatientRecord() {
		FindPatientRecord.click();
	}
	public void SearchByIdOrName(CharSequence text) {
		SearchByIdOrName.sendKeys(text);
	}
	public void ClickOnname() {
		ClickOnname.click();
	}
	public void ClickOnShow() {
		ClickOnShow.click();
	}
	public void ClickOnHide() {
		ClickOnHide.click();
	}
	public void Edit(WebDriver driver) {
		Edit.click();

	}
	public void Address(CharSequence text) {
		Address.sendKeys(text);
	}
	public void SaveForm() {
		SaveForm.click();
	}
	public void Confirm() {
		Confirm.click();
	}
	public void StickyNote() {
		StickyNote.click();;
	}
	public void EditNote(CharSequence text) {
		EditNote.sendKeys(text);
	}
	public void OkClick() {
		OkClick.click();
	}
	
}
