package SharedTC;

import resources.Testing;
import org.apache.log4j.Logger;
import ApplicationPages.RightPanel;
import resources.BrowserFactory;
import resources.TestData;
import resources.WebFunctions;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_RightPanel {
    public void AddDriver(Testing test)
    {
        test.setPage(RightPanel.class);
        RightPanel rightPanel = (RightPanel) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,rightPanel.btn_RightPanelDriverExpand);
        test.webFunctions().click(test,rightPanel.btn_AddDriver);
    }


    }
