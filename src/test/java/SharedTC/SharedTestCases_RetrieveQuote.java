package SharedTC;

import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import ApplicationPages.RetrieveQuote;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_RetrieveQuote {

    public void RetrieveQuote(Testing test)
    {
        test.setPage(RetrieveQuote.class);
        RetrieveQuote retrieveQuote = (RetrieveQuote) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,retrieveQuote.text_Email, test.getOutput("LastName")+test.getTestData("Policy-Start-date.Email"));
        test.webFunctions().type(test,retrieveQuote.text_DOB, test.getTestData("Policyholder.DOB"));
        test.webFunctions().type(test,retrieveQuote.text_LastName, test.getOutput("LastName"));
        test.webFunctions().click(test,retrieveQuote.btn_RetrieveQuote);
        test.getLogger().info("RetrieveQuote Page: Success!");
    }
    
    public void clickRetrieveQuote(Testing test) {
    	test.setPage(RetrieveQuote.class);
        RetrieveQuote retrieveQuote = (RetrieveQuote) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test, retrieveQuote.btn_RetrieveSavedQuote);
        test.getLogger().info("Clicked Retrieve Saved Quote Link...");
    }
}
