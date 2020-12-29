package SharedTC;

import resources.Testing;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import ApplicationPages.DriverList;


public class SharedTestCases_DriverList {
    
    public void driverList(Testing test) {
        test.setPage(DriverList.class);
        DriverList driverList = (DriverList) PageFactory.initElements(test.driver, test.getPage());
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
