package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DriverInfo2of2 {

    //	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

    public String btn_ValidLicense="//*[@identity='HasValidUSLicense']/div/div/label[contains(text(),'{0}')]";
    
    @FindBy(id="driverLicenseStatus")
    public WebElement dropdown_LicenseStatus;
    
    public String dropdown_LicenseStatusSelect="//*[@id='driverLicenseStatus']/option[contains(text(),'{0}')]";
    
    @FindBy(xpath="//*[@id='NonLicensedDriverFollowupNo']/parent::div[@Class='ng-scope']")
    public WebElement btn_driveAnyYourVehicle;
    
    public String btn_AgeFirstLicensed = "//*[@identity='ageLicensedOption']/div/div/label[text()='{0}']";
    
    public String btn_vehicleAssignment = "//*[@identity='driverPrimaryVehicle']/div/label[contains(text(),'{0}')]";
    
    public String btn_IncidentHistory = "//*[@identity='HasIncidents']/div/div/label[contains(text(),'{0}')]";

    @FindBy(id="btnContinue")
    public WebElement btn_Next;

    @FindBy(xpath="//*[@id=\"lnkBtnAddNewVehicle\"]")
    public WebElement btn_AddAnotherDriver;
    
    @FindBy(xpath="//input[@name=\"driverPrimaryVehicle\"]/following::label")
    public WebElement DPF_btn_VehicleDriveMostOften;
}