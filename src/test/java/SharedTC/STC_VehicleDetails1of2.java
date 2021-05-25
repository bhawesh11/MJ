package SharedTC;

import ApplicationPages.VehicleDetails1of2;
import ApplicationPages.VehicleDetails2of2;
import ApplicationPages.VehicleList;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_VehicleDetails1of2 {

	Logger log = Logger.getLogger("Shared Test Case_Web");

	STC_VehicleDetails2of2 vehicleDetails2_MethodCall = new STC_VehicleDetails2of2();
	STC_VehicleList vehicleList_MethodCall = new STC_VehicleList();

	// TEST ===========================================================
	public void vehicleDetails_1of2(Testing test, int count) {
		test.setPage(VehicleDetails1of2.class);
		VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(test.driver,
				test.getPage());
		test.webFunctions().type(test, vehicleDetails1of2.textBox_Year,
				test.getTestData("Vehicle.V" + count + ".Year"));
		test.webFunctions().click(test, vehicleDetails1of2.dropDownMake);
		test.webFunctions().click(test, vehicleDetails1of2.dropDownMake_Select,
				test.getTestData("Vehicle.V" + count + ".Make"));
		test.webFunctions().click(test, vehicleDetails1of2.dropDownModel);
		test.webFunctions().click(test, vehicleDetails1of2.dropDownModel_Select,
				test.getTestData("Vehicle.V" + count + ".Model"));
		test.webFunctions().click(test, vehicleDetails1of2.btn_FinanceOrLease,
				test.getTestData("Vehicle.V" + count + ".Financeorlease"));

		if (test.getBrandName().equals("Apparent")) {
			try {
				if (vehicleDetails1of2.btn_rideSharing.isDisplayed() == true) {
					test.webFunctions().click(test, vehicleDetails1of2.btn_rideSharingOption,
							test.getTestData("Vehicle.V" + count + ".RideSharing"));
					if (vehicleDetails1of2.dropDownRidesharingHrs.isDisplayed() == true) {
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs);
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs_Select,
								test.getTestData("Vehicle.V" + count + ".RideSharingHrs"));
					} else {
						test.webFunctions().click(test, vehicleDetails1of2.btn_vehicleUse,
								test.getTestData("Vehicle.V" + count + ".Use"));
					}
				} else {
					test.webFunctions().click(test, vehicleDetails1of2.btn_vehicleUse,
							test.getTestData("Vehicle.V" + count + ".Use"));

				}
			} catch (Exception e) {
				test.webFunctions().click(test, vehicleDetails1of2.btn_vehicleUse,
						test.getTestData("Vehicle.V" + count + ".Use"));
			}
		} else {
			try {
				if (vehicleDetails1of2.btn_rideSharing.isDisplayed() == true) {
					test.webFunctions().click(test, vehicleDetails1of2.btn_rideSharingOption,
							test.getTestData("Vehicle.V" + count + ".RideSharing"));
					if (vehicleDetails1of2.dropDownRidesharingHrs.isDisplayed() == true) {
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs);
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs_Select,
								test.getTestData("Vehicle.V" + count + ".RideSharingHrs"));
					} else {
						test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Elephant);
						test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Select_Elephant,
								test.getTestData("Vehicle.V" + count + ".Use"));
					}
				} else {
					test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Elephant);
					test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Select_Elephant,
							test.getTestData("Vehicle.V" + count + ".Use"));

				}
			} catch (Exception e) {
				test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Elephant);
				test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Select_Elephant,
						test.getTestData("Vehicle.V" + count + ".Use"));
			}

		}

		test.webFunctions().click(test, vehicleDetails1of2.dropDownMileage);
		test.webFunctions().click(test, vehicleDetails1of2.dropDownMileage_Select,
				test.getTestData("Vehicle.V" + count + ".Mileage"));
		test.webFunctions().click(test, vehicleDetails1of2.dropDownParked);
		test.webFunctions().click(test, vehicleDetails1of2.dropDownParked_Select,
				test.getTestData("Vehicle.V" + count + ".Parked"));
		test.webFunctions().click(test, vehicleDetails1of2.btn_KeptInZIP,
				test.getTestData("Vehicle.V" + count + ".KeptinZip"));
		test.webFunctions().click(test, vehicleDetails1of2.btn_Next);
		test.getLogger().info("Vehicle Details 1of2 page: Success!");

	}

	public void vehicleDetails(Testing test) {
		for (int count = 1; count <= test.vehicleCount; count++) {
			vehicleDetails_1of2(test, count);
			vehicleDetails2_MethodCall.vehicleDetails_2of2(test, count);
			vehicleList_MethodCall.vehicleList(test, count);
		}
	}

	public void DPF_vehicleDetails_1of2(Testing test, int count) {
		test.setPage(VehicleDetails1of2.class);
		VehicleDetails1of2 vehicleDetails1of2 = (VehicleDetails1of2) PageFactory.initElements(test.driver,
				test.getPage());
		test.webFunctions().click(test, vehicleDetails1of2.btn_FinanceOrLease,
				test.getTestData("Vehicle.V" + count + ".Financeorlease"));
		if (test.getBrandName().equals("Apparent")) {
			try {
				if (vehicleDetails1of2.btn_rideSharing.isDisplayed() == true) {
					test.webFunctions().click(test, vehicleDetails1of2.btn_rideSharingOption,
							test.getTestData("Vehicle.V" + count + ".RideSharing"));
					if (vehicleDetails1of2.dropDownRidesharingHrs.isDisplayed() == true) {
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs);
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs_Select,
								test.getTestData("Vehicle.V" + count + ".RideSharingHrs"));
					} else {
						test.webFunctions().click(test, vehicleDetails1of2.btn_vehicleUse,
								test.getTestData("Vehicle.V" + count + ".Use"));
					}
				} else {
					test.webFunctions().click(test, vehicleDetails1of2.btn_vehicleUse,
							test.getTestData("Vehicle.V" + count + ".Use"));

				}
			} catch (Exception e) {
				test.webFunctions().click(test, vehicleDetails1of2.btn_vehicleUse,
						test.getTestData("Vehicle.V" + count + ".Use"));
			}
		} else {
			try {
				if (vehicleDetails1of2.btn_rideSharing.isDisplayed() == true) {
					test.webFunctions().click(test, vehicleDetails1of2.btn_rideSharingOption,
							test.getTestData("Vehicle.V" + count + ".RideSharing"));
					if (vehicleDetails1of2.dropDownRidesharingHrs.isDisplayed() == true) {
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs);
						test.webFunctions().click(test, vehicleDetails1of2.dropDownRidesharingHrs_Select,
								test.getTestData("Vehicle.V" + count + ".RideSharingHrs"));
					} else {
						test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Elephant);
						test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Select_Elephant,
								test.getTestData("Vehicle.V" + count + ".Use"));
					}
				} else {
					test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Elephant);
					test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Select_Elephant,
							test.getTestData("Vehicle.V" + count + ".Use"));

				}
			} catch (Exception e) {
				test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Elephant);
				test.webFunctions().click(test, vehicleDetails1of2.dropDownvehicleUsage_Select_Elephant,
						test.getTestData("Vehicle.V" + count + ".Use"));
			}

		}

		test.webFunctions().click(test, vehicleDetails1of2.dropDownMileage);
		test.webFunctions().click(test, vehicleDetails1of2.dropDownMileage_Select,
				test.getTestData("Vehicle.V" + count + ".Mileage"));
		test.webFunctions().click(test, vehicleDetails1of2.dropDownParked);
		test.webFunctions().click(test, vehicleDetails1of2.dropDownParked_Select,
				test.getTestData("Vehicle.V" + count + ".Parked"));
		test.webFunctions().click(test, vehicleDetails1of2.btn_KeptInZIP,
				test.getTestData("Vehicle.V" + count + ".KeptinZip"));
		test.webFunctions().click(test, vehicleDetails1of2.btn_Next);
		test.getLogger().info("Vehicle Details 1of2 page: Success!");

	}

	public void DPF_vehicleDetails(Testing test) {
		vehicleList_MethodCall.DPF_vehicleList(test);
		for (int count = 1; count <= test.vehicleCount; count++) {
			DPF_vehicleDetails_1of2(test, count);
			vehicleDetails2_MethodCall.vehicleDetails_2of2(test, count);
		}
		vehicleList_MethodCall.vehicleList(test, test.vehicleCount);
	}
}