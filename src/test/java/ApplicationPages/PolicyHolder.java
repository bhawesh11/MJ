package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PolicyHolder {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(id="customerDob")
	public WebElement textBox_DOB;
	
	@FindBy(id="customerFname")
	public WebElement textBox_FirstName;
	
	@FindBy(id="customerLname")
	public WebElement textBox_LastName;
	
	@FindBy(id="btnNext")
	public WebElement btn_Next;
}
