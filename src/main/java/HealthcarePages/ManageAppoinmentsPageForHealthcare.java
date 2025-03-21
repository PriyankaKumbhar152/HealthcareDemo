package HealthcarePages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import healthcareKeywords.Keyword1;

public class ManageAppoinmentsPageForHealthcare {

	@FindBy(xpath="//a[@href=\"/openmrs/coreapps/findpatient/findPatient.page?app=appointmentschedulingui.schedulingAppointmentApp&\"]")
	public WebElement ManageAppoinments;
	
	@FindBy(xpath="//input[@placeholder=\"Search by ID or Name\"]")
	public WebElement SearchByidOrName;

	@FindBy(xpath="//i[@class=\"small icon-remove-sign\"]")
	public WebElement CloseIcon;
	
	@FindBy(xpath="//tbody[@aria-live=\"polite\"]")
	public WebElement ClickOnName;
	
	public ManageAppoinmentsPageForHealthcare() {
		PageFactory.initElements(Keyword1.getDriver(), this);
	}
	
	public void ManageAppoinments() {
		ManageAppoinments.click();
	}
	public void SearchByidOrName(CharSequence text, Object driver) {
		SearchByidOrName.sendKeys(text);
		
	}
	public void CloseIcon() {
		CloseIcon.click();
	}
	public void ClickOnName(WebDriver driver) {
        ClickOnName.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
        element.click();

	}
}
