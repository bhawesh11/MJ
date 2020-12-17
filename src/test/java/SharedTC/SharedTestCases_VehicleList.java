package SharedTC;


import ApplicationPages.VehicleList;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import resources.TestData;

public class SharedTestCases_VehicleList  {

    
       //	VEHICLE LIST
    public void vehicleList(Testing test)
    {
        test.setPage(VehicleList.class);
        VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, test.getPage());

        int NoOfVehicle = Integer.parseInt(test.getTestData("Scenario.Vehicle"));
        for (int additionalVehicle = 2; additionalVehicle <= NoOfVehicle; additionalVehicle++) //additionalVehicle resets to '2'
        {
            if (NoOfVehicle != 1)
            {
                test.webFunctions().click(test,vehicleList.btn_AddAnotherVehicle);
                SharedTestCases_VehicleDetails1of2.vehicleDetails_1of2(test,additionalVehicle);
                SharedTestCases_VehicleDetails2of2.vehicleDetails_2of2(test,additionalVehicle);

            }

        }

        test.webFunctions().click(test,vehicleList.btn_Next);
        test.getLogger().info("VehicleList page: Success!");
    }


}
