package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DriverAssignment {

	//Select vehicle to choose primary driver of the vehicle.
	public String SelectVehicle= "//select[contains(@id,'vehicle-{0}')]"; // Replace the vehicle index with {0} starting from 0
		
	//Select driver who drives the most
	public String SelectDriver= "//select/option[contains(text(),'{0}')]"; // Replace the driver name with {0}
	
	@FindBy(id="btnNext")
    public WebElement btn_Next;
}
