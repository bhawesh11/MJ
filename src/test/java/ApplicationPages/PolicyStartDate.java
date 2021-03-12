package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolicyStartDate {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(id="discountEmail")
	public WebElement textBox_Email;
	
	public String btn_PaperlessDiscount = "//input[@id='rdPaperlessDiscount{0}']/ancestor::div/label";
	public String btn_ESignDiscount = "//input[@id='rdESignatureDiscount{0}']/ancestor::div/label";
	
	@FindBy(id="policyStartDate")
	public WebElement textBox_PolicyStartDate;
	
	@FindBy(id="phone")
	public WebElement textBox_Phone;
	
	@FindBy(xpath="//div[@class='disclaimer']")
	public WebElement Discount_Page_Disclaimer;
	
	@FindBy(id="btnContinue")
	public WebElement btn_SeeMyQuote;
	
	@FindBy(xpath="(//li[contains(text(),'Good Student')])[2]")
	public WebElement icon_GSD;
	
	//------------------------------------------------------------------------------------------------------------------
	  //  X-PATHS FOR VALIDATIONS
		
		@FindBy(xpath="//*[@ng-messages='discountsForm.discountEmail.$error']")
		public WebElement vmsg_email;
		
		@FindBy(xpath="//*[@ng-messages='$ctrl.form.rdPaperlessDiscount.$error']")
		public WebElement vmsg_paperless_discount;
		
		@FindBy(xpath="//*[@ng-messages='discountsForm.policyStartDate.$error']")
		public WebElement vmsg_policy_startdate;
		
		@FindBy(xpath="//*[@ng-messages='$ctrl.form.phone.$error']")
		public WebElement vmsg_phone_number;
	
}
