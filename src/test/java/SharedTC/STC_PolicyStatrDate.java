package SharedTC;

import ApplicationPages.PolicyStartDate;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class STC_PolicyStatrDate {
    
    

    public void policyStartDate(Testing test) {
        test.setPage(PolicyStartDate.class);
        PolicyStartDate policyStartDate = (PolicyStartDate) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,policyStartDate.textBox_Email, test.getOutput("LastName")+test.getTestData("Policy-Start-date.Email"));
        test.webFunctions().click(test,policyStartDate.btn_PaperlessDiscount, test.getTestData("Policy-Start-date.PaperlessDiscount"));
        test.webFunctions().click(test,policyStartDate.btn_ESignDiscount, test.getTestData("Policy-Start-date.E-SignatureDiscount"));
        test.webFunctions().type(test,policyStartDate.textBox_Phone, test.getTestData("Policy-Start-date.PhoneNumber"));
        test.setOutput("Discount_Page_Disclaimer", test.webFunctions().readInfo(test, policyStartDate.Discount_Page_Disclaimer));
        test.webFunctions().click(test,policyStartDate.btn_SeeMyQuote);
        test.getLogger().info("Policy Start page: Success!");
    }
    
    public void goodStudentDiscount(Testing test) {
  	  test.setPage(PolicyStartDate.class);
        PolicyStartDate policyStartDate = (PolicyStartDate) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(2000);
        Assert.assertEquals(policyStartDate.icon_GSD.getText(),"Good Student");
  	}

}
