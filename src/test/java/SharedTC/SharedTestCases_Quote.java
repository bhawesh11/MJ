package SharedTC;

import ApplicationPages.Quote;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SharedTestCases_Quote {

    

    

    public void quote(Testing test) {
        test.setPage(Quote.class);
        Quote quote = (Quote) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().click(test,quote.btn_Continue);
        test.getLogger().info("Quote Page: Success!");
    }

}
