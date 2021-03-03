package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Address {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	@FindBy(id="customerAddress")
	public WebElement textBox_Address;
	
	@FindBy(id="customerApt")
	public WebElement textBox_Apartment;
	
	@FindBy(id="customerCounty")
	public WebElement dropdown_County;
	
	@FindBy(id="customerZip")
	public WebElement textBox_Zip;
	
	@FindBy(id="yearSelection_ddl")
	public WebElement MoveInYear;
	
	public String MoveInYear_Select = "//*[@id=\"yearSelection_ddl\"]/option[contains(text(),'{0}')]";
	
	@FindBy(id="monthSelection_ddl")
	public WebElement MoveInMonth;	

	public String MoveInMonth_Select = "//*[@id=\"monthSelection_ddl\"]/option[contains(text(),'{0}')]";
	
	public String btn_ResidenceType="//*[@identity='driverResidenceOwnership']/div/label[contains(text(),'{0}')]";
	
	@FindBy(id="btnNext")
	public WebElement btn_Next;
	
	@FindBy(xpath="//div[@class='disclaimer']/p[1]/small")
	public WebElement Address_Page_Disclaimer;	
	
	@FindBy(xpath="//div[@class='disclaimer']/p[2]//small")
	public WebElement Homesite_Disclaimer;	
	

}
