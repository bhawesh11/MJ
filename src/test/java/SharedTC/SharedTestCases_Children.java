package SharedTC;

import ApplicationPages.Children;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Children {

    
    

    //	CHILDREN
    public void children(Testing test){
        try{Thread.sleep(2000);}catch(Exception e2){};
        if(!test.driver.getCurrentUrl().contains("policyholder")){
            test.setPage(Children.class);
            Children children = (Children) PageFactory.initElements(test.driver, test.getPage());

            test.webFunctions().clickJS(test,children.CheckBox_LittleOnes);
            test.webFunctions().click(test,children.btn_Next);
            test.getLogger().info("Children page: Success!");
        }
    }

// -------------------------------------------------------------------------------------------
}
