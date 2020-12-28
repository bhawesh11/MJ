package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InsuranceHistory {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
	
	public String btn_CurrentlyInsured = "//*[@identity='rdCurrentlyInsured']/div/div/label[contains(text(),'{0}')]";

	@FindBy(how=How.XPATH,using="//*[@id='insuranceProvider']")
	public WebElement dropdownInsuranceProvider;
	
	public String dropdownInsuranceProvider_Select = "//*[@id='insuranceProvider']/option[contains(text(),'{0}')]";

	@FindBy(how=How.XPATH,using="//*[@id='currentinsuranceyear']")
	public WebElement dropdownYearsWithCurrentInsuranceProvider;
	
	public String dropdownYearsWithCurrentInsuranceProvider_Select = "//*[@id='currentinsuranceyear']/option[contains(text(),'{0}')]";

	@FindBy(how=How.XPATH,using="//*[@id='bodilyinjurylimits']")
	public WebElement dropdownBILimit;

	public String dropdownBILimit_Select = "//*[@id='bodilyinjurylimits']/option[contains(text(),'{0}')]";
	
	@FindBy(how=How.XPATH,using="//*[@id='previousLapse']")
	public WebElement dropdownUninsured;
	
	public String dropdownUninsured_Select = "//*[@id='previousLapse']/option[contains(text(),'{0}')]";

	@FindBy(how=How.ID,using="driverInsuranceReason")
	public WebElement dropdownReason;
	
	public String dropdownReason_Select = "//*[@id='driverInsuranceReason']/option[contains(text(),'{0}')]";
	
	@FindBy(how=How.ID,using="btnNext")
	public WebElement btn_Next;
	
}
