package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YouAreCovered {

	
	@FindBy(how= How.XPATH,using="//*[@id=\"congratulations-info\"]/div[1]/div[1]/div[1]/div[2]")
    public WebElement text_policyNo;

    @FindBy(how= How.XPATH,using="//*[@id=\"btnActivateAccount\"]")
    public WebElement btn_ActivateYourAccount;


}
