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
import SharedTC.STC_PolicyStatrDate;
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

	STC_PostalCode PostalCode = new STC_PostalCode();
	STC_PolicyHolder PolicyHolder = new STC_PolicyHolder();
	STC_Address Address = new STC_Address();
	STC_VehicleDetails1of2 VehicleDetails1of2 = new STC_VehicleDetails1of2();
	STC_VehicleDetails2of2 VehicleDetails2of2 = new STC_VehicleDetails2of2();
	STC_VehicleList VehicleList = new STC_VehicleList();
	STC_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new STC_PolicyHolderDetails1of2();
	STC_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new STC_PolicyHolderDetails2of2();
	STC_Spouse1of2 Spouse1of2 = new STC_Spouse1of2();
	STC_Spouse2of2 Spouse2of2 = new STC_Spouse2of2();
	STC_DriverInfo1of2 DriverInfo1of2 = new STC_DriverInfo1of2();
	STC_DriverInfo2of2 DriverInfo2of2 = new STC_DriverInfo2of2();
	STC_Incidents incidents = new STC_Incidents();
	STC_DriverList DriverList = new STC_DriverList();
	STC_Assignment Assignment = new STC_Assignment();
	STC_InsuranceHistory InsuranceHistory = new STC_InsuranceHistory();
	STC_PolicyStatrDate PolicyStatrDate = new STC_PolicyStatrDate();
	STC_Quote Quote = new STC_Quote();
	STC_RetrieveQuote RetrieveQuote = new STC_RetrieveQuote();
	STC_RightPanel RightPanel = new STC_RightPanel();
	STC_ConfirmDriver ConfirmDriver = new STC_ConfirmDriver();
	STC_ConfirmVehicle ConfirmVehicle = new STC_ConfirmVehicle();
	STC_Billing Billing = new STC_Billing();
	STC_GetInfo GetInfo = new STC_GetInfo();
	STC_Misc misc = new STC_Misc();

	// ==============================================================================================
//    ***_TEST_CASES_***

	// TC001
	@Test(enabled = true, priority = 5, description = "GA Bind with ACH Future Instrument")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_01_GA_Bind");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);
			// Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_GAOH(test);
			GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			// Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);
			// Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_GAOH(test);
			GetInfo.GetPolicyNumber(test);
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
	@Test(enabled = true, priority = 5, description = "Elephant_RetrieveQuote")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_03_RetrieveQuote_Bind");
		try {

			PostalCode.postalCode_Elephant(test);
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
			// Quote.quote(test);
			Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);
			// Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

		Testing test = new Testing(ENV, brandName, "V3_D3_005_OH_ACH");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_GAOH(test);
			GetInfo.GetPolicyNumber(test);
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

		Testing test = new Testing(ENV, brandName, "V3_D3_006_IN_CC");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);
			// Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

		Testing test = new Testing(ENV, brandName, "V3_D3_07_MD_Bind");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);
			// Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC008 method

	// ---------------------------------------------------------------------------------------

	// TC011
	@Test(enabled = true, priority = 5, description = "V1_D1_011_TN_CC")
	@Parameters("ENV")
	public void TC011(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_011_TN_CC");

		try {

			PostalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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
	@Test(enabled = true, priority = 5, description = "V1_D1_011_IL")
	@Parameters("ENV")
	public void TC012(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_011_IL");

		try {

			PostalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC012 method

	// ---------------------------------------------------------------------------------------

	// TC014
	@Test(enabled = true, priority = 5, description = "V3_D3_014_TX_ACH")
	@Parameters("ENV")
	public void TC014(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_014_TX_ACH");

		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			Billing.fillFutureACHDetails_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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
	@Test(enabled = false, priority = 5, description = "V1_D1_016_TX")
	@Parameters("ENV")
	public void TC016(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_016_TX");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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
	@Test(enabled = false, priority = 5, description = "V1_D1_017_VA_CC")
	@Parameters("ENV")
	public void TC017(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_017_VA_CC");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

		Testing test = new Testing(ENV, brandName, "V3_D3_18_OH_Bind");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);
			// Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_GAOH(test);
			GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
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
			test.webFunctions().staticWait(9000);
			Billing.billing_GAOH(test);
			GetInfo.GetPolicyNumber(test);
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

		Testing test = new Testing(ENV, brandName, "V1_D1_20_MD_Bind");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);
			// Quote.editCoverages(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

				PostalCode.postalCode_Elephant(test);
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
				test.webFunctions().staticWait(9000);
				Billing.billing_Elephant(test);
				GetInfo.GetPolicyNumber(test);
				test.markPassed();
			} catch (Throwable e) {
				test.markFailed(e.getMessage());
				throw (e);
			} finally {
				// test.tearDown();
			}
		}

		// ---------------------------------------------------------------------------------------

		// TC022
		@Test(enabled = true, priority = 5, description = "V1_D1_022_VA_CC")
		@Parameters("ENV")
		public void TC022(String ENV) throws Throwable {

			Testing test = new Testing(ENV, brandName, "V1_D1_022_VA_CC");
			try {

				PostalCode.postalCode_Elephant(test);
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
				test.webFunctions().staticWait(9000);
				Billing.billing_Elephant(test);
				GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}

	// ---------------------------------------------------------------------------------------

	// TC025
	@Test(enabled = true, priority = 5, description = "V1_D1_025_IN_ACH")
	@Parameters("ENV")
	public void TC025(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_025_IN_ACH");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			Spouse1of2.Spouse1of2(test);
			Spouse2of2.Spouse2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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
