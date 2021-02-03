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

}
