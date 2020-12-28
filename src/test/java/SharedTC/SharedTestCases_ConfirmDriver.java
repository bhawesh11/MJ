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
       test.webFunctions().type(test, confirmDriver.btn_LINO,test.getTestData("ConfirmDriver.Licenseno"));
        test.webFunctions().click(test,confirmDriver.btn_Next);
        test.getLogger().info("Confirm Driver page: Success!");

    }
    
}
