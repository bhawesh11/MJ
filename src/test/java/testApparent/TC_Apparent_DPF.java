package testApparent;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import SharedTC.STC_Address;
import SharedTC.STC_Assignment;
import SharedTC.STC_Billing;
import SharedTC.STC_Children;
import SharedTC.STC_ConfirmDriver;
import SharedTC.STC_ConfirmVehicle;
import SharedTC.STC_DriverInfo1of2;
import SharedTC.STC_DriverInfo2of2;
import SharedTC.STC_DriverList;
import SharedTC.STC_Family;
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

public class TC_Apparent_DPF {

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
	STC_Billing billing = new STC_Billing();
	STC_GetInfo getInfo = new STC_GetInfo();
	STC_Misc misc = new STC_Misc();

	// ==============================================================================================
	// ***_TEST_CASES_***

	// TC001
	@Test(enabled = true, priority = 5, description = "V1_D1_001_DPF")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_001_DPF");
		try {
			postalCode.postalCode(test);
			family.family(test);
			policyHolder.DPF_policyholder(test);
			address.address(test);
			test.webFunctions().staticWait(4000);
			vehicleDetails1of2.DPF_vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.DPF_driverDetails(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);
			quote.quote(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.DPF_confirmVehicle(test);
			test.webFunctions().staticWait(9000);
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

	@Test(enabled = true, priority = 5, description = "V3_D2_002_DPF")
	@Parameters("ENV")
	public void TC002(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V3_D2_002_DPF");
		try {
			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.DPF_policyholder(test);
			address.address(test);
			test.webFunctions().staticWait(4000);
			vehicleDetails1of2.DPF_vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.DPF_driverDetails(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);
			quote.quote(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.DPF_confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC002 method
//--------------------------------------------------------------------------------------------
	// TC003

	@Test(enabled = true, priority = 5, description = "V2_D2_003_with_insurance_DPF_apparent")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_003_with_insurance_DPF");
		try {
			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.DPF_policyholder(test);
			address.address(test);
			test.webFunctions().staticWait(4000);
			vehicleDetails1of2.DPF_vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.DPF_driverDetails(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);
			quote.quote(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.DPF_confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC003 method
//--------------------------------------------------------------------------------------------
	// TC005

	@Test(enabled = true, priority = 5, description = "V1_D1_005_SuspendedLicense")
	@Parameters("ENV")
	public void TC005(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_005_SuspendedLicense");
		try {
			postalCode.postalCode(test);
			family.family(test);
			children.children(test);
			policyHolder.DPF_policyholder(test);
			address.address(test);
			test.webFunctions().staticWait(4000);
			vehicleDetails1of2.DPF_vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			getInfo.GetPhSuspendedLicenseMessage(test);
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC005 method

	// -------------------------------------------------------------------------------------------------------
	// TC006
	@Test(enabled = true, priority = 5, description = "V1_D2_006_DPF")
	@Parameters("ENV")
	public void TC006(String ENV) throws Throwable {
		Testing test = new Testing(ENV, brandName, "V1_D2_006_RemoveDriver_DPF");
		try {
			postalCode.postalCode(test);
			family.family(test);
			policyHolder.DPF_policyholder(test);
			address.address(test);
			test.webFunctions().staticWait(4000);
			vehicleDetails1of2.DPF_vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.DPF_driverDetails(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(12000);
			misc.clickDriversOnBreadCrumb(test);
			driverList.driverList_RemoveDriver_DPF(test);
			policyStatrDate.clickSeeMyQuote(test);
			test.webFunctions().staticWait(12000);
			quote.quote(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.DPF_confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC006 method
//--------------------------------------------------------------------------------------------

}
