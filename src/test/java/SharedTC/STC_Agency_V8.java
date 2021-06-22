package SharedTC;

import org.openqa.selenium.support.PageFactory;

import ApplicationPages.Agency_V8;
import resources.Testing;

public class STC_Agency_V8 {
	
	Agency_V8 v8;
	
	public STC_Agency_V8(Testing test){
		test.setPage(Agency_V8.class);
		v8 = (Agency_V8) PageFactory.initElements(test.driver, test.getPage());
	}
	
	public void policyHolder(Testing test) {
                  
        test.webFunctions().click(test,v8.btn_Next);
        test.getLogger().info("Policyholder page: Success!");
    }

}
