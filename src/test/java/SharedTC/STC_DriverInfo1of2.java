package SharedTC;

import ApplicationPages.DriverInfo1of2;
import ApplicationPages.DriverInfo2of2;
import ApplicationPages.DriverList;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_DriverInfo1of2 {

	// Creating SharedTestCases_Incidents class object to call its method
	STC_Incidents incident_MethodCall = new STC_Incidents();

	public void driverInfo1of2(Testing test) {

		test.setPage(DriverInfo1of2.class);
		DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, driverInfo1of2.textBox_FirstName,
				test.getTestData("SecondDriver.Second_FirstName"));
		test.webFunctions().type(test, driverInfo1of2.textBox_LastName,
				test.getTestData("SecondDriver.Second_LastName"));
		test.webFunctions().type(test, driverInfo1of2.textBox_DOB, test.getTestData("SecondDriver.Second_DOB"));
		test.webFunctions().click(test, driverInfo1of2.btn_Gender, test.getTestData("SecondDriver.Second_Gender"));
		test.webFunctions().click(test, driverInfo1of2.btn_Relationship, test.getTestData("SecondDriver.RelationShip"));
		test.webFunctions().click(test, driverInfo1of2.btn_MaritalStatus,
				test.getTestData("SecondDriver.Second_MaritalStatus"));
		test.webFunctions().click(test, driverInfo1of2.btn_Continue);
		test.getLogger().info("Additional Driver 1of2 page: Success!");
	}

	public void driverInfo_1of2(Testing test, int count) {

		test.setPage(DriverInfo1of2.class);
		DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, driverInfo1of2.textBox_FirstName,
				test.getTestData("Driver.D" + count + ".FirstName"));
		test.webFunctions().type(test, driverInfo1of2.textBox_LastName,
				test.getTestData("Driver.D" + count + ".LastName"));
		test.webFunctions().type(test, driverInfo1of2.textBox_DOB, test.getTestData("Driver.D" + count + ".DOB"));
		test.webFunctions().click(test, driverInfo1of2.btn_Gender, test.getTestData("Driver.D" + count + ".Gender"));
		test.webFunctions().click(test, driverInfo1of2.btn_Relationship,
				test.getTestData("Driver.D" + count + ".Relationship"));
		test.webFunctions().click(test, driverInfo1of2.btn_MaritalStatus,
				test.getTestData("Driver.D" + count + ".MaritalStatus"));
		test.webFunctions().click(test, driverInfo1of2.btn_Continue);
		currentlyInSchool(test);
		test.getLogger().info("Additional Driver 1of2 page: Success!");
	}

	public void driverInfo_2of2(Testing test, int count) {
		test.setPage(DriverInfo2of2.class);
		DriverInfo2of2 driverInfo2of2 = (DriverInfo2of2) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().click(test, driverInfo2of2.btn_ValidLicense,
				test.getTestData("Driver.D" + count + ".ValidLicense"));
		try {
			if (test.getTestData("Driver.D" + count + ".ValidLicense").equalsIgnoreCase("No")) {
				test.webFunctions().click(test, driverInfo2of2.dropdown_LicenseStatus);
				test.webFunctions().click(test, driverInfo2of2.dropdown_LicenseStatusSelect,
						test.getTestData("Driver.D" + count + ".LicenseStatus"));
				try {
					if (driverInfo2of2.btn_driveAnyYourVehicle.isDisplayed()) {
						test.webFunctions().click(test, driverInfo2of2.btn_driveAnyYourVehicle);

					}
				} catch (Throwable e) {
					test.webFunctions().click(test, driverInfo2of2.btn_AgeFirstLicensed,
							test.getTestData("Driver.D" + count + ".Agefirstlicensed"));
					test.webFunctions().click(test, driverInfo2of2.btn_vehicleAssignment,
							test.getTestData("Vehicle.V" + count + ".Model"));
				}

			}

			else {
				test.webFunctions().click(test, driverInfo2of2.btn_AgeFirstLicensed,
						test.getTestData("Driver.D" + count + ".Agefirstlicensed"));
				test.webFunctions().click(test, driverInfo2of2.btn_vehicleAssignment,
						test.getTestData("Vehicle.V" + count + ".Model"));
				
			}
		} catch (Throwable e) {
			// TODO: handle exception
		}

		test.webFunctions().click(test, driverInfo2of2.btn_IncidentHistory,
				test.getTestData("Driver.D" + count + ".IncidentHistory"));
		test.webFunctions().click(test, driverInfo2of2.btn_Next);
		test.getLogger().info("Additional Driver 2of2 page: Success!");
		incident_MethodCall.incident_Driver(test, count);
	}

	public void driverList(Testing test, int count) {
		test.setPage(DriverList.class);
		DriverList driverList = (DriverList) PageFactory.initElements(test.driver, test.getPage());
		if (count == test.driverCount) {
			test.webFunctions().click(test, driverList.btn_DoneWithDrivers);
			test.getLogger().info("DriverList page: Success!");
		} else {
			test.webFunctions().click(test, driverList.btn_AddAnotherDriver);
			test.getLogger().info("DriverList page: Success!");
		}

	}
	
	public void driverDetails(Testing test) {
		int count_init;
		if (test.getTestData("PolicyholderDetails.MaritalStatus").equalsIgnoreCase("Married")) {
			count_init = 2;
		} else {
			count_init = 1;
		}
		for (int count = count_init; count <= test.driverCount; count++) {
			driverList(test, count);
			if (count == test.driverCount) {
				break;
			} else {
				if (test.getTestData("PolicyholderDetails.MaritalStatus").equalsIgnoreCase("Married")) {
					driverInfo_1of2(test, count - 1);
					driverInfo_2of2(test, count - 1);
				} else {
					driverInfo_1of2(test, count);
					driverInfo_2of2(test, count);
				}
			}

		}

	}

	public void currentlyInSchool(Testing test) {
		test.setPage(DriverInfo1of2.class);
		DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(test.driver, test.getPage());
		try {
			if (driverInfo1of2.btn_CurrentlyInSchool.isDisplayed() == true) {
				test.webFunctions().click(test, driverInfo1of2.btn_CurrentlyInSchool);
				try {
					if (driverInfo1of2.btn_GoodStudent.isDisplayed() == true) {
						test.webFunctions().click(test, driverInfo1of2.btn_GoodStudent);
					}
				} catch (Exception e) {
				}
				test.webFunctions().click(test, driverInfo1of2.btn_AwayAtSchool);
				test.webFunctions().click(test, driverInfo1of2.btn_Continue);
				test.getLogger().info("Currently In School page: Success!");
			}
		} catch (Exception e) {
		}
	}

	public void DPF_driverList(Testing test) {
		test.setPage(DriverList.class);
		DriverList driverList = (DriverList) PageFactory.initElements(test.driver, test.getPage());
		for(int count=1;count<test.driverCount;count++){
			test.webFunctions().staticWait(3000);
	        test.webFunctions().click(test, driverList.checkboxDPF_SelectDrivers,test.getTestData("Driver.D"+count+".DriverName"));
	        }
		if(test.driverCount != 1) {
			test.webFunctions().staticWait(3000);
		test.webFunctions().click(test, driverList.btn_DoneWithDrivers);
		}
		}
	
	public void DPF_driverInfo_1of2(Testing test, int count) {

		test.setPage(DriverInfo1of2.class);
		DriverInfo1of2 driverInfo1of2 = (DriverInfo1of2) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, driverInfo1of2.textBox_DOB, test.getTestData("Driver.D" + count + ".DOB"));
		test.webFunctions().click(test, driverInfo1of2.btn_Gender, test.getTestData("Driver.D" + count + ".Gender"));
		test.webFunctions().click(test, driverInfo1of2.btn_Relationship,
				test.getTestData("Driver.D" + count + ".Relationship"));
		test.webFunctions().click(test, driverInfo1of2.btn_MaritalStatus,
				test.getTestData("Driver.D" + count + ".MaritalStatus"));
		test.webFunctions().click(test, driverInfo1of2.btn_Continue);
		currentlyInSchool(test);
		test.getLogger().info("Additional Driver 1of2 page: Success!");
	}
	
	
	public void DPF_driverDetails(Testing test) {
    DPF_driverList(test);
    for (int count = 1; count < test.driverCount; count++) {
    DPF_driverInfo_1of2(test,count);
    driverInfo_2of2(test,count);
	}
    test.setPage(DriverList.class);
	DriverList driverList = (DriverList) PageFactory.initElements(test.driver, test.getPage());
    test.webFunctions().click(test, driverList.btn_DoneWithDrivers);
	test.getLogger().info("DriverList page: Success!");
}}
