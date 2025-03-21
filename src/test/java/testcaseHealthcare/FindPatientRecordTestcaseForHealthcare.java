package testcaseHealthcare;

import org.testng.annotations.Test;

import Baseclass.baseHealthcare;
import HealthcarePages.FindPatientRecordPageForHealthcare;
import HealthcarePages.HomePageHealthcare;
import HealthcarePages.LoginPageHealthcare;
import healthcareKeywords.Keyword1;

public class FindPatientRecordTestcaseForHealthcare extends baseHealthcare{

	@Test
	public void toVerifyPatientRecordFindOrNot() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		
		FindPatientRecordPageForHealthcare record = new FindPatientRecordPageForHealthcare();
		record.clickonFindPatientRecord();
		record.SearchByIdOrName("Priyanka Prashant Kumbhar");
		}
	
	@Test
	public void toVerifyThatIfPatientRecordIsFindThenClickOnIt() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		
		FindPatientRecordPageForHealthcare record = new FindPatientRecordPageForHealthcare();
		record.clickonFindPatientRecord();
		record.SearchByIdOrName("Priyanka Prashant Kumbhar");
		record.ClickOnname.click();
	}
	
	@Test
	public void toVerifyThatAfterDisplyPatientRecordPageShowContactInfo() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		
		FindPatientRecordPageForHealthcare record = new FindPatientRecordPageForHealthcare();
		record.clickonFindPatientRecord();
		record.SearchByIdOrName("Priyanka Prashant Kumbhar");
		record.ClickOnname.click();
		record.ClickOnShow.click();
	}	

	@Test
	private void toVerifyThatAfterDisplayRecordPageShowAndHideContactInfo() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		
		FindPatientRecordPageForHealthcare record = new FindPatientRecordPageForHealthcare();
		record.clickonFindPatientRecord();
		record.SearchByIdOrName("Priyanka Prashant Kumbhar");
		record.ClickOnname.click();
		record.ClickOnShow.click();
		record.ClickOnHide.click();
	}
	@Test
	public void toVerifyThatAfterDisplayPatientRecordPageEditContactInfoOrNot() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		
		FindPatientRecordPageForHealthcare record = new FindPatientRecordPageForHealthcare();
		record.clickonFindPatientRecord();
		record.SearchByIdOrName("Priyanka Prashant Kumbhar");
		record.ClickOnname.click();
		record.ClickOnShow.click();
		record.Edit.click();
		
	}
	@Test
	public void toVerifyThatAfterDisplayPatientRecordPageAddressCanChangeOrNot() {
		Keyword1 keyword = new Keyword1();
		LoginPageHealthcare login = new LoginPageHealthcare();
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		
		FindPatientRecordPageForHealthcare record = new FindPatientRecordPageForHealthcare();
		record.clickonFindPatientRecord();
		record.SearchByIdOrName("Priyanka Prashant Kumbhar");
		record.ClickOnname.click();
		record.ClickOnShow.click();
		record.Edit.click();
		record.Address("Mumbai");
		record.SaveForm.click();
		record.Confirm.click();
		record.StickyNote.click();
		record.EditNote.sendKeys("we can change patients address");
		
		//record.OkClick.click();
	}
}
