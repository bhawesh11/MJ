package testElephant;
import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import resources.Api;
import resources.Testing;
import java.io.IOException;

public class TC_API {
	
	Logger log = Logger.getLogger("Test Suite");
	private final String brandName = "Elephant";

	// ==============================================================================================
	// *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================
	// Creating Objects :
	
	STC_PostalCode postalCode = new STC_PostalCode();
	STC_Family family = new STC_Family();
	STC_Children children = new STC_Children();
	STC_PolicyHolder policyHolder = new STC_PolicyHolder();
	STC_Address address = new STC_Address();
	STC_Assignment assignment =  new STC_Assignment();
	STC_VehicleDetails1of2 vehicleDetails1of2 = new STC_VehicleDetails1of2();
	STC_VehicleDetails2of2 vehicleDetails2of2 = new STC_VehicleDetails2of2();
	STC_VehicleList vehicleList = new STC_VehicleList();
	STC_PolicyHolderDetails1of2 policyHolderDetails1of2 = new STC_PolicyHolderDetails1of2();
	STC_PolicyHolderDetails2of2 policyHolderDetails2of2 = new STC_PolicyHolderDetails2of2();
	STC_Spouse1of2 spouse1of2 = new STC_Spouse1of2();
	STC_Spouse2of2 spouse2of2 = new STC_Spouse2of2();
	STC_DriverInfo1of2 driverInfo1of2 = new STC_DriverInfo1of2();
	STC_DriverInfo2of2 driverInfo2of2 = new STC_DriverInfo2of2();
	STC_Incidents incidents = new STC_Incidents();
	STC_DriverList driverList = new STC_DriverList();
	STC_Assignment driverAssignment = new STC_Assignment();
	STC_InsuranceHistory insuranceHistory = new STC_InsuranceHistory();
	STC_PolicyStartDate policyStartDate = new STC_PolicyStartDate();
	STC_Quote quote = new STC_Quote();
	STC_RetrieveQuote retrieveQuote = new STC_RetrieveQuote();
	STC_RightPanel rightPanel = new STC_RightPanel();
	STC_ConfirmDriver confirmDriver = new STC_ConfirmDriver();
	STC_ConfirmVehicle confirmVehicle = new STC_ConfirmVehicle();
	STC_PaymentPlan paymentPlan = new STC_PaymentPlan();
	STC_Billing billing = new STC_Billing();
	STC_GetInfo getInfo = new STC_GetInfo();
	STC_Misc misc = new STC_Misc();
	Api api = new Api();

	// ==============================================================================================
//    ***_TEST_CASES_***

	// TC001
	@Test(enabled = true, priority = 5, description = "V1_D1_CompareLeads")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_CompareLeads");
		try {

			String leadURL = api.compareTest(test);
			System.out.println(leadURL);
			test.driver.get(leadURL);
			
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			
			throw (e);
		} finally {
			//test.tearDown();
		}
	}

}
