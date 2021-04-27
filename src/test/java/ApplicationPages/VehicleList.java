package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleList {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
		
	@FindBy(id="lnkBtnAddNewVehicle")
	public WebElement btn_AddAnotherVehicle;

	@FindBy(id="btnContinue")
	public WebElement btn_Next;
	
	//-------DPF Elements-------------------------------------------
	
	@FindBy(xpath="(//div[@ng-repeat='vehicle in vehicleList.prefillVehicles']/div/label)[1]")
	public WebElement checkboxDPF_SelectFirstVehicle;
	
	String checkboxDPF_SelectVehicle = "(//div[@ng-repeat='vehicle in vehicleList.prefillVehicles']/div/label)[{0}]";
    public String checkboxDPF_SelectVehicles = "//div[@ng-repeat='vehicle in vehicleList.prefillVehicles']/div/label/div/div/div[contains(text(),'{0}')]";
	//public String checkboxDPF_SelectVehicles = "//div[@class='vehicle-info-wrap']/div[contains(text(),'{0}')]";
}
