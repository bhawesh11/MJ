package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDetails2of2 {
	
	@FindBy(id="yearSelection_ddl")
	public WebElement dropDownYearBought;
	
	public String dropDownYearBought_Select = "//*[@id=\"yearSelection_ddl\"]/option[contains(text(),'{0}')]";
	
	@FindBy(id="monthSelection_ddl")
	public WebElement dropDownMonthBought;
	
	public String dropDownMonthBought_Select = "//*[@id=\"monthSelection_ddl\"]/option[contains(text(),'{0}')]";

	public String btn_OwnedByYou = "//*[@identity='originalOwner']/div/div/label[contains(text(),'{0}')]";
	
	@FindBy(xpath="//*[@identity='CustomEquipment']/div/div/label")
	public WebElement checkBox_CustomEquipment;
	
	@FindBy(id="vehicleEquipmentAmount")
	public WebElement dropDown_EstimatedValue;
	
	@FindBy(xpath="//*[@id='chkCrashAvoidance']/following-sibling::label")
	public WebElement checkBox_CrashAvoidance;
	
	@FindBy(xpath="//*[@id='chkHandsFree']/following-sibling::label")
	public WebElement checkBox_HandsFree;
	
	@FindBy(xpath="//label[@for='antiTheftDeviceYes']")
	public WebElement btn_Antitheft_Yes;
	
	@FindBy(xpath="//label[@for='antiTheftDeviceNo']")
	public WebElement btn_Antitheft_No;

	@FindBy(xpath="//*[@id=\"lnkBtnAddNewVehicle\"]")
	public WebElement btn_AddAnotherVehicle;

	@FindBy(id="btnContinue")
	public WebElement btn_Next;
}
