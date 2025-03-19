package Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import healthcareKeywords.Keyword1;

public class baseHealthcare {

	public WebDriver driver;
	Keyword1 keyword = new Keyword1();

	@BeforeMethod
	public void setup() throws Exception {

		ChromeDriver driver = new ChromeDriver();
		healthcareKeywords.Keyword1.driver = driver;

		Keyword1 keyword = new Keyword1();
		keyword.openBrowser(ConfigHealthcare.getBrowserName());
		// keyword.maximizeBrowser();
		keyword.openUrl(ConfigHealthcare.getAppUrl("stage"));

	}

	 @AfterMethod
	 public void closeBrowser() throws Exception {
	keyword.quitAllWindows();
}

}
