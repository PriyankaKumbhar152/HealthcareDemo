package HealthcarePages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import healthcareKeywords.Keyword1;

public class RegisterAPatientPage {
	
	private static final CharSequence text = null;

     
	@FindBy(xpath ="//li[@class=\"question-legend focused\"]")                                                       //xpath or click on name
	public WebElement Name;
	
	@FindBy(xpath ="//input[@name=\"givenName\"]")                                                //xpath for given for sendkeys name
	public WebElement Given;
	
	@FindBy(xpath ="//input[@name=\"middleName\"]")                                                  //xpath for sendkeys middle name
	public WebElement Middle;
	
	@FindBy(xpath ="//input[@name=\"familyName\"]")                                                  //xpath for sendkeys finale name
	public WebElement FinalName;
	
	@FindBy(xpath ="//button[@id=\"next-button\"]")                                                  //xpath for button click
    public WebElement Button;	
	
	@FindBy(xpath ="//option[@value=\"F\"]")                                                         //xpath for dropdownlist
	public WebElement DropDownList;
	
	@FindBy(xpath ="//button[@id=\"next-button\"]")                                                  //xpath for next button
	public WebElement NextButton;
	
	@FindBy(xpath ="//input[@max=\"31\"]")                                                             //xpath for date   
	public WebElement Date;
	
	@FindBy(xpath ="//select[@id=\"birthdateMonth-field\"]")                                           //xpath for month dropdown
	public WebElement Month;
	
	@FindBy(xpath ="//input[@min=\"1905\"]")                                                            //xpath for year
	public WebElement Year ;
	
	@FindBy(xpath ="//input[@id=\"birthdateYears-field\"]")                                              //xpath for estimate year
	public WebElement EstimateYear;
	
	@FindBy(xpath ="//input[@id=\"birthdateMonths-field\"]")                                               //xpath for estimate month
	public WebElement EstimateMonth;
	
	@FindBy(xpath ="//button[@id=\"next-button\"]")                                                      //xpath for next btn
	public WebElement NextButton1;
	
	@FindBy(xpath ="//input[@id=\"address1\"]")                                                       //xpath for address
	public WebElement Address;
	 
	@FindBy(xpath ="//input[@id=\"address2\"]")                                                            //xpath for address2
	public WebElement Address2;
	
	@FindBy(xpath ="//input[@id=\"cityVillage\"]")                                                         //xpath for village 
	public WebElement City;
	 
	@FindBy(xpath ="//input[@id=\"stateProvince\"]")                                                            //xpath for city
	public WebElement State;
	
	@FindBy(xpath ="//input[@id=\"country\"]")                                                              //xpath for country
	public WebElement Country;
	
	@FindBy(xpath ="//input[@id=\"postalCode\"]")                                                             //xpath for postal code
	public WebElement PostalCode;
	
	@FindBy(xpath ="//button[@id=\"next-button\"]")                                                            //xpath for next btn
	public WebElement NextButton2;
	
	@FindBy(xpath ="//input[@name=\"phoneNumber\"]")                                                           //xpath for phn no
	public WebElement PhonenNumber;
	 
	@FindBy(xpath ="//button[@id=\"next-button\"]")                                                             //xpath for next btn3
	public WebElement NextButton3;
	
	@FindBy(xpath ="//option[@value=\"8d91a01c-c2cc-11de-8d13-0010c6dffd0f-A\"]")
	public WebElement DropDownListForRelation;
	
	@FindBy(xpath ="//input[@placeholder=\"Person Name\"]")
	public WebElement PersonName;
	
	@FindBy(xpath ="//button[@class=\"confirm right\"]")
	public WebElement NextButton4;
	
	@FindBy(xpath ="//input[@type=\"submit\"]")
	public WebElement Confirm;
	
	//@FindBy(xpath ="")
	public WebElement PlusIcon;
	
	public RegisterAPatientPage() {                                                   
		PageFactory.initElements(Keyword1.getDriver(),this);
		} 
	
	public void clickonName() {                                                                         //method calling for name
		Name.click();
	}

	public void Given( String text) {                                                                //method calling for given /first name
      Given.sendKeys(text);
	}

	public void Middle(String text) {                                                                 //method calling for middle name
		Middle.sendKeys(text);
	}
	
	public void FinalName(String text) {                                                              //method calling for final name
       FinalName.sendKeys(text);
	}
	
	public void clickonButton() {                                                                     //method calling for click on button
      Button.click();
	}

	public void selectDropDownList() {                                                               //method calling for dropdownlist
     	DropDownList.click();	
	}

	public void NextButton() {                                                                       //method calling for next button
      NextButton.click();
	}
	
	public void Day(String text) {                                                                   //method calling for day
     Date.sendKeys(text);
	}
	public void Month() {                                                                            //method calling for dropdown lost for month
     Month.click();
	}
	
	public void Year(String text) {                                                                   //method calling for  year
     Year.sendKeys(text);
	} 
	public void EstimateYear(CharSequence text) {                                                     //method calling for estimateyear
    EstimateYear.sendKeys(text);
	}
	public void EstimateMonth(CharSequence text ) {                                                         //method calling for estimatemonth
	EstimateMonth.sendKeys(text);
	}
	public void clickonNextButton1() {
    NextButton1.click();
	}
	public void Address(String text) {
    Address.sendKeys(text);
	}
	public void Address2(String text) {
    Address2.sendKeys(text);
	}
	public void City(String text) {
    City.sendKeys(text);
	}
	public void State(String text) {
    State.sendKeys(text);
	}
	public void Country(String text) {
    Country.sendKeys(text);
	}
	public void PostalCode(String text) {
    PostalCode.sendKeys(text);
	}
	public void clickonNextButton2() {
    NextButton2.click();
	}
	public void PhoneNumber(String text) {
    PhonenNumber.sendKeys(text);
	}
	public void clickonNextButton3() {
    NextButton3.click();
	}
	public void DropDownListForRelation() {
    DropDownListForRelation.click();
	}
	public void PersonName(String text) {
    PersonName.sendKeys(text);
	}
	public void clickonNextButton4() {
    NextButton4.click();
	}
	public void Confirm() {
    Confirm.click();
	}
}
