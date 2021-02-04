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
        test.webFunctions().click(test,address.MoveInYear);
        test.webFunctions().click(test, address.MoveInYear_Select,test.getTestData("Address.MoveinYear"));
        test.webFunctions().click(test,address.MoveInMonth);
        test.webFunctions().click(test,address.MoveInMonth_Select,test.getTestData("Address.MoveinMonth"));
        test.webFunctions().click(test,address.btn_ResidenceType,test.getTestData("Address.TypeofResidence"));  
        test.setOutput("Address_Page_Disclaimer", test.webFunctions().readInfo(test, address.Address_Page_Disclaimer));
        test.setOutput("Homesite_Disclaimer", test.webFunctions().readInfo(test, address.Homesite_Disclaimer));
        test.webFunctions().click(test,address.btn_Next);
        test.getLogger().info("Address page: Success!");
    }

// -------------------------------------------------------------------------------------------

}
