package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouAreCovered {

	
	@FindBy(xpath="//*[@id=\"congratulations-info\"]/div[1]/div[1]/div[1]/div[2]")
    public WebElement text_policyNo;

    @FindBy(xpath="//*[@id=\"btnActivateAccount\"]")
    public WebElement btn_ActivateYourAccount;


}
