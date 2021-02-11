package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Children {
	
	@FindBy(xpath="//*[@identity='childrenOption']/div/input[@id='childrenOptionHasLittleOnes']//following-sibling::label")
	public WebElement CheckBox_LittleOnes;
	
	@FindBy(id="childrenOptionHasPreTeens")
	public WebElement CheckBox_Tweens;
	
	@FindBy(id="childrenOptionHasTeens")
	public WebElement CheckBox_Teens;
	
	@FindBy(id="childrenOptionHasYoungAdults")
	public WebElement CheckBox_YoungAdults;
	
	@FindBy(id="btnContinue")
	public WebElement btn_Next;
	
}
