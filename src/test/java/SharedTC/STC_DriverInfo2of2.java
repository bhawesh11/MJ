package SharedTC;

import ApplicationPages.DriverInfo2of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_DriverInfo2of2 {
	
	STC_Incidents incident_MethodCall = new STC_Incidents();
	
    //  Additional Driver page
    public void driverInfo2of2(Testing test) {
        test.setPage(DriverInfo2of2.class);
        DriverInfo2of2 driverInfo2of2 = (DriverInfo2of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,driverInfo2of2.btn_ValidLicense, test.getTestData("Second_Valid License"));
        test.webFunctions().click(test,driverInfo2of2.btn_AgeFirstLicensed,test.getTestData("Second_Age first licensed"));
        //test.webFunctions().click(driverInfo2of2.btn_vehicleAssignment,test.getTestData(""));
        test.webFunctions().click(test,driverInfo2of2.btn_IncidentHistory,test.getTestData("Second_Incident"));
        test.webFunctions().click(test,driverInfo2of2.btn_Next);
        test.getLogger().info("Additional Driver 2of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------

	
	  public void driverInfo_2of2(Testing test, int count) {
	  test.setPage(DriverInfo2of2.class); DriverInfo2of2 driverInfo2of2 =
	  (DriverInfo2of2) PageFactory.initElements(test.driver, test.getPage());
	  test.webFunctions().click(test, driverInfo2of2.btn_ValidLicense,
	  test.getTestData("Driver.D" + count + ".ValidLicense")); try {
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
	  
 // -------------------------------------------------------------------------------------------
	  
	  public void dpfDriverInfo_2of2(Testing test, int count) {
	  test.setPage(DriverInfo2of2.class); DriverInfo2of2 driverInfo2of2 =
	  (DriverInfo2of2) PageFactory.initElements(test.driver, test.getPage());
	  test.webFunctions().click(test, driverInfo2of2.btn_ValidLicense,
	  test.getTestData("Driver.D" + count + ".ValidLicense")); try {
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
					test.webFunctions().click(test, driverInfo2of2.DPF_btn_VehicleDriveMostOften);
				}

			}

			else {
				test.webFunctions().click(test, driverInfo2of2.btn_AgeFirstLicensed,
						test.getTestData("Driver.D" + count + ".Agefirstlicensed"));
				test.webFunctions().click(test, driverInfo2of2.DPF_btn_VehicleDriveMostOften);
				
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
	
	
	
	
}
