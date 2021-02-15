package SharedTC;

import ApplicationPages.Address;
import ApplicationPages.PolicyHolder;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_PolicyHolder {

    public void policyholder(Testing test) {
        test.setPage(PolicyHolder.class);

        PolicyHolder policyHolder = (PolicyHolder) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,policyHolder.textBox_FirstName, test.getTestData("Policyholder.FirstName"));
        test.webFunctions().type(test,policyHolder.textBox_LastName, test.getOutput("LastName"));
        test.webFunctions().type(test,policyHolder.textBox_DOB, test.getTestData("Policyholder.DOB"));
        test.webFunctions().click(test,policyHolder.btn_Next);
        test.getLogger().info("Policy Holder page: Success!");
    }

    // -------------------------------------------------------------------------------------------

}
