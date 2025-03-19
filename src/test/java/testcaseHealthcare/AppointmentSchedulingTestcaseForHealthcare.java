package testcaseHealthcare;

import org.testng.annotations.Test;

import Baseclass.baseHealthcare;
import HealthcarePages.AppointmentSchedulingPageHealthcare;
import HealthcarePages.LoginPageHealthcare;
import HealthcarePages.ManageProviderSchedulePageHealthcare;
import healthcareKeywords.Keyword1;

public class AppointmentSchedulingTestcaseForHealthcare extends baseHealthcare{

	@Test
	public void toBookAppinmenet() {
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		AppointmentSchedulingPageHealthcare home4 = new AppointmentSchedulingPageHealthcare();
		home4.ClickonAppointment();
		ManageProviderSchedulePageHealthcare home5 = new ManageProviderSchedulePageHealthcare();
		home5.clickonManageProviderSchedule();
	}
	@Test
	public void tobookAppoinment() {
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		
		AppointmentSchedulingPageHealthcare home4 = new AppointmentSchedulingPageHealthcare();
		home4.ClickonAppointment();
		
		ManageProviderSchedulePageHealthcare home5 = new ManageProviderSchedulePageHealthcare();
		home5.clickonManageProviderSchedule();
		home5.selectLocationList("Amani Hospital", home5);
		home5.Provider("Rupali");
		home5.Services(home5);
		home5.ViewDetails();
		home5.Gynecology();
		home5.Infection();
		
	}
}
