package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleDetails1of2 {
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(id="vehicleYear")
	public WebElement textBox_Year;
	
	@FindBy(id="vehicleMake")
	public WebElement dropDownMake;
	
	public String dropDownMake_Select = "//*[@id='vehicleMake']/option[contains(text(),'{0}')]";
	
	@FindBy(id="vehicleModel")
	public WebElement dropDownModel;
	
	public String dropDownModel_Select = "//*[@id='vehicleModel']/option[contains(text(),'{0}')]";
	
	@FindBy(id="vehicleBodyStyle")
	public WebElement dropDownStyle;
	
	public String dropDownStyle_Select = "//*[@id='vehicleBodyStyle']/option[contains(text(),'{0}')]";
	
	public String btn_FinanceOrLease = "//*[@identity='vehicleOwnership']/div/div/label[contains(text(),'{0}')]";
	
	public String btn_rideSharingOption = "//label[contains(@for,'rideSharing{0}')]";
	
	@FindBy(xpath="//label[contains(@for,'rideSharingYes')]")
	public WebElement btn_rideSharing;
    
    @FindBy(id="rideSharingHours")
	public WebElement dropDownRidesharingHrs;
    
    public String dropDownRidesharingHrs_Select = "//*[@id=\"rideSharingHours\"]/option[@label='{0}']";
	
	public String btn_vehicleUse = "//*[text()='{0}']";

	@FindBy(id="vehicleEstMileage")
	public WebElement dropDownMileage;
	
	public String dropDownMileage_Select = "//*[@id='vehicleEstMileage']/option[contains(text(),'{0}')]";
	
	@FindBy(id="primarilyParked")
	public WebElement dropDownParked;
	
	public String dropDownParked_Select = "//*[@id='primarilyParked']/option[contains(text(),'{0}')]";
	
	
	public String btn_KeptInZIP = "//*[@identity='rdCurrentZipcode']/div/div/label[contains(text(),'{0}')]";
	
	@FindBy(id="btnContinue")
	public WebElement btn_Next;
	
}
