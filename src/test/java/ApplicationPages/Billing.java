package ApplicationPages;

 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 
public class Billing {
	
//  LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE. 

	public String link_PaymentPlan = "//*[@class='payment-options']/div/label/div/p[contains(text(),'{0}')]";
  // {0} = Payment Plan Name
	
	public String btn_futurePayOption="//*[@identity='achOption']/div/label[text()='{0}']";
	
	public String btn_textMessages="//*[@identity='allowTextMessage']//label[text()='{0}']";
	
	//Locators specific to OH/GA/Apparent 
	 @FindBy(xpath="//*[@identity='isACHSelected']//label")
	    public WebElement checkboxBox_GAOHSelectACH;
	 
	 @FindBy(xpath="//*[@id='sameCard']/following::label[text()='Use the same card as above']")
	    public WebElement checkboxBox_GAOHUseSameCard;
	
	//Current credit card locators for Elephant starts*******************************************************************************************************************
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
    
  //Current credit card locators for Elephant ends*******************************************************************************************************************
  
  //Future credit card locators for Elephant starts*******************************************************************************************************************
  
  @FindBy(id="futureCardbillingCardholderFirstname")
  public WebElement textBox_FutureCardHolderFirstName_Elephant;

  @FindBy(id="futureCardbillingCardholderLastname")
  public WebElement textBox_FutureCardHolderLastName_Elephant;

  @FindBy(id="futureCardbillingCardNumber")
  public WebElement textBox_FutureCardNumber_Elephant;

  @FindBy(id="futureCardexpiryMonth")
  public WebElement dropDown_FutureCreditCardExpiryMonth_Elephant;
  
  @FindBy(id="futureCardexpiryYear")
  public WebElement dropDown_FutureCreditCardExpiryYear_Elephant;
  
  @FindBy(xpath="//*[@id='futureCardexpiryMonth']/option[9]")
  public WebElement Select_FutureCardExpiryMonth_Elephant;
  
  @FindBy(xpath="//*[@id='futureCardexpiryYear']/option[9]")
  public WebElement Select_FutureCardExpiryYear_Elephant;
  
  @FindBy(id="futureCardbillingNewNickName")
  public WebElement textBox_FutureCardHolderNickName_Elephant;
     
  //Future credit card locators for Elephant ends**************************************************************************************************************************
  
  //Future ACH locators for Elephant Starts*********************************************************************************************************************************
  
  @FindBy(id="billingBankFirstname")
  public WebElement textBox_FutureACHFirstName_Elephant;

  @FindBy(id="billingBankLastname")
  public WebElement textBox_FutureACHLastName_Elephant;

  @FindBy(id="billingBankholderRoutingNumber")
  public WebElement textBox_FutureACHRoutingNumber_Elephant;

  @FindBy(id="billingBankholderAccountNumber")
  public WebElement textBox_FutureAccountNumber_Elephant;
  
  @FindBy(id="bankAccountType")
  public WebElement dropDown_FutureAccountType_Elephant;    
      
  //Future ACH locators for Elephant Ends******************************************************************************************************************************************
  
//Current credit card locators for Apparent starts*********************************************************************************************************************************
  @FindBy(id="billingCardholderFirstname")
  public WebElement textBox_CardHolderFirstName_Apparent;

  @FindBy(id="billingCardholderLastname")
  public WebElement textBox_CardHolderLastName_Apparent;

  @FindBy(id="billingCardNumber")
  public WebElement textBox_CardNumber_Apparent;

  @FindBy(id="expiryMonth")
  public WebElement dropDown_CreditCardExpiryMonth_Apparent;
  
  @FindBy(id="expiryYear")
  public WebElement dropDown_CreditCardExpiryYear_Apparent;
    
  //Current credit card locators for Apparent ends************************************************************************************************************************************
  
  //Future credit card locators for Apparent starts***********************************************************************************************************************************
  
  @FindBy(id="newBillingCardholderFirstname")
  public WebElement textBox_FutureCardHolderFirstName_Apparent;

