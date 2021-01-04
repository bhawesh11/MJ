package ApplicationPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Family {

	public String aboutFamily="//*[@identity='familyOption']/div/label[text()='{0}']";
	
	@FindBy(id="btnContinue")
	public WebElement btn_Next;
	
	  @FindBy(xpath = "//label[text()='Just Me today']")
	    public WebElement btn_Family;

	  
}
