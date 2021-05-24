package SharedTC;

import ApplicationPages.Address;
import ApplicationPages.Billing;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public class STC_Billing {

	public void billing_Apparent(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().staticWait(15000);
		selectPaymentPlan(test);
		fillCurrentCardDetails(test);
		if (test.getTestData("Billing.PaymentPlan").equalsIgnoreCase("Pay in Full")) {
			test.getLogger().info("Payment Plan selected is Pay in Full.");
		} else {
			selectFuturePaymentOptionApparent(test);
		}
		selectTextMessageAndBind(test);
	}

	public void billing_GAOH(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().staticWait(15000);
		selectPaymentPlan(test);
		fillCurrentCardDetails(test);
		if (test.getTestData("Billing.PaymentPlan").equalsIgnoreCase("Pay in Full")) {
			test.getLogger().info("Payment Plan selected is Pay in Full.");
		} else {
			selectFuturePaymentOptionGAOH(test);
		}
		selectTextMessageAndBind(test);
	}

	public void billing_Elephant(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().staticWait(15000);
		selectPaymentPlan(test);
		fillCurrentCardDetails(test);
		if (test.getTestData("Billing.PaymentPlan").equalsIgnoreCase("Pay in Full")) {
			test.getLogger().info("Payment Plan selected is Pay in Full.");
		} else {
			selectFuturePaymentOptionElephant(test);
		}
		selectTextMessageAndBind(test);
	}

	public void selectPaymentPlan(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().click(test, billing.link_PaymentPlan, test.getTestData("Billing.PaymentPlan"));

	}

	public void fillCurrentCardDetails(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, billing.textBox_CreditCardFirstName,
				test.getTestData("Billing.CardHolderFirstName"));
		test.webFunctions().type(test, billing.textBox_CreditCardLastName,
				test.getTestData("Billing.CardHolderLastName"));
		test.webFunctions().type(test, billing.textBox_CreditCardNo, test.getTestData("Billing.CardNo"));
		test.webFunctions().dropdown(test, billing.dropDown_CreditCardExpiryMonth_Apparent,
				test.getTestData("Billing.ExpiryMonth"));
		test.webFunctions().dropdown(test, billing.dropDown_CreditCardExpiryYear_Apparent,
				test.getTestData("Billing.ExpiryYear"));
		try {
		if (test.getTestData("Billing.EditCurrentInstrumentAddress").equals("Yes")) 
		{
			editCurrentCardAddress(test);
		}
		}
		catch(Throwable e)
		{
			test.markFailed(e.getMessage());
		}
		
		
	}

	// -------------------------------------------------------

	public void fillFutureCardDetails_Elephant(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, billing.textBox_FutureCardHolderFirstName_Elephant,
				test.getTestData("Billing.FutureCardHolderFirstName"));
		test.webFunctions().type(test, billing.textBox_FutureCardHolderLastName_Elephant,
				test.getTestData("Billing.FutureCardHolderLastName"));
		test.webFunctions().type(test, billing.textBox_FutureCardNumber_Elephant,
				test.getTestData("Billing.FutureCardNo"));
		test.webFunctions().click(test, billing.dropDown_FutureCreditCardExpiryMonth_Elephant);
		test.webFunctions().click(test, billing.Select_FutureCardExpiryMonth_Elephant);
		test.webFunctions().click(test, billing.dropDown_FutureCreditCardExpiryYear_Elephant);
		test.webFunctions().click(test, billing.Select_FutureCardExpiryYear_Elephant);
		test.webFunctions().type(test, billing.textBox_FutureCardHolderNickName_Elephant,
				test.getTestData("Billing.FutureCardNickName"));
		if (test.getTestData("Billing.EditFutureInstrumentAddress").equals("Yes")) {
			editFutureInstrumentAddress(test);
		}
	}

	public void fillFutureACHDetails_Elephant(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, billing.textBox_FutureACHFirstName_Elephant,
				test.getTestData("Billing.FutureACHFirstName"));
		test.webFunctions().type(test, billing.textBox_FutureACHLastName_Elephant,
				test.getTestData("Billing.FutureACHLastName"));
		test.webFunctions().staticWait(2000);
		test.webFunctions().type(test, billing.textBox_FutureACHRoutingNumber_Elephant,
				test.getTestData("Billing.ACHRoutingNumber"));
		test.webFunctions().staticWait(2000);
		test.webFunctions().type(test, billing.textBox_FutureAccountNumber_Elephant,
				test.getTestData("Billing.ACHAccountNumber"));
		test.webFunctions().dropdown(test, billing.dropDown_FutureAccountType_Elephant,
				test.getTestData("Billing.AccountType"));
		if (test.getTestData("Billing.EditFutureInstrumentAddress").equals("Yes")) {
			editFutureInstrumentAddress(test);
		}
	}

	public void fillFutureCardDetails_Apparent(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, billing.textBox_FutureCardHolderFirstName_Apparent,
				test.getTestData("Billing.FutureCardHolderFirstName"));
		test.webFunctions().type(test, billing.textBox_FutureCardHolderLastName_Apparent,
				test.getTestData("Billing.FutureCardHolderLastName"));
		test.webFunctions().type(test, billing.textBox_FutureCardNumber_Apparent,
				test.getTestData("Billing.FutureCardNo"));
		test.webFunctions().click(test, billing.dropDown_FutureCreditCardExpiryMonth_Apparent);
		test.webFunctions().click(test, billing.Select_FutureCardExpiryMonth_Apparent);
		test.webFunctions().click(test, billing.dropDown_FutureCreditCardExpiryYear_Apparent);
		test.webFunctions().click(test, billing.Select_FutureCardExpiryYear_Apparent);
		test.webFunctions().type(test, billing.textBox_FutureCardHolderNickName_Apparent,
				test.getTestData("Billing.FutureCardNickName"));
		if (test.getTestData("Billing.EditFutureInstrumentAddress").equals("Yes")) {
			editFutureInstrumentAddress(test);
		}
	}

	public void fillFutureACHDetails_Apparent(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().type(test, billing.textBox_FutureACHFirstName_Apparent,
				test.getTestData("Billing.FutureACHFirstName"));
		test.webFunctions().type(test, billing.textBox_FutureACHLastName_Apparent,
				test.getTestData("Billing.FutureACHLastName"));
		test.webFunctions().type(test, billing.textBox_FutureACHRoutingNumber_Apparent,
				test.getTestData("Billing.ACHRoutingNumber"));
		test.webFunctions().type(test, billing.textBox_FutureAccountNumber_Apparent,
				test.getTestData("Billing.ACHAccountNumber"));
		test.webFunctions().dropdown(test, billing.dropDown_FutureAccountType_Apparent,
				test.getTestData("Billing.AccountType"));
		if (test.getTestData("Billing.EditFutureInstrumentAddress").equals("Yes")) {
			editFutureInstrumentAddress(test);
		}
	}

	public void selectFuturePaymentOptionElephant(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		if (test.getTestData("Billing.FuturePaymentOption").equals("Another Credit Card")) {
			test.webFunctions().click(test, billing.btn_futurePayOption, "Another Credit Card");
			fillFutureCardDetails_Elephant(test);
		} else if (test.getTestData("Billing.FuturePaymentOption").equals("Use a bank account")) {
			test.webFunctions().click(test, billing.btn_futurePayOption, "Use a bank account");
			fillFutureACHDetails_Elephant(test);
		} else {
			test.webFunctions().click(test, billing.btn_futurePayOption, "Use the same card");
		}

	}

	public void selectFuturePaymentOptionApparent(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		if (test.getTestData("Billing.FuturePaymentOption").equals("Use the same card")) {
			test.webFunctions().click(test, billing.checkboxBox_GAOHUseSameCard);
		} else if (test.getTestData("Billing.FuturePaymentOption").equals("Use a bank account")) {
			test.webFunctions().clickJS(test, billing.checkboxBox_GAOHSelectACH);
			fillFutureACHDetails_Apparent(test);
		} else {
			fillFutureCardDetails_Apparent(test);
		}
	}

	public void selectFuturePaymentOptionGAOH(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		if (test.getTestData("Billing.FuturePaymentOption").equals("Use the same card")) {
			test.webFunctions().click(test, billing.checkboxBox_GAOHUseSameCard);
		} else if (test.getTestData("Billing.FuturePaymentOption").equals("Use a bank account")) {
			test.webFunctions().clickJS(test, billing.checkboxBox_GAOHSelectACH);
			fillFutureACHDetails_Apparent(test);
		} else {
			fillFutureCardDetails_Elephant(test);
		}
	}

	// Method for implementing text message selection and policy bind
	public void selectTextMessageAndBind(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().click(test, billing.btn_textMessages, test.getTestData("Billing.TextMessageStatus"));
		test.webFunctions().click(test, billing.btn_Purchase);
		test.getLogger().info("Billing page: Success!");

	}

	// Method to update address for current card. Same for both Elephant and
	// Apparent
	public void editCurrentCardAddress(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().click(test, billing.btn_EditCardAddress);
		test.webFunctions().type(test, billing.textBox_CurrentCardStreet,
				test.getTestData("Billing.CurrentCardStreetAddress"));
		test.webFunctions().type(test, billing.textBox_CurrentCardApt, test.getTestData("Billing.CurrentCardApt"));
		test.webFunctions().type(test, billing.textBox_CurrentCardCity, test.getTestData("Billing.CurrentCardCity"));
		test.webFunctions().dropdown(test, billing.dropdown_CurrentCardState,
				test.getTestData("Billing.CurrentCardState"));
		test.webFunctions().type(test, billing.textBox_CurrentCardZip, test.getTestData("Billing.CurrentCardZip"));
	}

	// Method to update address for Future Instrument. Same for both Elephant and
	// Apparent
	public void editFutureInstrumentAddress(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().click(test, billing.btn_EditFutureInstrumentAddress);
		test.webFunctions().type(test, billing.textBox_FutureInstrumentStreet,
				test.getTestData("Billing.FutureInstrumentStreetAddress"));
		test.webFunctions().type(test, billing.textBox_FutureInstrumentApt,
				test.getTestData("Billing.FutureInstrumentCardApt"));
		test.webFunctions().type(test, billing.textBox_FutureInstrumentCity,
				test.getTestData("Billing.FutureInstrumentCity"));
		test.webFunctions().click(test, billing.dropdown_FutureInstrumentState);
		test.webFunctions().click(test, billing.Select_FutureInstrumentState);
		test.webFunctions().type(test, billing.textBox_FutureInstrumentZip,
				test.getTestData("Billing.FutureInstrumentZip"));
	}

	public void saveDisclaimerMessage(Testing test) {
		test.setPage(Billing.class);
		Billing billing = (Billing) PageFactory.initElements(test.driver, test.getPage());
		test.setOutput("Purchase_Disclaimer", test.webFunctions().readInfo(test, billing.Purchase_Disclaimer));
		test.setOutput("Messages_Disclaimer", test.webFunctions().readInfo(test, billing.Messages_Disclaimer));
		test.setOutput("Esignature_Disclaimer", test.webFunctions().readInfo(test, billing.Esignature_Disclaimer));
		test.setOutput("Redpoint_County_Disclaimer",
				test.webFunctions().readInfo(test, billing.Redpoint_County_Disclaimer));
		test.setOutput("DebitAmount_Disclaimer", test.webFunctions().readInfo(test, billing.DebitAmount_Disclaimer));
	}

}
