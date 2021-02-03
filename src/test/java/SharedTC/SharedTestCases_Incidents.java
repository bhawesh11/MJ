package SharedTC;

import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import ApplicationPages.Incidents;

public class SharedTestCases_Incidents {

    public void add_MoreThan3DUI(Testing test)
    {
        test.setPage(Incidents.class);
        Incidents incidents = (Incidents) PageFactory.initElements(test.driver, test.getPage());
        int alwaysFalse =1;
        do
            {
            test.webFunctions().dropdown(test,incidents.dropdown_WhatHappened, test.getTestData("Policyholder.WhatHappened"));
            test.webFunctions().type(test,incidents.textBox_IncidentDate, test.getTestData("Policyholder.IncidentDate"));
            test.webFunctions().click(test,incidents.btn_AddAnotherIncident);
             }
            while (alwaysFalse == 2) ;
            {
                for (int additionalDUI = 1; additionalDUI < 4; additionalDUI++)
                {
                    test.webFunctions().dropdown(test,incidents.dropdown_WhatHappened, test.getTestData(additionalDUI+"Policyholder.WhatHappened"));
                    test.webFunctions().type(test,incidents.textBox_IncidentDate, test.getTestData(additionalDUI+"Policyholder.IncidentDate"));
                    test.webFunctions().click(test,incidents.btn_AddAnotherIncident);

                }
                test.webFunctions().click(test,incidents.btn_Next);
            }



    }

}
