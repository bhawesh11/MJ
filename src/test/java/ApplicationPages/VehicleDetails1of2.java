package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleDetails1of2 {
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(how=How.ID,using="vehicleYear")
	public WebElement textBox_Year;
	
	@FindBy(how=How.ID,using="vehicleMake")
	public WebElement dropDownMake;
	
	public String dropDownMake_Select = "//*[@id='vehicleMake']/option[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="vehicleModel")
	public WebElement dropDownModel;
	
	public String dropDownModel_Select = "//*[@id='vehicleModel']/option[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="vehicleBodyStyle")
	public WebElement dropDownStyle;
	
	public String dropDownStyle_Select = "//*[@id='vehicleBodyStyle']/option[contains(text(),'{0}')]";
	
	public String btn_FinanceOrLease = "//*[@identity='vehicleOwnership']/div/div/label[contains(text(),'{0}')]";
	
	public String btn_vehicleUse = "//*[text()='{0}']";

	@FindBy(how=How.ID,using="vehicleEstMileage")
	public WebElement dropDownMileage;
	
	public String dropDownMileage_Select = "//*[@id='vehicleEstMileage']/option[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="primarilyParked")
	public WebElement dropDownParked;
	
	public String dropDownParked_Select = "//*[@id='primarilyParked']/option[contains(text(),'{0}')]";
	
	
	public String btn_KeptInZIP = "//*[@identity='rdCurrentZipcode']/div/div/label[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="btnContinue")
	public WebElement btn_Next;
	
}
