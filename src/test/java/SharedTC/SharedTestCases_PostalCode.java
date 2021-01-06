package SharedTC;

import ApplicationPages.PostalCode;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PostalCode {
    

    // POSTAL CODE
    public void postalCode(Testing test) {

        test.setPage(PostalCode.class);
        PostalCode postalCode = (PostalCode) PageFactory.initElements(test.driver, test.getPage());
        
       test.webFunctions().click(test,postalCode.btn_LetsGetStarted);
        test.getLogger().info("Beginning to Quote.");
    }

    
// -------------------------------------------------------------------------------------------
    public void postalCode_Elephant(Testing test) {

        test.setPage(PostalCode.class);
        PostalCode postalCode = (PostalCode) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,postalCode.textBox_PostalCode, test.getTestData("PostalCode.PostalCode"));
       test.webFunctions().click(test,postalCode.btn_LetsGetStarted);
        test.getLogger().info("Beginning to Quote.");
    }
}
