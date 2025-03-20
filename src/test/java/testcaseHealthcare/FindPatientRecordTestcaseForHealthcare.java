package testcaseHealthcare;

import org.testng.annotations.Test;

import Baseclass.baseHealthcare;
import HealthcarePages.FindPatientRecordForHealthcare;
import HealthcarePages.HomePageHealthcare;
import HealthcarePages.LoginPageHealthcare;
import healthcareKeywords.Keyword1;

public class FindPatientRecordTestcaseForHealthcare extends baseHealthcare{

	@Test
	public void toVerifyFindPatientRecord() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		//home.clickonRegisterAPatient();
		FindPatientRecordForHealthcare Record = new FindPatientRecordForHealthcare();
		Record.clickonFindPatientRecord();
		Record.SearchByIdOrName("Jade John");
	}
	
}
