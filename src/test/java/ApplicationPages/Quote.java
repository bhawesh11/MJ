package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Quote {

//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(xpath="//*[@id='step-quote']/div[2]/div[2]/div[1]/span[2]")
	public WebElement text_QuoteValue;

	@FindBy(id="btnContinueQuote")
	public WebElement btn_Continue;

	@FindBy(xpath="//*[@id='btnContinueWithoutCoverage']")
	public WebElement btn_ContinueWithoutCoveragePOPUP;
	
	@FindBy(xpath="//input[@id='pipWaiverSelected']/following-sibling::label[1]")
	public WebElement checkbox_PIPWaiverForm;
		
	@FindBy(xpath="(//span[text()='Edit'])[1]")
	public WebElement btn_Edit;
	
	//----------Coverages-----------------------------------------------------
	
	public String slider_PolicyLevelCoverages = "//input[contains(@id,'{0}')]/ancestor::div[1]//ul[@id='rz-ticks']//span[contains(text(),'{1}')]/ancestor::li[1]" ;
		
	@FindBy(id="policyCoverageEUIM")		//EUIM Value can be set to Accept or Decline
	public WebElement btn_EUIM;

	public String slider_Comprehensive = "(//input[contains(@id,'vehicleCoverageItemOtherThanCollision(Comprehensive)')]/ancestor::div[1]//ul[@id='rz-ticks']//span[contains(text(),'{0}')]/ancestor::li[1])['{1}']" ;
	
	public String slider_Collision = "(//input[contains(@id,'vehicleCoverageItemCollision')]/ancestor::div[1]//ul[@id='rz-ticks']//span[contains(text(),'{0}')]/ancestor::li[1])['{1}']" ;
	
	public String slider_Rental = "(//input[contains(@id,'vehicleCoverageItemRentalReimbursement')]/ancestor::div[1]//ul[@id='rz-ticks']//span[contains(text(),'{0}')]/ancestor::li[1])['{1}']" ;
	
	public String slider_Custom = "(//input[contains(@id,'vehicleCoverageItemCustomEquipmentCoverage')]/ancestor::div[1]//ul[@id='rz-ticks']//span[contains(text(),'{0}')]/ancestor::li[1])['{1}']" ;
	
	public String checkbox_RoadsideAssistance = "(//label[@for='Smart Roadside Assistance'])['{0}']" ;
	
	//---------------------------Special Features-----------------------------------------------
	
	@FindBy(xpath="//label[contains(@for,'Legal Assistance')]")
	public WebElement checkbox_LegalAssistance;
	
	@FindBy(xpath="//label[contains(@for,'Diminishing Deductible')]")
	public WebElement checkbox_DiminishingDeductible;
	
	@FindBy(xpath="//label[contains(@for,'Upgraded Accident Forgiveness')]")
	public WebElement checkbox_AccidentForgiveness;
	
}
