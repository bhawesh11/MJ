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

public class SharedTestCases_InsuranceHistory {

    
    

    public void insuranceHistory_Yes(Testing test) {
        test.setPage(InsuranceHistory.class);
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,insuranceHistory.btn_CurrentlyInsured,test.getTestData("InsuranceHistory.CurrentlyInsured"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_InsuranceProvider, test.getTestData("InsuranceHistory.CurrentInsuranceProvider"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_YearsWithCurrentInsuranceProvider, test.getTestData("InsuranceHistory.YearswithCurrentInsurer"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_BILimit, test.getTestData("InsuranceHistory.BILimit"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_Uninsured, test.getTestData("InsuranceHistory.Uninsuredinlast3years"));
        test.webFunctions().click(test,insuranceHistory.btn_Next);
        test.getLogger().info("Insurance History page: Success!");
    }
    // -------------------------------------------------------------------------------------------


    public void insuranceHistory_No(Testing test) {
        test.setPage(InsuranceHistory.class);
        InsuranceHistory insuranceHistory = (InsuranceHistory) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,insuranceHistory.btn_CurrentlyInsured,test.getTestData("InsuranceHistory.CurrentlyInsured"));
        test.webFunctions().dropdown(test,insuranceHistory.dropdown_Reason, test.getTestData("InsuranceHistory.Reason"));
        test.webFunctions().click(test,insuranceHistory.btn_Next);
        test.getLogger().info("Insurance History page: Success!");
    }

    // -------------------------------------------------------------------------------------------



}
