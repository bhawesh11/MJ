package SharedTC;

import ApplicationPages.Family;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Family {

    
    
    //	FAMILY
    public void family(Testing test) {
        try{Thread.sleep(2000);}catch(Exception e2){};
        if(!test.driver.getCurrentUrl().contains("policyholder")){
            test.setPage(Family.class);
            Family family = (Family) PageFactory.initElements(test.driver, test.getPage());
            test.webFunctions().click(test,family.btn_Family);
            test.webFunctions().click(test,family.btn_Next);
            test.getLogger().info("Family page: Success!");
        }
    }

// -------------------------------------------------------------------------------------------
}
