package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DriverInfo1of2 {

    @FindBy(id="customerFname")
    public WebElement textBox_FirstName;

    @FindBy(id="customerLname")
    public WebElement textBox_LastName;

    @FindBy(id="customerDob")
    public WebElement textBox_DOB;

    public String btn_Gender="//*[@identity='genderOption']/div/label[contains(text(),'{0}')]";

    public String btn_Relationship="//*[@identity='driverRelationship']/div/label[contains(text(),'{0}')]";

    public String btn_MaritalStatus = "//*[@identity='customerMaritalStatus']/div/label[text()='{0}']";
    
	@FindBy(xpath="//label[contains(@for,'InSchoolYes')]") 
	public WebElement btn_CurrentlyInSchool;
	
	@FindBy(xpath="//label[contains(@for,'goodStudentYes')]") 
	public WebElement btn_GoodStudent;
	
	@FindBy(xpath="//label[contains(@for,'awayAtSchoolYes')]")
    public WebElement btn_AwayAtSchool;
	
	@FindBy(xpath="//*[@id=\"btnContinue\"]")
    public WebElement btn_Continue;


}
