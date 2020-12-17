package SharedTC;

import ApplicationPages.Address;
import ApplicationPages.Billing;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_Billing {

	public void billing(Testing test) {
		test.setPage(Billing.class);
        Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().type(test,billing.textbox_CreditCardFirstName, test.getTestData("Billing.CardHolderFirstName"));
        test.webFunctions().type(test,billing.textbox_CreditCardLastName, test.getTestData("Billing.CardHolderLastName"));
        test.webFunctions().type(test,billing.textbox_CreditCardNo, test.getTestData("Billing.CardNo"));
        test.webFunctions().type(test,billing.textbox_CreditCardExpiryDate, test.getTestData("Billing.ExpiryDate"));
        test.webFunctions().click(test,billing.btn_Purchase);
        test.getLogger().info("Payment Plan page: Success!");
    }
}
