package SharedTC;

import ApplicationPages.Spouse1of2;
import ApplicationPages.Spouse2of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Spouse1of2 {

    public void Spouse1of2(Testing test) {
        test.setPage(Spouse1of2.class);
        Spouse1of2 spouse = (Spouse1of2) PageFactory.initElements(test.driver, test.getPage());

        test.webFunctions().type(test,spouse.textBox_FirstName, test.getTestData("Spouse.FirstName"));
        test.webFunctions().type(test,spouse.textBox_LastName, test.getTestData("Spouse.LastName"));
        test.webFunctions().type(test,spouse.textBox_DOB, test.getTestData("Spouse.DOB"));
        test.webFunctions().click(test,spouse.btn_Gender, test.getTestData("Spouse.Gender"));
        test.webFunctions().click(test,spouse.btn_Education, test.getTestData("Spouse.Education"));
        test.webFunctions().click(test,spouse.btn_CurrentlyEmployed, test.getTestData("Spouse.Employment"));
        test.webFunctions().click(test,spouse.btn_Continue);
        test.getLogger().info("Partner page 1of2 : Success!");
    }


}
