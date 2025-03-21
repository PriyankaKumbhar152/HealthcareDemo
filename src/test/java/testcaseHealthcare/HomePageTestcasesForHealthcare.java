package testcaseHealthcare;

import org.testng.annotations.Test;

import Baseclass.baseHealthcare;
import HealthcarePages.AppointmentSchedulingPageHealthcare;
import HealthcarePages.CaptureVitalsPageHealthcare;
import HealthcarePages.FindPatientsRecordPageHealthcare;
import HealthcarePages.HomePageHealthcare;
import HealthcarePages.LoginPageHealthcare;
import HealthcarePages.ManageServiceTypePageHealthcare;
import HealthcarePages.RegisterAPatientPage;
import healthcareKeywords.Keyword1;

public class HomePageTestcasesForHealthcare extends baseHealthcare {

	@Test
	public void registerAPatient() {
		Keyword1 keyword = new Keyword1();

		LoginPageHealthcare login = new LoginPageHealthcare(); // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		home.clickonRegisterAPatient();

		RegisterAPatientPage home1 = new RegisterAPatientPage(); // object create for registre patient page
		home1.clickonName();
		home1.Given("Priyanka");
		home1.Middle("Prashant");
		home1.FinalName("Kumbhar");
		home1.clickonButton();
		home1.selectDropDownList();
		home1.NextButton();

		home1.Day("06");
		home1.Month();
		home1.Year("1995");
		home1.EstimateMonth("09");
		home1.EstimateYear("29");
		home1.clickonNextButton1();

		home1.Address("Pune");
		home1.Address2("Wakad");
		home1.City("Pimpri");
		home1.State("Maharashtra");
		home1.Country("India");
		home1.PostalCode("410501");
		home1.clickonNextButton2();

		home1.PhoneNumber("9284938020");
		home1.clickonNextButton3();

		home1.DropDownListForRelation();
		home1.PersonName("Ankita");
		home1.clickonNextButton4();

		home1.Confirm();
	}

	@Test
	public void StartVisitOfPatient() {
		Keyword1 keyword = new Keyword1();

		LoginPageHealthcare login = new LoginPageHealthcare(); // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		HomePageHealthcare home = new HomePageHealthcare(); // object create for homepage
		home.clickonRegisterAPatient();

		RegisterAPatientPage home1 = new RegisterAPatientPage(); // object create for registre patient page
		home1.clickonName();
		home1.Given("Priyanka");
		home1.Middle("Prashant");
		home1.FinalName("Kumbhar");
		home1.clickonButton();
		home1.selectDropDownList();
		home1.NextButton();

		home1.Day("06");
		home1.Month();
		home1.Year("1995");
		home1.EstimateMonth("09");
		home1.EstimateYear("29");
		home1.clickonNextButton1();

		home1.Address("Pune");
		home1.Address2("Wakad");
		home1.City("Pimpri");
		home1.State("Maharashtra");
		home1.Country("India");
		home1.PostalCode("410501");
		home1.clickonNextButton2();

		home1.PhoneNumber("9284938020");
		home1.clickonNextButton3();

		home1.DropDownListForRelation();
		home1.PersonName("Ankita");
		home1.clickonNextButton4();

		home1.Confirm();

	}

	@Test
	public void toverifyCaptureVitials() {
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);

		CaptureVitalsPageHealthcare home2 = new CaptureVitalsPageHealthcare();                  // object create for capturevitalspage
		home2.clickonCaptureVitals();
		home2.SearchName("Priyanka Prashant Kumbhar");

	}
	
	@Test
	public void toVerifyFindPatientRecordOrNot() {
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		
		//FindPatientsRecordPageHealthcare home3 = new FindPatientsRecordPageHealthcare();
		//home3.clickonFindRecord();
		//home3.SearchPatient("Priyanka Prashant Kumbhar");
		}
	
	@Test
	public void toverifyThatAppointmentScheduleOrNot() {
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		
		AppointmentSchedulingPageHealthcare home4 = new AppointmentSchedulingPageHealthcare();
		home4.ClickonAppointment();
		}
	
	@Test                           
	public void toverifyThatManageServiceType() {                  //nosuchelementexception error
		Keyword1 keyword = new Keyword1();
        LoginPageHealthcare login = new LoginPageHealthcare();                                 // object create for loginpage
		login.enterUsernamee("admin");
		login.enterPassword("Admin123");
		login.clickonPharmacy(login);
		login.clickonLogin(login);
		AppointmentSchedulingPageHealthcare home4 = new AppointmentSchedulingPageHealthcare();
		home4.ClickonAppointment();
		ManageServiceTypePageHealthcare home5 = new ManageServiceTypePageHealthcare();
		home5.clickonManageservicetype();
		home5.clickonNewServiceType();
		home5.clickonNewServiceType();
		home5.Name("Infection");
		home5.Duration("10");
		home5.clickonSave();
		
		}
}


