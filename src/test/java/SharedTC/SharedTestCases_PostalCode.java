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

}
