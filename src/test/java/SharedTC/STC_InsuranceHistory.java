package SharedTC;

import ApplicationPages.DriverList;
import ApplicationPages.InsuranceHistory;
import ApplicationPages.PolicyHolder;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_InsuranceHistory {

    public void insuranceHistory_Yes(Testing test) {
        test.setPage(InsuranceHistory.class);
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(3000);
        test.webFunctions().click(test,insuranceHistory.btn_CurrentlyInsured,test.getTestData("InsuranceHistory.CurrentlyInsured"));
        test.webFunctions().staticWait(2000);
        test.webFunctions().click(test,insuranceHistory.dropdownInsuranceProvider);
        test.webFunctions().click(test,insuranceHistory.dropdownInsuranceProvider_Select, test.getTestData("InsuranceHistory.CurrentInsuranceProvider"));
        test.webFunctions().click(test,insuranceHistory.dropdownYearsWithCurrentInsuranceProvider);
        test.webFunctions().click(test,insuranceHistory.dropdownYearsWithCurrentInsuranceProvider_Select, test.getTestData("InsuranceHistory.YearswithCurrentInsurer"));
        test.webFunctions().click(test,insuranceHistory.dropdownBILimit);
        test.webFunctions().click(test,insuranceHistory.dropdownBILimit_Select, test.getTestData("InsuranceHistory.BILimit"));
        test.webFunctions().click(test,insuranceHistory.dropdownUninsured);
        test.webFunctions().click(test,insuranceHistory.dropdownUninsured_Select, test.getTestData("InsuranceHistory.Uninsuredinlast3years"));
        test.webFunctions().click(test,insuranceHistory.btn_Next);
        test.getLogger().info("Insurance History page: Success!");
    }
    // -------------------------------------------------------------------------------------------


    public void insuranceHistory_No(Testing test) {
        test.setPage(InsuranceHistory.class);
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,insuranceHistory.btn_CurrentlyInsured,test.getTestData("InsuranceHistory.CurrentlyInsured"));
        test.webFunctions().click(test,insuranceHistory.dropdownReason);
        test.webFunctions().click(test,insuranceHistory.dropdownReason_Select, test.getTestData("InsuranceHistory.Reason"));
        String Reasontext = test.getTestData("InsuranceHistory.Reason");
        if(Reasontext.equalsIgnoreCase("Deployed Overseas with Military") || Reasontext.equalsIgnoreCase("My Policy Expired 30 Days Ago or Less"))
        {
        	test.webFunctions().click(test,insuranceHistory.dropdownInsuranceProvider);
            test.webFunctions().click(test,insuranceHistory.dropdownInsuranceProvider_Select, test.getTestData("InsuranceHistory.CurrentInsuranceProvider"));
            test.webFunctions().click(test,insuranceHistory.dropdownYearsWithCurrentInsuranceProvider);
            test.webFunctions().click(test,insuranceHistory.dropdownYearsWithCurrentInsuranceProvider_Select, test.getTestData("InsuranceHistory.YearswithCurrentInsurer"));
            test.webFunctions().click(test,insuranceHistory.dropdownBILimit);
            test.webFunctions().click(test,insuranceHistory.dropdownBILimit_Select, test.getTestData("InsuranceHistory.BILimit"));
            test.webFunctions().click(test,insuranceHistory.dropdownUninsured);
            test.webFunctions().click(test,insuranceHistory.dropdownUninsured_Select, test.getTestData("InsuranceHistory.Uninsuredinlast3years"));
            test.webFunctions().click(test,insuranceHistory.btn_Next);
            test.getLogger().info("Insurance History page: Success!");
           
        }
        else {
        	test.webFunctions().click(test,insuranceHistory.btn_Next);	
            test.getLogger().info("Insurance History page: Success!");
        }      
    }

    public void DPF_insuranceHistory_No(Testing test) {
        test.setPage(InsuranceHistory.class);
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,insuranceHistory.btn_Next);	
        test.getLogger().info("Insurance History page: Success!");
    }



}
