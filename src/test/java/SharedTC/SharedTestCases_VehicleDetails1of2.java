package SharedTC;

import ApplicationPages.VehicleDetails1of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_VehicleDetails1of2 {

    Logger  log = Logger.getLogger("Shared Test Case_Web");


    //TEST ===========================================================
    public void vehicleDetails1of2(Testing test) {
        test.setPage(VehicleDetails1of2.class);
        VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,vehicleDetails1of2.textBox_Year, test.getTestData("Vehicle.V1.Year"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMake);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMake_Select,test.getTestData("Vehicle.V1.Make"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownModel);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownModel_Select,test.getTestData("Vehicle.V1.Model"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_FinanceOrLease,test.getTestData("Vehicle.V1.Financeorlease"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_vehicleUse,test.getTestData("Vehicle.V1.Use"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMileage);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMileage_Select,test.getTestData("Vehicle.V1.Mileage"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownParked);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownParked_Select,test.getTestData("Vehicle.V1.Parked"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_KeptInZIP,test.getTestData("Vehicle.V1.KeptinZip"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_Next);
        test.getLogger().info("Vehicle Details 1of2 page: Success!");
    }


}
