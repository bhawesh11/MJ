package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Spouse1of2 {

    @FindBy(id="customerFname")
    public WebElement textBox_FirstName;

    @FindBy(id="customerLname")
    public WebElement textBox_LastName;

    @FindBy(id="customerDob")
    public WebElement textBox_DOB;

    public String btn_Gender="//*[@identity='genderOption']/div/label[contains(text(),'{0}')]";

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

    @FindBy(id="btnContinue")
    public WebElement btn_Continue;

}
