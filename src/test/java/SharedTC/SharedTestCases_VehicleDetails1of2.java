package SharedTC;

import ApplicationPages.VehicleDetails1of2;
import ApplicationPages.VehicleDetails2of2;
import ApplicationPages.VehicleList;
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
        try {
            if(vehicleDetails1of2.btn_rideSharingNo.isDisplayed()==true){
                test.webFunctions().click(test,vehicleDetails1of2.btn_rideSharingNo);
            }}catch (Exception e) {}
        test.webFunctions().click(test,vehicleDetails1of2.btn_vehicleUse,test.getTestData("Vehicle.V1.Use"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMileage);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMileage_Select,test.getTestData("Vehicle.V1.Mileage"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownParked);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownParked_Select,test.getTestData("Vehicle.V1.Parked"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_KeptInZIP,test.getTestData("Vehicle.V1.KeptinZip"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_Next);
        test.getLogger().info("Vehicle Details 1of2 page: Success!");
    }

    public void vehicleDetails_1of2(Testing test,int count) {
        test.setPage(VehicleDetails1of2.class);
        VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,vehicleDetails1of2.textBox_Year, test.getTestData("Vehicle.V"+count+".Year"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMake);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMake_Select,test.getTestData("Vehicle.V"+count+".Make"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownModel);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownModel_Select,test.getTestData("Vehicle.V"+count+".Model"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_FinanceOrLease,test.getTestData("Vehicle.V"+count+".Financeorlease"));
        try {
            if(vehicleDetails1of2.btn_rideSharingNo.isDisplayed()==true){
                test.webFunctions().click(test,vehicleDetails1of2.btn_rideSharingNo);
            }}catch (Exception e) {}
        test.webFunctions().click(test,vehicleDetails1of2.btn_vehicleUse,test.getTestData("Vehicle.V"+count+".Use"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMileage);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownMileage_Select,test.getTestData("Vehicle.V"+count+".Mileage"));
        test.webFunctions().click(test,vehicleDetails1of2.dropDownParked);
        test.webFunctions().click(test,vehicleDetails1of2.dropDownParked_Select,test.getTestData("Vehicle.V"+count+".Parked"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_KeptInZIP,test.getTestData("Vehicle.V"+count+".KeptinZip"));
        test.webFunctions().click(test,vehicleDetails1of2.btn_Next);
        test.getLogger().info("Vehicle Details 1of2 page: Success!");
        
       
    }
    
    public void vehicleDetails_2of2(Testing test,int count) {
        test.setPage(VehicleDetails2of2.class);
        VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,vehicleDetails2of2.dropDownYearBought);
        test.webFunctions().click(test,vehicleDetails2of2.dropDownYearBought_Select, test.getTestData("Vehicle.V"+count+ ".YearBought"));
        test.webFunctions().click(test,vehicleDetails2of2.dropDownMonthBought);
        test.webFunctions().click(test,vehicleDetails2of2.dropDownMonthBought_Select, test.getTestData("Vehicle.V"+count+".MonthBought"));
        test.webFunctions().click(test,vehicleDetails2of2.btn_OwnedByYou, test.getTestData("Vehicle.V"+count+".Ownedbyyou"));
        try{if(vehicleDetails2of2.checkBox_CrashAvoidance.isDisplayed()) {
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_HandsFree);
        test.webFunctions().click(test,vehicleDetails2of2.checkBox_CrashAvoidance);
        }}catch(Exception e) {}
        try {
        if(vehicleDetails2of2.btn_Antitheft_Yes.isDisplayed()) {
        	test.webFunctions().click(test,vehicleDetails2of2.btn_Antitheft, test.getTestData("Vehicle.V"+count+".AntiTheft"));
        }
        }catch(Exception e) {}
        test.webFunctions().click(test,vehicleDetails2of2.btn_Next);
        test.getLogger().info("Vehicle Details 2of2 page: Success!");
    }
    
    public void vehicleList(Testing test, int count)
    {
        test.setPage(VehicleList.class);
        VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, test.getPage());
        if(count==test.vehicleCount) {
        test.webFunctions().click(test,vehicleList.btn_Next);
                test.getLogger().info("VehicleList page: Success!");
        }
        else {
        	test.webFunctions().click(test,vehicleList.btn_AddAnotherVehicle);
            test.getLogger().info("VehicleList page: Success!");
        }
    } 
    
    
    
    public void  vehicleDetails(Testing test) {
    	for (int count = 1; count <= test.vehicleCount; count++) {
			vehicleDetails_1of2(test,count);
			vehicleDetails_2of2(test,count);
			vehicleList(test,count);
		}
    }
}
