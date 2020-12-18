package SharedTC;

import ApplicationPages.ConfirmDriver;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_ConfirmDriver {

    
    

    public void confirmDriver(Testing test) {
        test.setPage(ConfirmDriver.class);
        ConfirmDriver confirmDriver = (ConfirmDriver) PageFactory.initElements(test.driver, test.getPage());
        int NoOfDriver = Integer.parseInt(test.getTestData("Scenario.Driver"));
        int j = 0;

        do{
            test.webFunctions().type(test,confirmDriver.textBox_licenseNumber,test.getTestData("Policyholder.FirstName"),test.getTestData("ConfirmDriver.Licenseno"));
        }
        while(j == NoOfDriver);
        {
            for(int i = 2 ; i <= NoOfDriver ;i++) { // i is resets to '2'

                test.webFunctions().type(test,confirmDriver.textBox_licenseNumber,test.getTestData("AdditionalDriver."+i+"FirstName"),test.getTestData("ConfirmDriver."+i+"Licenseno"));

            }

        }
        test.webFunctions().click(test,confirmDriver.btn_Next);
        test.getLogger().info("Confirm Driver page: Success!");


    }

    public void confirmDriver_withSpouse(Testing test) {
        test.setPage(ConfirmDriver.class);
        ConfirmDriver confirmDriver = (ConfirmDriver) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,confirmDriver.textBox_licenseNumber,test.getTestData("Policyholder.FirstName"),test.getTestData("Policyholder.Licenseno"));
        test.webFunctions().type(test,confirmDriver.textBox_licenseNumber,test.getTestData("Spouse.SpouseFirstName"),test.getTestData("Spouse.SpouseLicenseno"));
        test.webFunctions().click(test,confirmDriver.btn_Next);

    }

}
