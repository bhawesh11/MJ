package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PolicyholderDetails1of2 {
	
//	LET THE SEQUENCE ALWAYS REMAIN THE SAME AS THEY APPEAR ON THE WEBPAGE.
//	--------------------------------------------------------------------------------------------------
//	GENDER:
	
	public String btn_Gender="//*[@identity='genderOption']/div/label[contains(text(),'{0}')]";
	
	public String btn_MaritalStatus = "//*[@identity='customerMaritalStatus']/div/label[text()='{0}']";
	
	public String btn_Education = "//*[@identity='driverEducationLevel']/div/label[contains(text(),'{0}')]";
	
//	--------------------------------------------------------------------------------------------------
//	EMPLOYMENT:
	
	public String btn_CurrentlyEmployed = "//*[@identity='driverEmployment']/div/label[text()='{0}']";
	
	public String btn_MoreOption = "//*[@identity='driverEmploymentMore']/div/label[text()='{0}']";
		
	public String btn_Branch="//*[@identity='militaryBranch']/div/label[text()='{0}']";
					
	@FindBy(xpath="//*[@identity='militaryBranch']/div/label[text()='{0}']")
	public WebElement dropdown_Rank;
			
	@FindBy(id="driverOccupation")
	public WebElement textBox_Occupation;
	
	@FindBy(id="btnNext")
	public WebElement btn_Continue;
			
    @FindBy(xpath="//*[@identity='driverOccupation']/div/div/ul/li[1]")
    public WebElement Occupation_options;
	   
    @FindBy(xpath="//*[@identity='daysDrive']/div/label[text()='{0}']")
    public WebElement Days_drive;
	   
    @FindBy(xpath="//*[@identity='attendingSchool']/div/label[text()='{0}']")
    public WebElement attending_School;
	           
    @FindBy(xpath="//*[@identity='wfh']/div/label[text()='{0}']")
    public WebElement WFH;
	
}
