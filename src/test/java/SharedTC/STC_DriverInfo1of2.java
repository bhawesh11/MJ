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
	STC_DriverInfo2of2 driverInfo_MethodCall = new STC_DriverInfo2of2();
	STC_DriverList driverlist_MethodCall = new STC_DriverList();


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


	public void driverDetails(Testing test) {
		int count_init;
		if (test.getTestData("PolicyholderDetails.MaritalStatus").equalsIgnoreCase("Married")) {
			count_init = 2;
		} else {
			count_init = 1;
		}
		for (int count = count_init; count <= test.driverCount; count++) {
			driverlist_MethodCall.driverList(test, count);
			if (count == test.driverCount) {
				break;
			} else {
				if (test.getTestData("PolicyholderDetails.MaritalStatus").equalsIgnoreCase("Married")) {
					driverInfo_1of2(test, count - 1);
					driverInfo_MethodCall.driverInfo_2of2(test, count - 1);
				} else {
					driverInfo_1of2(test, count);
					driverInfo_MethodCall.driverInfo_2of2(test, count);
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

	public void dpfDriverInfo_1of2(Testing test, int count) {

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
	
	
	public void dpfDriverDetails(Testing test) {
		for (int count = 1; count < test.driverCount; count++) {
		 driverlist_MethodCall.DPF_driverList(test, count);
   		 dpfDriverInfo_1of2(test,count);
   		 driverInfo_MethodCall.dpfDriverInfo_2of2(test,count);
   			}
   	    test.setPage(DriverList.class);
   		DriverList driverList = (DriverList) PageFactory.initElements(test.driver, test.getPage());
   	    test.webFunctions().click(test, driverList.btn_DoneWithDrivers);
   		test.getLogger().info("DriverList page: Success!");
}}
