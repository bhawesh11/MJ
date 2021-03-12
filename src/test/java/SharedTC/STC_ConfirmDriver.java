package SharedTC;

import ApplicationPages.ConfirmDriver;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_ConfirmDriver {

	public void confirmDriver(Testing test) {
		test.setPage(ConfirmDriver.class);
		ConfirmDriver confirmDriver = (ConfirmDriver) PageFactory.initElements(test.driver, test.getPage());

		for (int count = 1; count <= test.driverCount; count++) {
			if(!test.getTestData("ConfirmDriver.D" + count + ".Licenseno").equalsIgnoreCase("Null")) {
			test.webFunctions().staticWait(5000);
			test.webFunctions().type(test, confirmDriver.textBox_licenseNumber, String.valueOf(count),
					test.getTestData("ConfirmDriver.D" + count + ".Licenseno"));
		}
		}
		test.webFunctions().click(test, confirmDriver.btn_Next);
		test.getLogger().info("Confirm Driver page: Success!");
	}

}
