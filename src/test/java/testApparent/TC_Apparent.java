package testApparent;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.Testing;
import java.io.IOException;

//import SharedTC.QuoteAndBind;
public class TC_Apparent {

	Logger log = Logger.getLogger("Test Suite");
	private final String brandName = "Apparent";

	// ==============================================================================================
	// *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================
	// Creating Objects :

	SharedTestCases_PostalCode PostalCode = new SharedTestCases_PostalCode();
	SharedTestCases_Family Family = new SharedTestCases_Family();
	SharedTestCases_Children Children = new SharedTestCases_Children();
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
	SharedTestCases_Assignment DriverAssignment = new SharedTestCases_Assignment();
	SharedTestCases_InsuranceHistory InsuranceHistory = new SharedTestCases_InsuranceHistory();
	SharedTestCases_PolicyStatrDate PolicyStatrDate = new SharedTestCases_PolicyStatrDate();
	SharedTestCases_Quote Quote = new SharedTestCases_Quote();
	SharedTestCases_RetrieveQuote RetrieveQuote = new SharedTestCases_RetrieveQuote();
	SharedTestCases_RightPanel RightPanel = new SharedTestCases_RightPanel();
	SharedTestCases_ConfirmDriver ConfirmDriver = new SharedTestCases_ConfirmDriver();
	SharedTestCases_ConfirmVehicle ConfirmVehicle = new SharedTestCases_ConfirmVehicle();
	SharedTestCases_PaymentPlan PaymentPlan = new SharedTestCases_PaymentPlan();
	SharedTestCases_Billing Billing = new SharedTestCases_Billing();
	SharedTestCases_GetInfo GetInfo = new SharedTestCases_GetInfo();

	// ==============================================================================================
//	***_TEST_CASES_***

	// TC001
	@Test(enabled = false, priority = 5, description = "Apparent_Test")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_Bind");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
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
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC001 method

	// TC002
	@Test(enabled = true, priority = 5, description = "V1_D1_RetrieveQuote_Bind")
	@Parameters("ENV")
	public void TC002(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_RetrieveQuote_Bind");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			test.webFunctions().refresh(test);
			RetrieveQuote.clickRetrieveQuote(test);
			RetrieveQuote.RetrieveQuote(test);
			Quote.quote(test);

			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC002 method

	// ---------------------------------------------------------------------------------------
	// TC003
	@Test(enabled = true, priority = 5, description = "V3_D3_Bind")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_Bind");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			DriverAssignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);

			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC003 method

	// TC004
	@Test(enabled = true, priority = 5, description = "V2_D2_TX_App")
	@Parameters("ENV")
	public void TC004(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_Bind");
		try {
			PostalCode.postalCode(test);
			Family.family(test);
			// Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			DriverAssignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(12000);
			Quote.quote(test);
			test.webFunctions().staticWait(8000);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(2000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(3000);
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}

	}// closing TC004 method

	// ---------------------------------------------------------------------------------------

	// TC005
	@Test(enabled = true, priority = 5, description = "V2_D3_TX_App")
	@Parameters("ENV")
	public void TC005(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D3_Bind");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			DriverAssignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(12000);
			Quote.quote(test);
			test.webFunctions().staticWait(8000);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(2000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(3000);
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC005 method

// ---------------------------------------------------------------------------------------

}