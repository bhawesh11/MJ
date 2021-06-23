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

	// ==============================================================================================
//    ***_TEST_CASES_***

	// TC001
	@Test(enabled = true, priority = 5, description = "Elephant_Test")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_TX");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverList.driverList(test);
			insuranceHistory.insuranceHistory(test);
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
	// TC002
	@Test(enabled = true, priority = 5, description = "Elephant_RetrieveQuote")
	@Parameters("ENV")
	public void TC002(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_RetrieveQuote_Bind");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
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
			billing.billing_Elephant(test);
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
	@Test(enabled = true, priority = 5, description = "V2_D2_TX")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_TX");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

	// TC004
	@Test(enabled = true, priority = 5, description = "V2_D2_MD")
	@Parameters("ENV")
	public void TC004(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_MD");
		try {
			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

	// TC005
	@Test(enabled = true, priority = 5, description = "V2_D2_IL_NB")
	@Parameters("ENV")
	public void TC005(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_IL");
		try {
			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
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

	// TC006
	@Test(enabled = true, priority = 5, description = "V2_D2_TN")
	@Parameters("ENV")
	public void TC006(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_TN");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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
	@Test(enabled = true, priority = 5, description = "V2_D2_VA")
	@Parameters("ENV")
	public void TC007(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_VA");
		try {
			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
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
	// TC008
	@Test(enabled = false, priority = 5, description = "V2_D2_OH")
	@Parameters("ENV")
	public void TC008(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_OH");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

	// TC009
	@Test(enabled = true, priority = 5, description = "V2_D2_IN")
	@Parameters("ENV")
	public void TC009(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_IN");
		try {
			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(4000);
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
	// TC010
	@Test(enabled = true, priority = 5, description = "Verify Element Disclaimer messages")
	@Parameters("ENV")
	public void TC010(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_DisclaimerMessages");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			quote.quote(test);

			confirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			billing.billing_Elephant(test);
			getInfo.GetPolicyNumber(test);
			misc.verifyDisclaimerMessages(test);
			test.markPassed();
		} catch (Throwable e) {
			test.markFailed(e.getMessage());
			throw (e);
		} finally {
			test.tearDown();
		}
	}// closing TC010 method

	// ---------------------------------------------------------------------------------------

	// TC011
	@Test(enabled = true, priority = 5, description = "V2_D2_GA")
	@Parameters("ENV")
	public void TC011(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_GA");
		try {

			postalCode.postalCode_Elephant(test);
			policyHolder.policyholder(test);
			address.address(test);
			vehicleDetails1of2.vehicleDetails(test);
			policyHolderDetails1of2.policyHolderDetails1of2(test);
			policyHolderDetails2of2.policyHolderDetails2of2(test);
			driverInfo1of2.driverDetails(test);
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

	// TC012
	@Test(enabled = true, priority = 5, description = "V1_D2_VA")
	@Parameters("ENV")
	public void TC012(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D2_VA");
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
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

	// TC013
	@Test(enabled = true, priority = 5, description = "V2_D2_VA_Married")
	@Parameters("ENV")
	public void TC013(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_VA_Married");
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
			insuranceHistory.insuranceHistory(test);
			assignment.driverVehicleAssignmentPage(test);
			policyStartDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			quote.quote(test);
			confirmDriver.confirmDriver(test);
			confirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

}
