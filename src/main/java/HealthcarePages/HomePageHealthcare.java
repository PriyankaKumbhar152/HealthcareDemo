package HealthcarePages;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import healthcareKeywords.Keyword1;

public class HomePageHealthcare {

	@FindBy(xpath = "//a[@id=\"referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension\"]")
	public WebElement RegisterAPatient; // xpath for register a patient button

	public HomePageHealthcare() {
		PageFactory.initElements(Keyword1.getDriver(), this);
	}

	public void clickonRegisterAPatient() { // method calling register a patient
		RegisterAPatient.click();
	}


}
