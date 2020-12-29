package SharedTC;

import ApplicationPages.PolicyHolderDetails2of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolderDetails2of2 {

    //	POLICYHOLDER-DETAILS-2
    public void policyHolderDetails2of2(Testing test) {
        test.setPage(PolicyHolderDetails2of2.class);
        PolicyHolderDetails2of2 policyholderDetails2of2 = (PolicyHolderDetails2of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,policyholderDetails2of2.btn_ValidLicense, test.getTestData("Policyholder-details-2.ValidLicense"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_AgeFirstLicensed,test.getTestData("Policyholder-details-2.Agefirstlicensed"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_IncidentHistory,test.getTestData("Policyholder-details-2.IncidentHistory"));
        test.webFunctions().click(test,policyholderDetails2of2.btn_Next);
        test.getLogger().info("Policy Holder Details 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------

}
