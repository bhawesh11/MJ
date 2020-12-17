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
	//								 *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================
	// Creating Objects :




	
	// ==============================================================================================
//	***_TEST_CASES_***

/*
	// TC001
	@Test(enabled = false, priority = 5, description = "Create_Claim_With_Login")
	@Parameters("ENV")
	public void TC001(String ENV) {

		Testing test = new Testing(ENV, brandName, "Create_Claim_With_Login");
		try {

			stc_launchPage.clickLogin(test);
			stc_login.login(test);
			stc_launchPage.clickAllOtherClaims(test);
			stc_incidentDetails.fillIncidentDetails_Login(test);
			stc_tellUsMore.TellUsMore_withLogin(test);
			stc_vehicleDetails.vehicleInvolvedWithVin(test);
			stc_driverPassengerDetails.driverPresent(test);
			stc_driverPassengerDetails.passengerNotPresent(test);
			stc_driverPassengerDetails.anotherVehicleNotInvolved(test);
			stc_WitnessPolice.witnessPolice_No(test);
			stc_contactInformation.contactInformationPage(test);
			stc_thankyouPage.getClaimNo(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// closing TC001 method

	// --------------------------------------------------------------------------------------

	*/
	
}