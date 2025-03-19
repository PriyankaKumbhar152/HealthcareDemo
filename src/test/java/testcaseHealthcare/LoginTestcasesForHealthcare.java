package testcaseHealthcare;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import com.trinity.locator;

import Baseclass.baseHealthcare;
import HealthcarePages.LoginPageHealthcare;
import healthcareKeywords.Keyword1;

public class LoginTestcasesForHealthcare extends baseHealthcare {
	// private static final String text = null;

	@Test
	public void login() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
	}

	@Test
	public void toVerifyThatUsernameIsRequiredOrNot() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

	}

	@Test
	public void toVerifyThatPasswordIsRequiredOrNot() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
	}

	@Test
	public void clickOnRegisterAPatient() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		home.clickonRegisterAPatient();
	}
}
