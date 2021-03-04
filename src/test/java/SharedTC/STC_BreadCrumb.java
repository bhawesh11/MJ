package SharedTC;

import ApplicationPages.BreadCrumb;
import ApplicationPages.PostalCode;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_BreadCrumb {

	public void navigate2driver(Testing test) {
		test.setPage(BreadCrumb.class);
		BreadCrumb breadCrumb = (BreadCrumb) PageFactory.initElements(test.driver, test.getPage());

		test.webFunctions().click(test, breadCrumb.btn_BreadCrumb_Drivers);
		test.getLogger().info("Driver link clicked !");
	}
	
	public void navigate2Quote(Testing test) {
		test.setPage(BreadCrumb.class);
		BreadCrumb breadCrumb = (BreadCrumb) PageFactory.initElements(test.driver, test.getPage());

		test.webFunctions().click(test, breadCrumb.btn_BreadCrumb_Quote);
		test.getLogger().info("Driver link clicked !");
	}
	
}
