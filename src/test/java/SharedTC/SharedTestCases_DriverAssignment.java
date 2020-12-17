package SharedTC;

import ApplicationPages.DriverAssignment;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_DriverAssignment {

    
    

    public void driverAssignment(Testing test) {
        test.setPage(DriverAssignment.class);
        DriverAssignment driverAssignment = (DriverAssignment) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverAssignment.btn_Next);
        test.getLogger().info("Driver Assignment page: Success!");
    }

}
