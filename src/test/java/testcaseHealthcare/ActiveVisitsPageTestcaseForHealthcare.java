package testcaseHealthcare;

import org.testng.annotations.Test;

import Baseclass.baseHealthcare;
import HealthcarePages.ActiveVisitPageForHealthcare;
import HealthcarePages.HomePageHealthcare;
import HealthcarePages.LoginPageHealthcare;
import healthcareKeywords.Keyword1;

public class ActiveVisitsPageTestcaseForHealthcare extends baseHealthcare {

	@Test
	public void toVerifySearchActiveVisitsOfPatients() {
		Keyword1 keyword = new Keyword1();

		LoginPageHealthcare login = new LoginPageHealthcare(); // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		ActiveVisitPageForHealthcare visit = new ActiveVisitPageForHealthcare();
		visit.ActiveVisits.click();
		visit.Search.sendKeys("Paul Skinner");
		
	}
}
