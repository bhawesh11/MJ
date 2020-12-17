package SharedTC;

import ApplicationPages.Address;
import resources.Testing;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Address {
    //	ADDRESS
    public void address(Testing test) {
        
    	test.setPage(Address.class);
        Address address = (Address) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().dropdownMelissaJS(test,address.textBox_Address, test.getTestData("Address.StreetAddress"));
//		test.webFunctions().type(address.textBox_Apartment,test.getTestData("Apartment/Unit"));
        test.webFunctions().dropdown(test,address.MoveInYear,test.getTestData("Address.MoveinYear"));
        test.webFunctions().dropdown(test,address.MoveInMonth,test.getTestData("Address.MoveinMonth"));
        test.webFunctions().click(test,address.btn_ResidenceType,test.getTestData("Address.TypeofResidence"));
        test.webFunctions().click(test,address.btn_Next);
        test.getLogger().info("Address page: Success!");
    }

// -------------------------------------------------------------------------------------------

}
