package SharedTC;

import ApplicationPages.Address;
import ApplicationPages.PolicyHolder;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolder {

    
    

    public void policyholder(Testing test) {
        test.setPage(PolicyHolder.class);

       
        PolicyHolder policyHolder = (PolicyHolder) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,policyHolder.textBox_FirstName, test.getTestData("PolicyHolder.FirstName"));
        test.webFunctions().type(test,policyHolder.textBox_LastName, test.getTestData("PolicyHolder.LastName"));
        test.webFunctions().type(test,policyHolder.textBox_DOB, test.getTestData("PolicyHolder.DOB"));
        test.webFunctions().click(test,policyHolder.btn_Next);
        test.getLogger().info("Policy Holder page: Success!");
    }

    public void address(Testing test) {
        test.setPage(Address.class);
        Address address = (Address) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().dropdownMelissaJS(test,address.textBox_Address,test.getTestData("Policyholder.StreetAddress"));
//		test.webFunctions().type(address.textBox_Apartment,test.getTestData("Apartment/Unit"));
        test.webFunctions().dropdown(test,address.MoveInYear,test.getTestData("Policyholder.MoveinYear"));
        test.webFunctions().dropdown(test,address.MoveInMonth,test.getTestData("Policyholder.MoveinMonth"));
        test.webFunctions().click(test,address.btn_ResidenceType,test.getTestData("Policyholder.TypeofResidence"));
        test.webFunctions().click(test,address.btn_Next);
        test.getLogger().info("Address page: Success!");
    }

    // -------------------------------------------------------------------------------------------

}
