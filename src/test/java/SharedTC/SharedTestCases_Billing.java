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
        try {
			Thread.sleep(8000);
		} catch (Exception e) {
		}
        test.webFunctions().click(test,billing.link_PaymentPlan, test.getTestData("PaymentPlan"));
        test.webFunctions().type(test,billing.textBox_CreditCardFirstName, test.getTestData("Billing.CardHolderFirstName"));
        test.webFunctions().type(test,billing.textBox_CreditCardLastName, test.getTestData("Billing.CardHolderLastName"));
        test.webFunctions().type(test,billing.textBox_CreditCardNo, test.getTestData("Billing.CardNo"));
        test.webFunctions().click(test,billing.dropdownCreditCardExpiryMonth);
        test.webFunctions().click(test,billing.dropdownCreditCardExpiryMonth_Select);
        test.webFunctions().click(test,billing.dropdownCreditCardExpiryYear);
        test.webFunctions().click(test,billing.dropdownCreditCardExpiryYear_Select);     
        test.webFunctions().click(test,billing.btn_sameCardasAbove);
        test.webFunctions().click(test,billing.btn_receiveTextMessage);
        test.webFunctions().click(test,billing.btn_Purchase);
        test.getLogger().info("Payment Plan page: Success!");
    }
	public void billing_Elephant(Testing test) {
        test.setPage(Billing.class);
        Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
        }
        test.webFunctions().click(test,billing.link_PaymentPlan, test.getTestData("Billing.PaymentPlan"));
        test.webFunctions().type(test,billing.textBox_CardHolderFirstName_Elephant, test.getTestData("Billing.CardHolderFirstName"));
        test.webFunctions().type(test,billing.textBox_CardHolderLastName_Elephant, test.getTestData("Billing.CardHolderLastName"));
        test.webFunctions().type(test,billing.textBox_CardNumber_Elephant, test.getTestData("Billing.CardNo"));
        test.webFunctions().click(test,billing.dropDown_CreditCardExpiryMonth_Elephant);
        test.webFunctions().click(test,billing.dropDownCreditCardExpiryMonth_Select_Elephant);
        test.webFunctions().click(test,billing.dropDown_CreditCardExpiryYear_Elephant);
        test.webFunctions().click(test,billing.dropDownCreditCardExpiryYear_Select_Elephant);    
        test.webFunctions().click(test,billing.btn_UseTheSameCard_Elephant);
        test.webFunctions().click(test,billing.btn_receiveTextMessage);
        test.webFunctions().click(test,billing.btn_Purchase);
        test.getLogger().info("Billing page: Success!");
    }
}
