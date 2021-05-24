package testElephant;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SharedTC.STC_Address;
import SharedTC.STC_Assignment;
import SharedTC.STC_Billing;
import SharedTC.STC_ConfirmDriver;
import SharedTC.STC_ConfirmVehicle;
import SharedTC.STC_DriverInfo1of2;
import SharedTC.STC_DriverInfo2of2;
import SharedTC.STC_DriverList;
import SharedTC.STC_GetInfo;
import SharedTC.STC_Incidents;
import SharedTC.STC_InsuranceHistory;
import SharedTC.STC_Misc;
import SharedTC.STC_PolicyHolder;
import SharedTC.STC_PolicyHolderDetails1of2;
import SharedTC.STC_PolicyHolderDetails2of2;
import SharedTC.STC_PolicyStartDate;
import SharedTC.STC_PostalCode;
import SharedTC.STC_Quote;
import SharedTC.STC_RetrieveQuote;
import SharedTC.STC_RightPanel;
import SharedTC.STC_Spouse1of2;
import SharedTC.STC_Spouse2of2;
import SharedTC.STC_VehicleDetails1of2;
import SharedTC.STC_VehicleDetails2of2;
import SharedTC.STC_VehicleList;
import resources.Testing;

public class TC_Regression {

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
	STC_PolicyHolder policyHolder = new STC_PolicyHolder();
	STC_Address address = new STC_Address();
	STC_VehicleDetails1of2 vehicleDetails1of2 = new STC_VehicleDetails1of2();
	STC_VehicleDetails2of2 vehicleDetails2of2 = new STC_VehicleDetails2of2();
	STC_VehicleList VehicleList = new STC_VehicleList();
	STC_PolicyHolderDetails1of2 policyHolderDetails1of2 = new STC_PolicyHolderDetails1of2();
	STC_PolicyHolderDetails2of2 policyHolderDetails2of2 = new STC_PolicyHolderDetails2of2();
	STC_Spouse1of2 spouse1of2 = new STC_Spouse1of2();
	STC_Spouse2of2 spouse2of2 = new STC_Spouse2of2();
	STC_DriverInfo1of2 driverInfo1of2 = new STC_DriverInfo1of2();
	STC_DriverInfo2of2 driverInfo2of2 = new STC_DriverInfo2of2();
	STC_Incidents incidents = new STC_Incidents();
	STC_DriverList driverList = new STC_DriverList();
	STC_Assignment assignment = new STC_Assignment();
	STC_InsuranceHistory insuranceHistory = new STC_InsuranceHistory();
	STC_PolicyStartDate policyStartDate = new STC_PolicyStartDate();
	STC_Quote quote = new STC_Quote();
	STC_RetrieveQuote retrieveQuote = new STC_RetrieveQuote();
	STC_RightPanel rightPanel = new STC_RightPanel();
	STC_ConfirmDriver confirmDriver = new STC_ConfirmDriver();
	STC_ConfirmVehicle confirmVehicle = new STC_ConfirmVehicle();
	STC_Billing billing = new STC_Billing();
	STC_GetInfo getInfo = new STC_GetInfo();
	STC_Misc misc = new STC_Misc();

	// ==============================================================================================
//    ***_TEST_CASES_***

	// TC001
	@Test(enabled = true, priority = 5, description = "GA Bind with ACH Future Instrument")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_01_GA_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);
			// Quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_GAOH(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC001 method
