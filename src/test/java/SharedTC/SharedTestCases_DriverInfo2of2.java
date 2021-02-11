package SharedTC;

import ApplicationPages.DriverInfo2of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_DriverInfo2of2 {
    //  Additional Driver page
    public void driverInfo2of2(Testing test) {
        test.setPage(DriverInfo2of2.class);
        DriverInfo2of2 driverInfo2of2 = (DriverInfo2of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverInfo2of2.btn_ValidLicense, test.getTestData("Second_Valid License"));
        test.webFunctions().click(test,driverInfo2of2.btn_AgeFirstLicensed,test.getTestData("Second_Age first licensed"));
        //test.webFunctions().click(driverInfo2of2.btn_vehicleAssignment,test.getTestData(""));
        test.webFunctions().click(test,driverInfo2of2.btn_IncidentHistory,test.getTestData("Second_Incident"));
        test.webFunctions().click(test,driverInfo2of2.btn_Next);
        test.getLogger().info("Additional Driver 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------


}
