package SharedTC;

import ApplicationPages.VehicleList;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import resources.TestData;

public class STC_VehicleList {

	// VEHICLE LIST
	public void vehicleList(Testing test) {
		test.setPage(VehicleList.class);
		VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, test.getPage());

		test.webFunctions().click(test, vehicleList.btn_Next);
		test.getLogger().info("VehicleList page: Success!");
	}

	public void vehicleList(Testing test, int count) {
		test.setPage(VehicleList.class);
		VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, test.getPage());
		if (count == test.vehicleCount) {
			test.webFunctions().staticWait(3000);
			test.webFunctions().click(test, vehicleList.btn_Next);
			test.getLogger().info("VehicleList page: Success!");
		} else {
			test.webFunctions().click(test, vehicleList.btn_AddAnotherVehicle);
			test.getLogger().info("VehicleList page: Success!");
		}
	}

	public void DPF_selectVehicle(Testing test, int count) {
		test.setPage(VehicleList.class);
		VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, test.getPage());
		for (count = 1; count <= test.vehicleCount; count++) {
			test.webFunctions().click(test, vehicleList.checkboxDPF_SelectVehicles,
					test.getTestData("Vehicle.V" + count + ".Year"));
		}
		test.webFunctions().click(test, vehicleList.btn_Next);
		test.getLogger().info("DPF Vehicle Selected!");
	}

	public void DPF_vehicleList(Testing test,  int count) {
		 test.setPage(VehicleList.class);
	        VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, test.getPage());
	        
	        if(count<=test.vehicleCount) {
	            test.webFunctions().click(test,vehicleList.DPF_vehicle);
	            test.webFunctions().click(test,vehicleList.btn_Next);
	            test.getLogger().info("VehicleList page: Success!");
	            }
	            else {       
	            test.webFunctions().staticWait(3000);     
	             test.webFunctions().click(test,vehicleList.DPF_vehicle);
	            test.webFunctions().click(test,vehicleList.btn_Next);  
	            test.webFunctions().click(test,vehicleList.btn_Next);
	            test.getLogger().info("VehicleList page: Success!"); 
	                    
	            } 
	}

}