  @FindBy(id="newBillingCardholderLastname")
  public WebElement textBox_FutureCardHolderLastName_Apparent;

  @FindBy(id="billingNewCCNumber")
  public WebElement textBox_FutureCardNumber_Apparent;

  @FindBy(id="newCardExpiryMonth")
  public WebElement dropDown_FutureCreditCardExpiryMonth_Apparent;
  
  @FindBy(xpath="//*[@id='newCardExpiryMonth']/option[9]")
  public WebElement Select_FutureCardExpiryMonth_Apparent;
  
  @FindBy(id="newCardExpiryYear")
  public WebElement dropDown_FutureCreditCardExpiryYear_Apparent;  
  
  @FindBy(xpath="//*[@id='newCardExpiryYear']/option[9]")
  public WebElement Select_FutureCardExpiryYear_Apparent;
  
  @FindBy(id="billingNewNickName")
  public WebElement textBox_FutureCardHolderNickName_Apparent;
     
  //Future credit card locators for Apparent ends**********************************************************************************************************************************************
  
  //Future ACH locators for Apparent Starts*****************************************************************************************************************************************************
  
  @FindBy(id="billingBankFirstname")
  public WebElement textBox_FutureACHFirstName_Apparent;

  @FindBy(id="billingBankLastname")
  public WebElement textBox_FutureACHLastName_Apparent;

  @FindBy(id="billingBankholderRoutingNumber")
  public WebElement textBox_FutureACHRoutingNumber_Apparent;

  @FindBy(id="billingBankholderAccountNumber")
  public WebElement textBox_FutureAccountNumber_Apparent;
  
  @FindBy(id="bankAccountType")
  public WebElement dropDown_FutureAccountType_Apparent;    
      
  //Future ACH locators for Apparent Ends****************************************************************************************************************************************************************
  
  //Current Card Address Locators Starts. Same for Elephant and Apparent ********************************************************************************************************************************
  
  @FindBy(id="addressEdit")
  public WebElement btn_EditCardAddress;  
  
  @FindBy(id="billingStreetUpdate")
  public WebElement textBox_CurrentCardStreet;  
  
  @FindBy(id="billingAptUpdate")
  public WebElement textBox_CurrentCardApt;  
  
  @FindBy(id="billingCityUpdate")
  public WebElement textBox_CurrentCardCity;  
  
  @FindBy(id="billingStateUpdate")
  public WebElement dropdown_CurrentCardState;  
  
  @FindBy(id="billingZipUpdate")
  public WebElement textBox_CurrentCardZip; 
  
  //Current Card Address Locators Ends. Same for Elephant and Apparent ********************************************************************************************************************************************

 //Future ACH/Card Address Locators Starts. Same for Elephant and Apparent.************************************************************************************************************************************************************
  
  @FindBy(xpath="(//h4[text()='Billing address']/ancestor::div//a[text()='Edit'])[2]")
  public WebElement btn_EditFutureInstrumentAddress; 
  
  @FindBy(xpath="(//label[text()='Billing address']/following-sibling::input)[2]")
  public WebElement textBox_FutureInstrumentStreet;  
  
  @FindBy(id="futureBillingAptUpdate")
  public WebElement textBox_FutureInstrumentApt;  
  
  @FindBy(xpath="(//label[text()='City']/following-sibling::input)[2]")
  public WebElement textBox_FutureInstrumentCity;  
  
  @FindBy(id="futureBillingStateUpdate")
  public WebElement dropdown_FutureInstrumentState;  
  
  @FindBy(xpath="//*[@id='futureBillingStateUpdate']/option[46]")
  public WebElement Select_FutureInstrumentState;  
  
  @FindBy(xpath="(//label[text()='Zip']/following-sibling::input)[2]")
  public WebElement textBox_FutureInstrumentZip;     
 
    //Future ACH/Card Address Locators Ends ************************************************************************************************************************************************************
  
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
  
  @FindBy(xpath="//*[@id='achOption1']//following-sibling::label")
  public WebElement btn_UseTheSameCard_Elephant;
    
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