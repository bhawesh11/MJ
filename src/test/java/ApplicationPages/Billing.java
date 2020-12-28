package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class Billing {

//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

	public String link_PaymentPlan = "//*[@class='payment-options']/div/label/div/p[contains(text(),'{0}')]";
    // {0} = Payment Plan Name
	
    @FindBy(how=How.XPATH,using="//*[@id='billingCardholderFirstname']")
    public WebElement textbox_CreditCardFirstName;

    @FindBy(how=How.XPATH,using="//*[@id='billingCardholderLastname']")
    public WebElement textbox_CreditCardLastName;

    @FindBy(how=How.XPATH,using="//*[@id='billingCardNumber']")
    public WebElement textbox_CreditCardNo;
    
    @FindBy(how=How.XPATH,using="//*[@id='expiryMonth']")
    public WebElement dropdownCreditCardExpiryMonth;
    
    @FindBy(how=How.XPATH,using="//*[@id='expiryMonth']/option[11]")
    public WebElement dropdownCreditCardExpiryMonth_Select;
        
    @FindBy(how=How.XPATH,using="//*[@id='expiryYear']")
    public WebElement dropdownCreditCardExpiryYear;
    
    @FindBy(how=How.XPATH,using="//*[@id='expiryYear']/option[11]")
    public WebElement dropdownCreditCardExpiryYear_Select;
     
    @FindBy(how=How.XPATH,using="//*[text()='Use the same card as above']")
    public WebElement btn_sameCardasAbove;
    
    @FindBy(how=How.XPATH,using="//*[@identity='allowTextMessage']/div/label[contains(text(),'Yes')]")
    public WebElement btn_receiveTextMessage;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"addressEdit\"]")
    public WebElement btn_editAddress;

    @FindBy(how=How.XPATH,using="//*[@id='phone']")
    public WebElement textbox_phoneno;

    @FindBy(how=How.XPATH,using="//*[@id='btnContinue']")
    public WebElement btn_Purchase;

}
