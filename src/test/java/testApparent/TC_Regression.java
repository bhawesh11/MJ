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
	STC_Assignment assignment = new STC_Assignment();
	STC_InsuranceHistory insuranceHistory = new STC_InsuranceHistory();
	STC_PolicyStatrDate policyStatrDate = new STC_PolicyStatrDate();
	STC_Quote quote = new STC_Quote();
	STC_RetrieveQuote retrieveQuote = new STC_RetrieveQuote();
	STC_RightPanel rightPanel = new STC_RightPanel();
	STC_ConfirmDriver confirmDriver = new STC_ConfirmDriver();
	STC_ConfirmVehicle confirmVehicle = new STC_ConfirmVehicle();
	STC_PaymentPlan paymentPlan = new STC_PaymentPlan();
	STC_Billing billing = new STC_Billing();
	STC_GetInfo getInfo = new STC_GetInfo();
	STC_BreadCrumb breadCrumb = new STC_BreadCrumb();

	// ==============================================================================================
	// ***_TEST_CASES_***

	// TC001
	@Test(enabled = true, priority = 5, description = "V3_D1_001_GSD")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D1_001_GSD");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			test.webFunctions().staticWait(3000);
			driverList.driverList(test);
			policyStatrDate.goodStudentDiscount(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
			billing.billing_Apparent(test);
			billing.fillFutureACHDetails_Apparent(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();

		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}

	// -------------------------------------------------------------
	// TC002
	@Test(enabled = true, priority = 5, description = "Retrieve Quote")
	@Parameters("ENV")
	public void TC002(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D1_002_RetrieveQuote");
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
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			test.webFunctions().refresh(test);
			retrieveQuote.clickRetrieveQuote(test);
			retrieveQuote.RetrieveQuote(test);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
			billing.billing_Apparent(test);
			// billing.fillFutureACHDetails_Apparent(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();

		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}// closing TC002 method
		// -------------------------------------------------------------
		// TC003

	@Test(enabled = true, priority = 5, description = "NB Bind")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V4_D2_003_Bind");
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
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);
			quote.quote(test);
			test.webFunctions().staticWait(9000);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
			billing.billing_Apparent(test);
			// billing.fillFutureACHDetails_Apparent(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();

		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}// closing TC003 method
		// -------------------------------------------------------------

	// TC004
	@Test(enabled = true, priority = 5, description = "V1_D1_04_DUI/DWI")
	@Parameters("ENV")
	public void TC004(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_004_3_DUI");
		try {

			postalCode.postalCode(test);
			family.family(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			test.webFunctions().staticWait(8000);
			getInfo.GetDUIMessage(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC004 method
		// ==============================================================================================

	// TC005
	@Test(enabled = true, priority = 5, description = "V8_D8_005")
	@Parameters("ENV")
	public void TC005(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V8_D8_005");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
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
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);
			quote.quote(test);
			test.webFunctions().staticWait(7000);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(8000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			// test.tearDown();
		}
	}// closing TC005 method

	// --------------------------------------------------------------------------

	// TC006
	@Test(enabled = true, priority = 5, description = "V1_D2_06")
	@Parameters("ENV")
	public void TC006(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D2_006");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
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
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
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
	}// closing TC006 method

	// --------------------------------------------------------------------------

	// TC007
	@Test(enabled = true, priority = 5, description = "V2_D2_07")
	@Parameters("ENV")
	public void TC007(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_007");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
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
	}// closing TC007 method

	// ==============================================================================================

	// TC008
	@Test(enabled = true, priority = 5, description = "V2_D3_008")
	@Parameters("ENV")
	public void TC008(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D3_008_TX_CC");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
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
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(6000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
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

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			test.webFunctions().staticWait(8000);
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
	}// closing TC009 method

	// --------------------------------------------------------------------------

	// TC010
	@Test(enabled = true, priority = 5, description = "V2_D3_010")
	@Parameters("ENV")
	public void TC010(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D3_010");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			test.webFunctions().staticWait(8000);
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
	}// closing TC010 method
		// --------------------------------------------------------------------------

	// TC012
	@Test(enabled = true, priority = 5, description = "V1_D2_12_RemoveDriver")
	@Parameters("ENV")
	public void TC012(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D2_12_RemoveDriver");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			breadCrumb.navigate2driver(test);
			driverList.driverList_RemoveDriver(test);
			policyStatrDate.policyStartDate(test);
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
	@Test(enabled = true, priority = 5, description = "V1_D1_013_Active_Policy")
	@Parameters("ENV")
	public void TC013(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_013_Active_Policy");
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
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
			billing.billing_Apparent(test);
			getInfo.GetPolicyNumber(test);
			test.webFunctions().refresh(test);
			test.webFunctions().staticWait(8000);
			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			test.webFunctions().staticWait(8000);
			getInfo.GetTerminationMessage(test);
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

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(2000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(3000);
			getInfo.GetBrandedVinMessage(test);
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

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			getInfo.GetPhSuspendedLicenseMessage(test);
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

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
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
	}// closing TC016 method

	// ==============================================================================================

	// TC017
	@Test(enabled = true, priority = 5, description = "V1_D1_017_CustomCoverage")
	@Parameters("ENV")
	public void TC017(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_017_CustomCoverage");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.editCoverages(test);
			;
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
	}// closing TC017 method

	// --------------------------------------------------------------------------

	// TC018
	@Test(enabled = true, priority = 5, description = "V2_D2_018_OSL")
	@Parameters("ENV")
	public void TC018(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_018_OSL");
		try {

			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(6000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Apparent(test);
			billing.fillFutureACHDetails_Apparent(test);
			getInfo.GetPolicyNumber(test);
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

			postalCode.postalCode(test);
			family.family(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory_Yes(test);
			policyStatrDate.policyStartDate(test);
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
	}// closing TC019 method
		// --------------------------------------------------------------------------
		// TC020

	@Test(enabled = true, priority = 5, description = "V1_D1_020_PIF")
	@Parameters("ENV")
	public void TC020(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_020_PIF");
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
			policyStatrDate.policyStartDate(test);
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
	}// closing TC020 method
		// --------------------------------------------------------------------------

	// ==============================================================================================

}