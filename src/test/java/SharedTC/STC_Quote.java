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

public class STC_Quote {

	public void quote(Testing test) {
		test.webFunctions().staticWait(18000);
		test.setPage(Quote.class);
		Quote quote = (Quote) PageFactory.initElements(test.driver, test.getPage());
		
		try {
			if (quote.checkbox_PIPWaiverForm.isDisplayed()) {
				test.webFunctions().staticWait(1000);
				test.webFunctions().clickJS(test, quote.checkbox_PIPWaiverForm);
				test.getLogger().info("PIP waiver form checkbox selected!!!");
			}
		} catch (Exception e) {
		}

		test.webFunctions().click(test, quote.btn_Continue);
		try {
			if (test.getBrandName().equalsIgnoreCase("Apparent")
					&& quote.btn_ContinueWithoutCoveragePOPUP.isDisplayed()) {
				test.webFunctions().staticWait(1000);
				test.webFunctions().click(test, quote.btn_ContinueWithoutCoveragePOPUP);
				test.getLogger().info("Quote Page: Success!");
			}
		} catch (Exception e) {
			test.getLogger().info("Quote Page: Success!");
		}
		// test.getLogger().info("Quote Page: Success!");
	}

	public void setPolicyCoverageValue(Testing test, Quote quote, String coverageName, String coverageValue) {

		test.webFunctions().clickUsingAction(test, quote.slider_PolicyLevelCoverages, coverageName, coverageValue);
	}

	public void editCoverages(Testing test) {
		test.setPage(Quote.class);
		Quote quote = (Quote) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().staticWait(11000);
		try {
			test.webFunctions().clickJS(test, quote.btn_Edit);
		} catch (Exception e) {
		}
		String quoteState = test.getTestData("Coverage.State");

		// Editing Policy level Coverages

		setPolicyCoverageValue(test, quote, "BodilyInjuryLiability", test.getTestData("Coverage.BI"));
		setPolicyCoverageValue(test, quote, "UnderinsuredMotorist-BodilyInjury", test.getTestData("Coverage.UMBI"));
		setPolicyCoverageValue(test, quote, "PropertyDamageLiability", test.getTestData("Coverage.PD"));
		setPolicyCoverageValue(test, quote, "UnderinsuredMotorist-PropertyDamage", test.getTestData("Coverage.UMPD"));

		if (quoteState.equalsIgnoreCase("Texas") || quoteState.equalsIgnoreCase("Maryland")) {
			setPolicyCoverageValue(test, quote, "PIP", test.getTestData("Coverage.PIP"));
		} else {
			setPolicyCoverageValue(test, quote, "MedicalPayments", test.getTestData("Coverage.MedicalPayments"));
		}

		if (quoteState.equalsIgnoreCase("Virginia")) {
			setPolicyCoverageValue(test, quote, "IncomeLoss", test.getTestData("Coverage.IncomeLoss"));
		}

		if (quoteState.equalsIgnoreCase("Maryland")) {
			test.webFunctions().dropdown(test, quote.btn_EUIM, test.getTestData("Coverage.EUIM"));
		}

		if (quoteState.equalsIgnoreCase("Georgia")) {
			// Code for GA Added-On or Reduced Coverage
		}

		// Editing Vehicle level Coverages

		for (int i = 1; i <= test.vehicleCount; i++) {
			test.webFunctions().clickUsingAction(test, quote.slider_Comprehensive,
					test.getTestData("Coverage.V" + i + ".Comprehensive"), String.valueOf(i));
			test.webFunctions().clickUsingAction(test, quote.slider_Collision,
					test.getTestData("Coverage.V" + i + ".Collision"), String.valueOf(i));
			try {
				if(test.getBrandName().equalsIgnoreCase("Elephant"))
				{
					test.webFunctions().clickUsingAction(test, quote.slider_Rental,
							test.getTestData("Coverage.V" + i + ".Rental"), String.valueOf(i));
				}
				else
				{
					test.webFunctions().clickUsingAction(test, quote.slider_RentalApparent,
							test.getTestData("Coverage.V" + i + ".Rental"), String.valueOf(i));
				}
			}
			catch(Exception e)
			{
				//TODO : 
			}

			if (test.getTestData("Coverage.V" + i + ".RoadsideAssistance").equalsIgnoreCase("Yes")) {
				test.webFunctions().clickUsingAction(test, quote.checkbox_RoadsideAssistance, String.valueOf(i));
			}

		}

		// Editing Special Coverages

		if (test.getTestData("Coverage.LegalAssistance").equalsIgnoreCase("Yes")) {
			test.webFunctions().clickUsingAction(test, quote.checkbox_LegalAssistance);
		}
		if (test.getTestData("Coverage.DiminishingDeductible").equalsIgnoreCase("Yes")) {
			test.webFunctions().clickUsingAction(test, quote.checkbox_DiminishingDeductible);
		}
		if (test.getTestData("Coverage.AccidentForgiveness").equalsIgnoreCase("Yes")) {
			test.webFunctions().clickUsingAction(test, quote.checkbox_AccidentForgiveness);
		}

		// Click Update
		test.webFunctions().click(test, quote.btn_Continue);
		test.webFunctions().staticWait(11000);
		// Click Continue
		test.webFunctions().click(test, quote.btn_Continue);

		test.getLogger().info("Quote Page: Success!");
	}
}