//--------------------------------------------------------------------------------------------
	// TC002

	@Test(enabled = true, priority = 5, description = "GA Bind with CC Future Instrument")
	@Parameters("ENV")
	public void TC002(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_02_GA_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			// Assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);
			// Quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_GAOH(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();

		}
	}// closing TC001 method

	// ---------------------------------------------------------------------------------------
	// TC003
	@Test(enabled = true, priority = 5, description = "VA Elephant_RetrieveQuote")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_03_RetrieveQuote_Bind");
		try {

			postalCode.postalCode_Elephant(test);
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
			// Quote.quote(test);
			quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(5000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC003 method

	// ---------------------------------------------------------------------------------------
	// TC004
	@Test(enabled = true, priority = 5, description = "IL Bind with Future ACH")
	@Parameters("ENV")
	public void TC004(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_04_IL_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);
			// Quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC003 method

	// ---------------------------------------------------------------------------------------

	// TC005
	@Test(enabled = true, priority = 5, description = "V3_D3_005_OH_ACH")
	@Parameters("ENV")
	public void TC005(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_05_OH_ACH");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_GAOH(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

//---------------------------------------------------------------------------------------

	// TC006
	@Test(enabled = true, priority = 5, description = "V3_D3_006_IN_CC")
	@Parameters("ENV")
	public void TC006(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_06_IN_CC");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

	// ---------------------------------------------------------------------------------------
	// TC007
	@Test(enabled = true, priority = 5, description = "TN Bind with same CC as Future Payment Option")
	@Parameters("ENV")
	public void TC007(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_07_TN_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);
			// Quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC007 method

	// ---------------------------------------------------------------------------------------

	// TC008
	@Test(enabled = true, priority = 5, description = "MD Bind with new CC as Future Payment Option")
	@Parameters("ENV")
	public void TC008(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_08_MD_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);
			// Quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC008 method

	// ---------------------------------------------------------------------------------------
	
	// TC009
	@Test(enabled = true, priority = 5, description = "V1_D1_009_OH_CustomCov")
	@Parameters("ENV")
	public void TC009(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_09_OH_CustomCov");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
			billing.billing_GAOH(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();

		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC009 method

	// ---------------------------------------------------------------------------------------

	
	//TC010
	@Test(enabled = true, priority = 5, description = "V1_D1_010_IN")
	@Parameters("ENV")
	public void TC010(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_010_IN");
		try {

			postalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();

		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
		}
	
	// ---------------------------------------------------------------------------------------
	
	// TC011
	@Test(enabled = true, priority = 5, description = "V1_D1_011_TN_CC")
	@Parameters("ENV")
	public void TC011(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_011_TN_CC");

		try {

			postalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {

			test.tearDown();
		}
	}

//---------------------------------------------------------------------------------------

	// TC012
	@Test(enabled = true, priority = 5, description = "V1_D1_012_IL")
	@Parameters("ENV")
	public void TC012(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_012_IL");

		try {

			postalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC012 method

	// ---------------------------------------------------------------------------------------
	

	// TC013
	@Test(enabled = true, priority = 5, description = "V1_D1_013_MD")
	@Parameters("ENV")
	public void TC013(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_013_MD");

		try {

			postalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC013 method

	// ---------------------------------------------------------------------------------------

	// TC014
	@Test(enabled = true, priority = 5, description = "V3_D3_014_TX_ACH")
	@Parameters("ENV")
	public void TC014(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_014_TX_ACH");

		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			billing.fillFutureACHDetails_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

	// ---------------------------------------------------------------------------------------

	// TC015
	@Test(enabled = true, priority = 5, description = "V3_D3_015_VA")
	@Parameters("ENV")
	public void TC015(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_015_VA");

		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

	// ---------------------------------------------------------------------------------------

	// TC016
	@Test(enabled = true, priority = 5, description = "V1_D1_016_TX_CustomCov")
	@Parameters("ENV")
	public void TC016(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_016_TX_CustomCov");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

	// ---------------------------------------------------------------------------------------

	// TC017
	@Test(enabled = true, priority = 5, description = "V1_D1_017_VA_CC")
	@Parameters("ENV")
	public void TC017(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_017_VA_CC");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

//---------------------------------------------------------------------------------------

	// TC018
	@Test(enabled = true, priority = 5, description = "OH Bind with new ACH as Future Payment Option")
	@Parameters("ENV")
	public void TC018(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_018_OH_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);
			// Quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_GAOH(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC018 method

	// ---------------------------------------------------------------------------------------
	
	// TC019
	@Test(enabled = true, priority = 5, description = "V1_D1_019_OH_CC")
	@Parameters("ENV")
	public void TC019(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_019_OH_CC");

		try {

			postalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			billing.billing_GAOH(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}
	
	// ---------------------------------------------------------------------------------------
	
	
	// TC020
	@Test(enabled = true, priority = 5, description = "MD Bind with Pay in Full Plan")
	@Parameters("ENV")
	public void TC020(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_020_MD_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);
			// Quote.editCoverages(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC020 method

	// ---------------------------------------------------------------------------------------.
	
	// TC021
		@Test(enabled = true, priority = 5, description = "V1_D1_021_TX")
		@Parameters("ENV")
		public void TC021(String ENV) throws Throwable {

			Testing test = new Testing(ENV, brandName, "V1_D1_021_TX");
			try {

				postalCode.postalCode_Elephant(test);
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
				test.webFunctions().staticWait(12000);
				billing.billing_Elephant(test);
				getInfo.GetPolicyNumber(test);
				test.markPassed();
			} catch (Throwable e) {
				test.markFailed(e.getMessage());
				throw (e);
			} finally {
				 test.tearDown();
			}
		}

		// ---------------------------------------------------------------------------------------

		// TC022
		@Test(enabled = true, priority = 5, description = "V1_D1_022_VA_CC")
		@Parameters("ENV")
		public void TC022(String ENV) throws Throwable {

			Testing test = new Testing(ENV, brandName, "V1_D1_022_VA_CC");
			try {

				postalCode.postalCode_Elephant(test);
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
				test.webFunctions().staticWait(9000);
				billing.billing_Elephant(test);
				getInfo.GetPolicyNumber(test);
				test.markPassed();
			} catch (Throwable e) {
				test.markFailed(e.getMessage());
				throw (e);
			} finally {
				test.tearDown();

			}
		}

	// ---------------------------------------------------------------------------------------

	// TC023
	@Test(enabled = true, priority = 5, description = "V1_D1_023_TN_ACH")
	@Parameters("ENV")
	public void TC023(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_023_TN_ACH");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

	// ---------------------------------------------------------------------------------------

	// TC024
	@Test(enabled = true, priority = 5, description = "V3_D3_024_MD_CC")
	@Parameters("ENV")
	public void TC024(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_024_MD_CC");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_No(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}
	
	//-----------------------------------------------------------------------
	// TC025
	@Test(enabled = true, priority = 5, description = "V1_D1_025_IN_ACH")
	@Parameters("ENV")
	public void TC025(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_025_IN_ACH");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			test.webFunctions().staticWait(8000);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(8000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

//---------------------------------------------------------------------------------------
	// TC026
	@Test(enabled = true, priority = 5, description = "V3_D3_026_IL_ACH")
	@Parameters("ENV")
	public void TC026(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_026_IL_ACH");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			spouse1of2.Spouse1of2(test);
			spouse2of2.Spouse2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}
	
	// ---------------------------------------------------------------------------------------

	
}
