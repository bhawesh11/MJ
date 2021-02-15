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
	@Test(enabled = true, priority = 5, description = "Elephant_Test")
	@Parameters("ENV")
	public void TC001(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_TX");
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
	// TC002
	@Test(enabled = true, priority = 5, description = "Elephant_RetrieveQuote")
	@Parameters("ENV")
	public void TC002(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_RetrieveQuote_Bind");
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
	}// closing TC002 method

	// ---------------------------------------------------------------------------------------

	// TC003
	@Test(enabled = true, priority = 5, description = "V2_D2_TX")
	@Parameters("ENV")
	public void TC003(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_TX");
		try {

			PostalCode.postalCode_Elephant(test);
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
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

	// TC004
	@Test(enabled = true, priority = 5, description = "V2_D2_MD")
	@Parameters("ENV")
	public void TC004(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_MD");
		try {
			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_No(test);
			Assignment.driverVehicleAssignmentPage(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(8000);
			Quote.quote(test);
			ConfirmDriver.confirmDriver(test);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

	// TC005
	@Test(enabled = true, priority = 5, description = "V2_D2_IL_NB")
	@Parameters("ENV")
	public void TC005(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_IL");
		try {
			PostalCode.postalCode_Elephant(test);
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
			ConfirmVehicle.confirmVehicle(test);
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

	// TC006
	@Test(enabled = true, priority = 5, description = "V2_D2_TN")
	@Parameters("ENV")
	public void TC006(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_TN");
		try {

			PostalCode.postalCode_Elephant(test);
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
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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
	@Test(enabled = true, priority = 5, description = "V2_D2_VA")
	@Parameters("ENV")
	public void TC007(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V2_D2_VA");
		try {
			PostalCode.postalCode_Elephant(test);
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
			ConfirmVehicle.confirmVehicle(test);
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
	 // TC008
	 		@Test(enabled = false, priority = 5, description = "V2_D2_OH")
	 		@Parameters("ENV")
	 		public void TC008(String ENV) throws Throwable {

	 			Testing test = new Testing(ENV, brandName, "V2_D2_OH");
	 			try {

	 				PostalCode.postalCode_Elephant(test);
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
	 				ConfirmVehicle.confirmVehicle(test);
	 				test.webFunctions().staticWait(8000);
	 				Billing.billing_Elephant(test);
	 				GetInfo.GetPolicyNumber(test);

	 			} catch (Throwable e) {
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
			PostalCode.postalCode_Elephant(test);
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
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(4000);
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
	// TC010
	@Test(enabled = true, priority = 5, description = "Verify Element Disclaimer messages")
	@Parameters("ENV")
	public void TC010(String ENV) throws Throwable {

		Testing test = new Testing(ENV, brandName, "V1_D1_DisclaimerMessages");
		try {

			PostalCode.postalCode_Elephant(test);
			PolicyHolder.policyholder(test);
			Address.address(test);
			VehicleDetails1of2.vehicleDetails(test);
			PolicyHolderDetails1of2.policyHolderDetails1of2(test);
			PolicyHolderDetails2of2.policyHolderDetails2of2(test);
			DriverInfo1of2.driverDetails(test);
			InsuranceHistory.insuranceHistory_No(test);
			PolicyStatrDate.policyStartDate(test);
			test.webFunctions().staticWait(10000);

			Quote.quote(test);

			ConfirmDriver.confirmDriver(test);
			test.webFunctions().staticWait(4000);
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(9000);
			Billing.billing_Elephant(test);
			GetInfo.GetPolicyNumber(test);
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

			PostalCode.postalCode_Elephant(test);
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
			ConfirmVehicle.confirmVehicle(test);
			test.webFunctions().staticWait(8000);
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

			// TC012
			@Test(enabled = true, priority = 5, description = "V1_D2_VA")
			@Parameters("ENV")
			public void TC012(String ENV) throws Throwable {

				Testing test = new Testing(ENV, brandName, "V1_D2_VA");
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
					ConfirmVehicle.confirmVehicle(test);
					test.webFunctions().staticWait(8000);
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

						// TC013
						@Test(enabled = true, priority = 5, description = "V2_D2_VA_Married")
						@Parameters("ENV")
						public void TC013(String ENV) throws Throwable {

							Testing test = new Testing(ENV, brandName, "V2_D2_VA_Married");
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
								ConfirmVehicle.confirmVehicle(test);
								test.webFunctions().staticWait(8000);
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

}
