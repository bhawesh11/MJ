package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriverList {
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(id="btnContinue")
	public WebElement btn_DoneWithDrivers;

	@FindBy(xpath="//*[@id=\"lnkBtnAddNewVehicle\"]")
	public WebElement btn_AddAnotherDriver;

	public String btn_RemoveDriver = "//div[contains(text(),'{0}')]/ancestor::div[3]/div/div[2]/button";

	@FindBy(xpath="//*[@id=\"btnCancel\"]")
	public WebElement btn_RemoveDriverPopup;

	//-------DPF Elements-------------------------------------------
	
	@FindBy(xpath="(//div[@ng-repeat='driver in driverList.prefillDrivers']/div/label)[1]")
	public WebElement checkboxDPF_SelectFirstDriver;
		
	String checkboxDPF_SelectDriver = "(//div[@ng-repeat='driver in driverList.prefillDrivers']/div/label)[{0}]";
	
	public String checkboxDPF_SelectDrivers = "//div[@ng-repeat='driver in driverList.prefillDrivers']/div/label/div/span[contains(text(),'{0}')]";


}
