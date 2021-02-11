package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostalCode {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.

	@FindBy(id="customerZip")
	public WebElement textBox_PostalCode;
	
	@FindBy(id="btnPostalCode")
	public WebElement btn_LetsGetStarted;
	  
	@FindBy(xpath="//*[@id='step-postal-code']/div/div/a/span[contains(text(),'Retrieve Saved Quote')]")
	public WebElement btn_RetrieveQuote;

}