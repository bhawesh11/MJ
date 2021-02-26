package SharedTC;

import ApplicationPages.Address;
import resources.Testing;
import org.openqa.selenium.support.PageFactory;

public class STC_Address {
    //	ADDRESS
public void address(Testing test) {
        
    	test.setPage(Address.class);
        Address address = (Address) PageFactory.initElements(test.driver, test.getPage());
        
        test.webFunctions().dropdownMelissaJS(test,address.textBox_Address, test.getTestData("Address.StreetAddress")); //12 gjdfglkj
       try { if(address.textBox_Zip.isDisplayed())
        	{
        	test.webFunctions().type(test, address.textBox_Zip,test.getTestData("Address.Zipcode"));
        	test.webFunctions().staticWait(3000);
        	if(address.dropdown_County.isDisplayed())
        	{
        		test.webFunctions().dropdown(test, address.dropdown_County,test.getTestData("Address.County"));
        	}
        	}} catch(Throwable e) {}
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
}
