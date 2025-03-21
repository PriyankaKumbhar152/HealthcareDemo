package testcaseHealthcare;

import org.testng.annotations.Test;

import Baseclass.baseHealthcare;
import HealthcarePages.AppointmentSchedulingPageHealthcare;
import HealthcarePages.HomePageHealthcare;
import HealthcarePages.LoginPageHealthcare;
import HealthcarePages.ManageAppoinmentsPageForHealthcare;
import healthcareKeywords.Keyword1;

public class ManageAppoinmentTestcasePageForHealthcare extends baseHealthcare{
	
    @Test
	public void toVerifyThatPatientSearchByThereName() {
    	Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage

		AppointmentSchedulingPageHealthcare home4 = new AppointmentSchedulingPageHealthcare();
		home4.ClickonAppointment();
		ManageAppoinmentsPageForHealthcare search = new ManageAppoinmentsPageForHealthcare();
		
		search.ManageAppoinments.click();
		search.SearchByidOrName.sendKeys("Priyanka Prashant Kumbhar");
		}
    
    @Test
    public void ToVerifyThatIfWeSearchPatientWithThereId() {
    	Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage

		AppointmentSchedulingPageHealthcare home4 = new AppointmentSchedulingPageHealthcare();
		home4.ClickonAppointment();
		ManageAppoinmentsPageForHealthcare search = new ManageAppoinmentsPageForHealthcare();
		
		search.ManageAppoinments.click();
		search.SearchByidOrName.sendKeys("100K8T");
		search.CloseIcon.click();
	    search.ClickOnName.click();
	}
}
