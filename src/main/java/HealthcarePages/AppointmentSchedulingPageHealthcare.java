package HealthcarePages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import healthcareKeywords.Keyword1;

public class AppointmentSchedulingPageHealthcare {

	@FindBy(xpath="//a[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]")
	public WebElement onAppointment;
	
	public AppointmentSchedulingPageHealthcare() {
    PageFactory.initElements(Keyword1.getDriver(), this);
	}

	public void ClickonAppointment() {
    onAppointment.click();
	}
}
