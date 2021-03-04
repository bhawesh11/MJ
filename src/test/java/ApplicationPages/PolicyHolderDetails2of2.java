package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PolicyHolderDetails2of2 {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	public String btn_ValidLicense="//*[@identity='HasValidUSLicense']/div/div/label[contains(text(),'{0}')]";

	@FindBy(id="driverLicenseStatus")
	public WebElement dropdown_DriverLicenseStatus;

	public String dropdown_LicenseStatusSelect = "//*[@id=\"driverLicenseStatus\"]/option[contains(text(),'{0}')]";
	
	public String btn_AgeFirstLicensed = "//*[@identity='ageLicensedOption']/div/div/label[text()='{0}']";

	public String btn_vehicleAssignment = "//*[@identity='ageLicensedOption']/div/div/label[text()='{0}']";

	public String btn_IncidentHistory = "//*[@identity='HasIncidents']/div/div/label[contains(text(),'{0}')]";

	public String btn_VehicleDriveMostOften = "//label[contains(text(),'{0}')]";
	//{0} : Year + Make + Model

	@FindBy(id="btnContinue")
	public WebElement btn_Next;
	
}

//
	