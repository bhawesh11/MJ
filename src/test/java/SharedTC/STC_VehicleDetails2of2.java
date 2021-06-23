package SharedTC;

import resources.Testing;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import ApplicationPages.VehicleDetails2of2;

public class STC_VehicleDetails2of2 {

	public void vehicleDetails2of2(Testing test) {
		test.setPage(VehicleDetails2of2.class);
		VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(test.driver,
				test.getPage());
		test.webFunctions().click(test, vehicleDetails2of2.dropDownYearBought);
		test.webFunctions().click(test, vehicleDetails2of2.dropDownYearBought_Select,
				test.getTestData("Vehicle.V1.YearBought"));
		test.webFunctions().click(test, vehicleDetails2of2.dropDownMonthBought);
		test.webFunctions().click(test, vehicleDetails2of2.dropDownMonthBought_Select,
				test.getTestData("Vehicle.V1.MonthBought"));
		test.webFunctions().click(test, vehicleDetails2of2.btn_OwnedByYou, test.getTestData("Vehicle.V1.Ownedbyyou"));
		test.webFunctions().click(test, vehicleDetails2of2.checkBox_HandsFree);
		test.webFunctions().click(test, vehicleDetails2of2.checkBox_CrashAvoidance);
		test.webFunctions().click(test, vehicleDetails2of2.btn_Next);
		test.getLogger().info("Vehicle Details 2of2 page: Success!");

	}

	public void vehicleDetails_2of2(Testing test, int count) {
		test.setPage(VehicleDetails2of2.class);
		VehicleDetails2of2 vehicleDetails2of2 = (VehicleDetails2of2) PageFactory.initElements(test.driver,
				test.getPage());
		test.webFunctions().click(test, vehicleDetails2of2.dropDownYearBought);
		test.webFunctions().click(test, vehicleDetails2of2.dropDownYearBought_Select,
				test.getTestData("Vehicle.V" + count + ".YearBought"));
		test.webFunctions().click(test, vehicleDetails2of2.dropDownMonthBought);
		test.webFunctions().click(test, vehicleDetails2of2.dropDownMonthBought_Select,
				test.getTestData("Vehicle.V" + count + ".MonthBought"));
		test.webFunctions().click(test, vehicleDetails2of2.btn_OwnedByYou,
				test.getTestData("Vehicle.V" + count + ".Ownedbyyou"));
		try {
			if (vehicleDetails2of2.checkBox_CrashAvoidance.isDisplayed()) {
				test.webFunctions().click(test, vehicleDetails2of2.checkBox_HandsFree);
				test.webFunctions().click(test, vehicleDetails2of2.checkBox_CrashAvoidance);
			}
		} catch (Exception e) {
		}

		try {
			if (vehicleDetails2of2.btn_Antitheft_Yes.isDisplayed()) {
				test.webFunctions().click(test, vehicleDetails2of2.btn_Antitheft,
						test.getTestData("Vehicle.V" + count + ".AntiTheft"));
				test.webFunctions().staticWait(2000);
			}
		} catch (Exception e) {
		}

		test.webFunctions().click(test, vehicleDetails2of2.btn_Next);
		test.getLogger().info("Vehicle Details 2of2 page: Success!");

	}

}
