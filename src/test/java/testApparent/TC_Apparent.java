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

	STC_PostalCode postalCode = new STC_PostalCode();
	STC_Family family = new STC_Family();
	STC_Children children = new STC_Children();
	STC_PolicyHolder policyHolder = new STC_PolicyHolder();
	STC_Address address = new STC_Address();
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

	// ==============================================================================================
//	***_TEST_CASES_***

	// TC001
	@Test(enabled = false, priority = 5, description = "Apparent_Test")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_Bind");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverList.driverList(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
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

			postalCode.postalCode(test);
			family.family(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			test.webFunctions().refresh(test);
			retrieveQuote.clickRetrieveQuote(test);
			retrieveQuote.RetrieveQuote(test);
			quote.quote(test);

			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
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

			postalCode.postalCode(test);
			family.family(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			driverAssignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);

			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
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
			postalCode.postalCode(test);
			family.family(test);
			// Children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			driverAssignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(12000);
			quote.quote(test);
			test.webFunctions().staticWait(8000);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(2000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(3000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
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

			postalCode.postalCode(test);
			family.family(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			driverAssignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(12000);
			quote.quote(test);
			test.webFunctions().staticWait(8000);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(2000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(3000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
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