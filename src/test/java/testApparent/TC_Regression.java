package testApparent;

import SharedTC.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import resources.Testing;
import java.io.IOException;

public class TC_Regression {

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

	STC_PostalCode PostalCode = new STC_PostalCode();
	STC_Family Family = new STC_Family();
	STC_Children Children = new STC_Children();
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
	STC_PaymentPlan PaymentPlan = new STC_PaymentPlan();
	STC_Billing Billing = new STC_Billing();
	STC_GetInfo GetInfo = new STC_GetInfo();
	STC_BreadCrumb BreadCrumb = new STC_BreadCrumb();

	// ==============================================================================================
	// ***_TEST_CASES_***

	// TC001
	@Test(enabled = true, priority = 5, description = "V3_D1_001_TX_ACH")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D1_001_TX_ACH");
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
			Billing.fillFutureACHDetails_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();

		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}// closing TC001 method
		// -------------------------------------------------------------

	// TC004
	@Test(enabled = true, priority = 5, description = "V1_D1_04_DUI/DWI")
	@Parameters("ENV")
	public void TC004(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_04_DUI/DWI");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			test.webFunctions().staticWait(8000);
			GetInfo.GetDUIMessage(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC004 method
	// ==============================================================================================

	// TC006
	@Test(enabled = true, priority = 5, description = "V1_D2_06")
	@Parameters("ENV")
	public void TC006(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D2_06");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
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
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC006 method

	// --------------------------------------------------------------------------

	// TC007
	@Test(enabled = true, priority = 5, description = "V2_D2_07")
	@Parameters("ENV")
	public void TC007(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_07");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
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
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC007 method

	// ==============================================================================================

	// TC008
	@Test(enabled = true, priority = 5, description = "V2_D3_008")
	@Parameters("ENV")
	public void TC008(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D3_008_TX_CC");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
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
			test.webFunctions().staticWait(6000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}// closing TC008 method

	// --------------------------------------------------------------------------

	// TC009
	@Test(enabled = true, priority = 5, description = "V3_D3_009")
	@Parameters("ENV")
	public void TC009(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D3_009");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			test.webFunctions().staticWait(8000);
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
	}// closing TC009 method

	// --------------------------------------------------------------------------

	// TC010
	@Test(enabled = true, priority = 5, description = "V2_D3_010_TX")
	@Parameters("ENV")
	public void TC010(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D3_010_TX");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			test.webFunctions().staticWait(8000);
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
	}// closing TC010 method
	// --------------------------------------------------------------------------

	// TC012
	@Test(enabled = true, priority = 5, description = "V1_D2_12_RemoveDriver")
	@Parameters("ENV")
	public void TC012(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D2_12_RemoveDriver");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			BreadCrumb.navigate2driver(test);
			DriverList.driverList_RemoveDriver(test);
			PolicyStatrDate.policyStartDate(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC0012 method

	// --------------------------------------------------------------------------
	// TC013
	@Test(enabled = true, priority = 5, description = "V1_D1_019_Active_Policy")
	@Parameters("ENV")
	public void TC013(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_019_Active_Policy");
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
			test.webFunctions().refresh(test);
			test.webFunctions().staticWait(8000);
			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			test.webFunctions().staticWait(8000);
			GetInfo.GetTerminationMessage(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC013 method
	// --------------------------------------------------------------------------

	// TC014
	@Test(enabled = true, priority = 5, description = "V1_D1_14_BrandedVin")
	@Parameters("ENV")
	public void TC014(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_14_BrandedVin");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
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
			test.webFunctions().staticWait(2000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(3000);
			GetInfo.GetBrandedVinMessage(test);
			;
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC014 method

	// ==============================================================================================

	// TC015
	@Test(enabled = true, priority = 5, description = "V1_D1_15_SuspendedLicense")
	@Parameters("ENV")
	public void TC015(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_15_SuspendedLicense");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			GetInfo.GetPhSuspendedLicenseMessage(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC015 method

	// ==============================================================================================
	// TC016
	@Test(enabled = true, priority = 5, description = "V2_D2_16_AdditionalDriver_Non-licensed")
	@Parameters("ENV")
	public void TC016(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_16_AdditionalDriver_Non-licensed");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
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
			Billing.billing_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC016 method

	// ==============================================================================================

	// TC018
	@Test(enabled = true, priority = 5, description = "V2_D2_018_OSL")
	@Parameters("ENV")
	public void TC018(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_018_OSL");
		try {

			PostalCode.postalCode(test);
			Family.family(test);
			Children.children(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_Yes(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(6000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Apparent(test);
			Billing.fillFutureACHDetails_Apparent(test);
			GetInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}// closing TC018 method

	// --------------------------------------------------------------------------

	// TC019
	@Test(enabled = true, priority = 5, description = "V1_D1_019_MilitaryActive")
	@Parameters("ENV")
	public void TC019(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_019_MilitaryActive");
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
	}// closing TC019 method
	// --------------------------------------------------------------------------
	// TC020

	@Test(enabled = true, priority = 5, description = "V1_D1_020_PIF")
	@Parameters("ENV")
	public void TC020(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_020_PIF");
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
	}// closing TC020 method
	// --------------------------------------------------------------------------
	// ==============================================================================================

}