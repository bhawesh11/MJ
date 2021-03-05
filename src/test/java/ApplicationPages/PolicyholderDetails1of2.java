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
	
	@FindBy(xpath="//div/legend[contains(text(),'What is your highest education completed?')]")
	public WebElement text_EducationCompleted;
	
	//public String btn_CurrentlyEmployed = "//*[@identity='driverEmployment']/div/label[text()='{0}']";
	
	public String btn_CurrentlyEmployed = "//label[text()='{0}']";
	
	@FindBy(xpath="//div/label[contains(text(),'1')]")
	public WebElement radiobutton_Days;
	
	public String btn_DaysYouDrive = "//div/label[contains(text(),'{0}')]";
	
	public String btn_WFHOrAttendClasses = "//div/label[contains(text(),'{0}')]";
	
	public String btn_School="//label[text()='{0}']";
	
	@FindBy(xpath="//div/input[contains(@name,'driverOccupation')]")
	public WebElement textbox_CurrentOccupation;
	
	public String btn_MilitaryBranch = "//div/label[contains(text(),'{0}')]";
	
	@FindBy(xpath="//select[contains(@name,'militaryStatus')]")
	public WebElement dropdown_militaryStatus;
	
	public String dropdown_SelectRank="//select/option[contains(text(),'{0}')]";
	
	public String btn_MoreOption = "//*[@identity='driverEmploymentMore']/div/label[text()='{0}']";
		
	public String btn_Branch="//*[@identity='militaryBranch']/div/label[text()='{0}']";
					
			
	@FindBy(id="driverOccupation")
	public WebElement textBox_Occupation;
	
	@FindBy(id="btnNext")
	public WebElement btn_Continue;
	
	@FindBy(xpath="//label[contains(@for,'InSchoolYes')]")
	public WebElement btn_InSchoolYes;
	
	@FindBy(xpath="//label[contains(@for,'goodStudentYes')]")
	public WebElement btn_GoodStudentYes;
	
	@FindBy(xpath="//label[contains(@for,'awayAtSchoolYes')]")
	public WebElement btn_AwayAtSchool;
	
	@FindBy(id="btnContinue")
	public WebElement btn_StudenContinue;
			
	
}
