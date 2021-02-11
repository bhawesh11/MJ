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
		test.webFunctions().staticWait(9000);
		test.webFunctions().click(test, quote.btn_Continue);
		try {
		if (test.getBrandName().equalsIgnoreCase("Apparent")
				&& quote.btn_ContinueWithoutCoveragePOPUP.isDisplayed()) {
			test.webFunctions().staticWait(1000);
			test.webFunctions().click(test, quote.btn_ContinueWithoutCoveragePOPUP);
			test.getLogger().info("Quote Page: Success!");
		} 
		}catch(Exception e) {test.getLogger().info("Quote Page: Success!");}
		// test.getLogger().info("Quote Page: Success!");
	}

}
