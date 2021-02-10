package SharedTC;

import ApplicationPages.ConfirmVehicle;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_ConfirmVehicle {

public void confirmVehicle(Testing test) {
	test.setPage(ConfirmVehicle.class);
	ConfirmVehicle confirmVehicle = (ConfirmVehicle) PageFactory.initElements(test.driver,test.getPage());
	for (int i = 1; i <= test.vehicleCount; i++) {
		test.webFunctions().staticWait(3000);
		test.webFunctions().click(test,confirmVehicle.btn_Damage,test.getTestData("Vehicle.V" + i + ".Model"),test.getTestData("Vehicle.V" +i+ ".Damage"));
		if((test.getTestData("Vehicle.V"+i+".Financeorlease")).equalsIgnoreCase("Yes")) {
			test.webFunctions().dropdownMelissaJS(test,confirmVehicle.textBox_LienHolder,test.getTestData("Vehicle.V" + i + ".Model").replace(" ", ""),test.getTestData("Vehicle.V" +i+ ".Lienholder"));
		}
		test.webFunctions().type(test,confirmVehicle.textBox_VIN,test.getTestData("Vehicle.V" + i + ".Model").replace(" ", ""),test.getTestData("Vehicle.V" +i+ ".VIN"));  
	
    }
	test.webFunctions().staticWait(3000);
	test.webFunctions().click(test,confirmVehicle.btn_Next);
	test.getLogger().info("ConfirmVehicle page: Success!");
	test.webFunctions().staticWait(5000);
}
}