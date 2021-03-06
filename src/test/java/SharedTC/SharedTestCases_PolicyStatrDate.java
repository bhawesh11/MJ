package SharedTC;

import ApplicationPages.PolicyStartDate;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;



public class SharedTestCases_PolicyStatrDate {
    
    

    public void policyStartDate(Testing test) {
        test.setPage(PolicyStartDate.class);
        PolicyStartDate policyStartDate = (PolicyStartDate) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,policyStartDate.textBox_Email, test.getOutput("LastName")+test.getTestData("Policy-Start-date.Email"));
        test.webFunctions().click(test,policyStartDate.btn_PaperlessDiscount, test.getTestData("Policy-Start-date.PaperlessDiscount"));
        test.webFunctions().click(test,policyStartDate.btn_ESignDiscount, test.getTestData("Policy-Start-date.E-SignatureDiscount"));
        test.webFunctions().type(test,policyStartDate.textBox_Phone, test.getTestData("Policy-Start-date.PhoneNumber"));
        test.webFunctions().click(test,policyStartDate.btn_SeeMyQuote);
        test.getLogger().info("Policy Start page: Success!");
    }

}
