package testcaseHealthcare;

import org.testng.annotations.Test;

import Baseclass.baseHealthcare;
import HealthcarePages.CaptureVitalsPageHealthcare;
import HealthcarePages.HomePageHealthcare;
import HealthcarePages.LoginPageHealthcare;
import Page.finishLabPage;
import healthcareKeywords.Keyword1;

public class CaptureVitalsPageTestcaseForHealthcare extends baseHealthcare {

	@Test
	public void toVerifyThatOnCaptureVitalsPgePatientNameDisplayOrNot(Object text) {
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		HomePageHealthcare home = new HomePageHealthcare();
		CaptureVitalsPageHealthcare capture = new CaptureVitalsPageHealthcare();
		capture.CaptureVitals.click();
		capture.ClickOnName.click();
		}

	@Test
	public void toVerifyThatFindAnotherPatientsRecordOrNot() {
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		HomePageHealthcare home = new HomePageHealthcare();
		CaptureVitalsPageHealthcare capture = new CaptureVitalsPageHealthcare();
		capture.CaptureVitals.click();
		capture.ClickOnName.click();
		capture.FindAnotherPatient.click();
	}
}

