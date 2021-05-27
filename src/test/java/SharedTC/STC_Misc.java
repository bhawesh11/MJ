package SharedTC;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ApplicationPages.BreadCrumb;
import ApplicationPages.VehicleList;
import resources.Testing;

public class STC_Misc {

	public void verifyDisclaimerMessages(Testing test) {

		Assert.assertEquals(test.getOutput("Address_Page_Disclaimer"),
				test.getTestData("Disclaimer.Address_Page_Disclaimer"));
		test.getLogger().info("Verification of Address Page Disclaimer is Passed!!!");
		Assert.assertEquals(test.getOutput("Homesite_Disclaimer"), test.getTestData("Disclaimer.Homesite_Disclaimer"));
		test.getLogger().info("Verification of Homesite Disclaimer is Passed!!!");
		Assert.assertEquals(test.getOutput("Discount_Page_Disclaimer"),
				test.getTestData("Disclaimer.Discount_Page_Disclaimer"));
		test.getLogger().info("Verification of Discount Page Disclaimer is Passed!!!");
		Assert.assertEquals(test.getOutput("Purchase_Disclaimer"), test.getTestData("Disclaimer.Purchase_Disclaimer"));
		test.getLogger().info("Verification of Purchase Disclaimer is Passed!!!");
		Assert.assertEquals(test.getOutput("Messages_Disclaimer"), test.getTestData("Disclaimer.Messages_Disclaimer"));
		test.getLogger().info("Verification of Text Messages Disclaimer is Passed!!!");
		Assert.assertEquals(test.getOutput("Esignature_Disclaimer"),
				test.getTestData("Disclaimer.Esignature_Disclaimer"));
		test.getLogger().info("Verification of Esignature Disclaimer is Passed!!!");
		Assert.assertEquals(test.getOutput("Redpoint_County_Disclaimer"),
				test.getTestData("Disclaimer.Redpoint_County_Disclaimer"));
		test.getLogger().info("Verification of Redpoint County Disclaimer is Passed!!!");
		Assert.assertEquals(test.getOutput("DebitAmount_Disclaimer"),
				test.getTestData("Disclaimer.DebitAmount_Disclaimer"));
		test.getLogger().info("Verification of Debit and Future Debits Disclaimer is Passed!!!");
	}

	public void clickDriversOnBreadCrumb(Testing test) {

		test.setPage(BreadCrumb.class);
		BreadCrumb breadcrumb = (BreadCrumb) PageFactory.initElements(test.driver, test.getPage());

		test.webFunctions().click(test, breadcrumb.btn_BreadCrumb_Drivers);
		test.getLogger().info("Clicked Drivers on Breadcrumb..");
	}

}
