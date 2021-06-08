package SharedTC;

import ApplicationPages.Assignment;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_Assignment {

    public void driverVehicleAssignmentPage(Testing test) {
        test.setPage(Assignment.class);
        Assignment driverAssignment = (Assignment) PageFactory.initElements(test.driver, test.getPage());
        //test.webFunctions().click(test,driverAssignment.SelectVehicle,test.getTestData("Vehicle"));
        //test.webFunctions().click(test,driverAssignment.SelectDriver,test.getTestData("DriverName"));
        
        //test.webFunctions().click(test,driverAssignment.SelectVehicle,test.getTestData("Vehicle"));
        //test.webFunctions().click(test,driverAssignment.SelectDriver,test.getTestData("DriverName"));
        
        test.webFunctions().click(test,driverAssignment.btn_Next);
        test.getLogger().info("Assignment page: Success!");
    }

}
