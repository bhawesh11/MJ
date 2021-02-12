package SharedTC;

import ApplicationPages.Spouse2of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Spouse2of2 {

    public void Spouse2of2(Testing test) {
        test.setPage(Spouse2of2.class);
        Spouse2of2 spouse = (Spouse2of2) PageFactory.initElements(test.driver, test.getPage());

        test.webFunctions().click(test,spouse.btn_ValidLicense, test.getTestData("Spouse.ValidLicense"));
        test.webFunctions().click(test,spouse.btn_AgeFirstLicensed, test.getTestData("Spouse.Agefirstlicensed"));
        test.webFunctions().click(test,spouse.btn_VehicleDriveMostOften,test.getTestData("Vehicle.V2.Model"));
        test.webFunctions().click(test,spouse.btn_IncidentHistory, test.getTestData("Spouse.Incident"));
        test.webFunctions().click(test,spouse.btn_Next);
        test.getLogger().info("Partner page 2of2 : Success!");
    }
}
