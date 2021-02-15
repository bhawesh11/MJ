package testElephant;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeSuite;

import SharedTC.STC_Address;
import SharedTC.STC_Assignment;
import SharedTC.STC_Billing;
import SharedTC.STC_ConfirmDriver;
import SharedTC.STC_ConfirmVehicle;
import SharedTC.STC_DriverInfo1of2;
import SharedTC.STC_DriverInfo2of2;
import SharedTC.STC_DriverList;
import SharedTC.STC_GetInfo;
import SharedTC.STC_Incidents;
import SharedTC.STC_InsuranceHistory;
import SharedTC.STC_Misc;
import SharedTC.STC_PolicyHolder;
import SharedTC.STC_PolicyHolderDetails1of2;
import SharedTC.STC_PolicyHolderDetails2of2;
import SharedTC.STC_PolicyStatrDate;
import SharedTC.STC_PostalCode;
import SharedTC.STC_Quote;
import SharedTC.STC_RetrieveQuote;
import SharedTC.STC_RightPanel;
import SharedTC.STC_Spouse1of2;
import SharedTC.STC_Spouse2of2;
import SharedTC.STC_VehicleDetails1of2;
import SharedTC.STC_VehicleDetails2of2;
import SharedTC.STC_VehicleList;

public class TC_Regression {

	Logger log = Logger.getLogger("Test Suite");
	private final String brandName = "Elephant";

	// ==============================================================================================
	// *** ADDITIONAL METHODS ***

	@BeforeSuite
	public void openBrowser() throws IOException {
		PropertyConfigurator.configure("log4j.properties");
	}

	// ==============================================================================================
	// Creating Objects :

	STC_PostalCode PostalCode = new STC_PostalCode();
	STC_PolicyHolder PolicyHolder = new STC_PolicyHolder();
	STC_Address Address = new STC_Address();
	STC_VehicleDetails1of2 VehicleDetails1of2 = new STC_VehicleDetails1of2();
	STC_VehicleDetails2of2 VehicleDetails2of2 = new STC_VehicleDetails2of2();
	STC_VehicleList VehicleList = new STC_VehicleList();
	STC_PolicyHolderDetails1of2 PolicyHolderDetails1of2 = new STC_PolicyHolderDetails1of2();
	STC_PolicyHolderDetails2of2 PolicyHolderDetails2of2 = new STC_PolicyHolderDetails2of2();
	STC_Spouse1of2 Spouse1of2 = new STC_Spouse1of2();
	STC_Spouse2of2 Spouse2of2 = new STC_Spouse2of2();
	STC_DriverInfo1of2 DriverInfo1of2 = new STC_DriverInfo1of2();
	STC_DriverInfo2of2 DriverInfo2of2 = new STC_DriverInfo2of2();
	STC_Incidents incidents = new STC_Incidents();
	STC_DriverList DriverList = new STC_DriverList();
	STC_Assignment Assignment = new STC_Assignment();
	STC_InsuranceHistory InsuranceHistory = new STC_InsuranceHistory();
	STC_PolicyStatrDate PolicyStatrDate = new STC_PolicyStatrDate();
	STC_Quote Quote = new STC_Quote();
	STC_RetrieveQuote RetrieveQuote = new STC_RetrieveQuote();
	STC_RightPanel RightPanel = new STC_RightPanel();
	STC_ConfirmDriver ConfirmDriver = new STC_ConfirmDriver();
	STC_ConfirmVehicle ConfirmVehicle = new STC_ConfirmVehicle();
	STC_Billing Billing = new STC_Billing();
	STC_GetInfo GetInfo = new STC_GetInfo();
	STC_Misc misc = new STC_Misc();

	// ==============================================================================================
//    ***_TEST_CASES_***

}
