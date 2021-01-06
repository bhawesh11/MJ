package testElephant;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.Testing;
import java.io.IOException;

//import SharedTC.QuoteAndBind;
public class TC_Elephant {

	Logger log = Logger.getLogger("Test Suite");
	private final String brandName = "Elephant";

	// ==============================================================================================
	//								 *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================
	// Creating Objects :

	 

    SharedTestCases_PostalCode PostalCode = new SharedTestCases_PostalCode();
    SharedTestCases_PolicyHolder PolicyHolder = new SharedTestCases_PolicyHolder();
    SharedTestCases_Address Address = new SharedTestCases_Address();
    SharedTestCases_VehicleDetails1of2 VehicleDetails1of2 = new SharedTestCases_VehicleDetails1of2();
    SharedTestCases_VehicleDetails2of2 VehicleDetails2of2 = new SharedTestCases_VehicleDetails2of2();
    SharedTestCases_VehicleList VehicleList = new SharedTestCases_VehicleList();
    SharedTestCases_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new SharedTestCases_PolicyHolderDetails1of2();
    SharedTestCases_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new SharedTestCases_PolicyHolderDetails2of2();
    SharedTestCases_Spouse1of2 Spouse1of2 = new SharedTestCases_Spouse1of2();
    SharedTestCases_Spouse2of2 Spouse2of2 = new SharedTestCases_Spouse2of2();
    SharedTestCases_DriverInfo1of2 DriverInfo1of2 = new SharedTestCases_DriverInfo1of2();
    SharedTestCases_DriverInfo2of2 DriverInfo2of2 = new SharedTestCases_DriverInfo2of2();
    SharedTestCases_Incidents incidents = new SharedTestCases_Incidents();
    SharedTestCases_DriverList DriverList = new SharedTestCases_DriverList();
    SharedTestCases_DriverAssignment DriverAssignment = new SharedTestCases_DriverAssignment();
    SharedTestCases_InsuranceHistory InsuranceHistory = new SharedTestCases_InsuranceHistory();
    SharedTestCases_PolicyStatrDate PolicyStatrDate = new SharedTestCases_PolicyStatrDate();
    SharedTestCases_Quote Quote = new SharedTestCases_Quote();
    SharedTestCases_RetrieveQuote RetrieveQuote = new SharedTestCases_RetrieveQuote();
    SharedTestCases_RightPanel RightPanel = new SharedTestCases_RightPanel();
    SharedTestCases_ConfirmDriver ConfirmDriver = new SharedTestCases_ConfirmDriver();
    SharedTestCases_ConfirmVehicle ConfirmVehicle = new SharedTestCases_ConfirmVehicle();
    SharedTestCases_Billing Billing = new SharedTestCases_Billing();
    SharedTestCases_GetInfo GetInfo = new SharedTestCases_GetInfo();

 

 

    
    // ==============================================================================================
//    ***_TEST_CASES_***

 

    // TC001
    @Test(enabled = true, priority = 5, description = "Elephant_Test")
    @Parameters("ENV")
    public void TC001(String ENV) throws Throwable {

 

        Testing test = new Testing(ENV, brandName, "Elephant_Test");
        try { 

            PostalCode.postalCode_Elephant(test);
            PolicyHolder.policyholder(test);
            Address.address(test);
            VehicleDetails1of2.vehicleDetails1of2(test);
            VehicleDetails2of2.vehicleDetails2of2(test);
            VehicleList.vehicleList(test);
            PolicyHolderDetails1of2.policyHolderDetails1of2(test);
            PolicyHolderDetails2of2.policyHolderDetails2of2(test);
            DriverList.driverList(test);
            InsuranceHistory.insuranceHistory_Yes(test);
            PolicyStatrDate.policyStartDate(test);
            test.webFunctions().staticWait(8000);
            Quote.quote(test);
            ConfirmDriver.confirmDriver(test);           
            test.webFunctions().staticWait(4000);            
            ConfirmVehicle.confirmVehicle(test);
            test.webFunctions().staticWait(8000);
            Billing.billing_Elephant(test);
            GetInfo.GetPolicyNumber(test);
        } catch (Throwable e) {
            throw (e);
        } finally {
            test.tearDown();
        }
}}