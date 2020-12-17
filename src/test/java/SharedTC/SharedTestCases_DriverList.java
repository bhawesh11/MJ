package SharedTC;

import resources.Testing;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import ApplicationPages.DriverList;


public class SharedTestCases_DriverList {
    
    

    public void driverList(Testing test) {
        test.setPage(DriverList.class);
        DriverList driverList = (DriverList) PageFactory.initElements(test.driver, test.getPage());

        int NoOfDriver = Integer.parseInt(test.getTestData("Scenario.Driver"));
        for (int additionalDriver = 2; additionalDriver <= NoOfDriver; additionalDriver++)
        {
            if (NoOfDriver != 1)
            {
                test.webFunctions().click(test,driverList.btn_AddAnotherDriver);
                SharedTestCases_DriverInfo1of2.driverInfo_1of2(test,additionalDriver);
                SharedTestCases_DriverInfo2of2.driverInfo_2of2(test,additionalDriver);

            }

        }

        test.webFunctions().click(test,driverList.btn_DoneWithDrivers);
        test.getLogger().info("DriverList page: Success!");
    }


    public void driverList_RemoveDriver(Testing test) {
        test.setPage(DriverList.class);
        DriverList driverList = (DriverList) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverList.btn_RemoveDriver,test.getTestData("Policyholder.Second_FirstName"));
        test.webFunctions().click(test,driverList.btn_RemoveDriverPopup);
        test.webFunctions().click(test,driverList.btn_DoneWithDrivers);
    }

}
