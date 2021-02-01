package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RetrieveQuote {

    @FindBy(id="//a[@class='postal-code-hero__saved-quote-link ng-scope']")
    public WebElement btn_RetrieveSavedQuote;

    @FindBy(xpath="//*[@id='email']")
    public WebElement text_Email;

    @FindBy(xpath="//*[@id='customerDob']")
    public WebElement text_DOB;

    @FindBy(xpath="//*[@id='customerLname']")
    public WebElement text_LastName;

    @FindBy(id="btnContinue")
    public WebElement btn_RetrieveQuote;

}
