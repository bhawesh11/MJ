package SharedTC;

import ApplicationPages.PolicyHolderDetails2of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_PolicyHolderDetails2of2 {
	
	STC_Incidents incident_MethodCall = new STC_Incidents();


    //	POLICYHOLDER-DETAILS-2
    public void policyHolderDetails2of2(Testing test) {
        test.setPage(PolicyHolderDetails2of2.class);
        PolicyHolderDetails2of2 policyholderDetails2of2 = (PolicyHolderDetails2of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(7000);
        test.webFunctions().click(test,policyholderDetails2of2.btn_ValidLicense, test.getTestData("Policyholder-details-2.ValidLicense"));
        try {
        	if(policyholderDetails2of2.dropdown_DriverLicenseStatus.isDisplayed())
        	{
        	test.webFunctions().click(test,policyholderDetails2of2.dropdown_DriverLicenseStatus);
        	test.webFunctions().click(test, policyholderDetails2of2.dropdown_LicenseStatusSelect,test.getTestData("Policyholder-details-2.LicenseStatus"));
        	}
        }
        catch(Throwable e)
        {
        	// TODO: handle exception
        }
        test.webFunctions().click(test,policyholderDetails2of2.btn_AgeFirstLicensed,test.getTestData("Policyholder-details-2.Agefirstlicensed"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_VehicleDriveMostOften,test.getTestData("Vehicle.V1.Model"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_IncidentHistory,test.getTestData("Policyholder-details-2.IncidentHistory"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_Next);        
        test.getLogger().info("Policy Holder Details 2of2 page: Success!");
        incident_MethodCall.incident_PolicyHolder(test);
    }

    // -------------------------------------------------------------------------------------------

}
