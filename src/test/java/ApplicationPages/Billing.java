package ApplicationPages;

 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 
public class Billing {
 
//    LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

	public String link_PaymentPlan = "//*[@class='payment-options']/div/label/div/p[contains(text(),'{0}')]";
    // {0} = Payment Plan Name
    
    @FindBy(id="bindCardbillingCardholderFirstname")
    public WebElement textBox_CardHolderFirstName_Elephant;

    @FindBy(id="bindCardbillingCardholderLastname")
    public WebElement textBox_CardHolderLastName_Elephant;

    @FindBy(id="bindCardbillingCardNumber")
    public WebElement textBox_CardNumber_Elephant;

    @FindBy(id="bindCardexpiryMonth")
    public WebElement dropDown_CreditCardExpiryMonth_Elephant;
    
    @FindBy(xpath="//*[@id='bindCardexpiryMonth']/option[11]")
    public WebElement dropDownCreditCardExpiryMonth_Select_Elephant;
    
    @FindBy(id="bindCardexpiryYear")
    public WebElement dropDown_CreditCardExpiryYear_Elephant;
    
    @FindBy(xpath="//*[@id='bindCardexpiryYear']/option[11]")
    public WebElement dropDownCreditCardExpiryYear_Select_Elephant;

    @FindBy(id="addressEdit")
    public WebElement btn_editAddress;

    @FindBy(xpath="//*[@id='achOption1']//following-sibling::label")
    public WebElement btn_UseTheSameCard_Elephant;
    
    @FindBy(id="phone")
    public WebElement textBox_Phoneno;
    
    @FindBy(id="allowTextMessage{0}")
    public WebElement btn_allowtextmessage;

    @FindBy(id="btnContinue")
    public WebElement btn_Purchase;
    
    @FindBy(id="billingCardholderFirstname")
    public WebElement textBox_CreditCardFirstName;

    @FindBy(id="billingCardholderLastname")
    public WebElement textBox_CreditCardLastName;

    @FindBy(id="billingCardNumber")
    public WebElement textBox_CreditCardNo;
    
    @FindBy(id="expiryMonth")
    public WebElement dropdownCreditCardExpiryMonth;
    
    @FindBy(xpath="//*[@id='expiryMonth']/option[11]")
    public WebElement dropdownCreditCardExpiryMonth_Select;
        
    @FindBy(id="expiryYear")
    public WebElement dropdownCreditCardExpiryYear;
    
    @FindBy(xpath="//*[@id='expiryYear']/option[11]")
    public WebElement dropdownCreditCardExpiryYear_Select;
     
    @FindBy(xpath="//*[text()='Use the same card as above']")
    public WebElement btn_sameCardasAbove;
    
    @FindBy(xpath="//*[@identity='allowTextMessage']/div/label[contains(text(),'Yes')]")
    public WebElement btn_receiveTextMessage;

    @FindBy(xpath="//div[@class='sms']//p[1]/small")
    public WebElement Purchase_Disclaimer;
    @FindBy(xpath="//div[@class='sms']//p[2]/small")
    public WebElement Messages_Disclaimer;
    @FindBy(xpath="//div[@class='disclaimer']/p[1]/small")
    public WebElement Esignature_Disclaimer;
    @FindBy(xpath="//div[@class='disclaimer']/p[2]/small")
    public WebElement Redpoint_County_Disclaimer;
    @FindBy(xpath="//div[@class='disclaimer']/p[3]/small")
    public WebElement DebitAmount_Disclaimer;


}