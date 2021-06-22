package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Agency_V8 {
	
//	POLICYHOLDER PAGE
	
	@FindBy(id="btnContinue")
	public WebElement btn_Next;
	
//	VEHICLES DETAILS PAGE
	
	@FindBy(xpath="//input[@id='originalOwnerYes']/ancestor::div[1]/label[1]")
	public WebElement btn_CurrentOwner_YES;
	
	@FindBy(xpath="//input[@id='originalOwnerNo']/ancestor::div[1]/label[1]")
	public WebElement btn_CurrentOwner_NO;
	
	@FindBy(xpath="//input[@id='transferVehicalOwnershipYes']/ancestor::div[1]/label[1]")
	public WebElement btn_FutureOwner_YES;
	
	@FindBy(id="vehicleUsage-")
	public WebElement dropdown_PrimaryUse;
	
	@FindBy(xpath="//option[@text='Pleasure']")
	public WebElement dropdown_PrimaryUse_Pleasure;
	
	@FindBy(id="yearSelection_ddl")
	public WebElement dropdown_YearPurchased;
	
	@FindBy(xpath="//option[@text='2021']")
	public WebElement dropdown_YearPurchased_2021;
	
	@FindBy(id="monthSelection_ddl")
	public WebElement dropdown_MonthPurchased;
	
	@FindBy(xpath="//option[@text='January']")
	public WebElement dropdown_MonthPurchased_JAN;
	
	@FindBy(id="primarilyParked")
	public WebElement dropdown_PrimaryParked;
	
	@FindBy(xpath="//option[@text='Driveway']")
	public WebElement dropdown_PrimaryParked_Driveway;
	
	@FindBy(id="btnContinue")
	public WebElement btn_SaveVehicle;
	
//	VEHICLE LIST PAGE

	@FindBy(id="btnContinue")
	public WebElement btn_DonewithVehicles;
	
//	DRIVER DETAILS PAGE
	
	
}
