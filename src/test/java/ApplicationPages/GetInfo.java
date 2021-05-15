package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetInfo {

    //Suspended License text
    @FindBy(xpath="//*[@class='large black mt6 text-jstify']")
    public WebElement SuspendedLicenseText;

    //PolicyNumber
    @FindBy(xpath="//*[@class='h5 success-message__details__policy-info__policy ng-binding']")
    public WebElement PolicyNumber;

    @FindBy(xpath="//*[@id='quote-termination']/div[1]/div/div/h3/following::div[1] /div")
    public WebElement DUIMessage;;

    @FindBy(xpath="//*[@class='heading darkblue']")
    public WebElement message_TerminationTitle;

    @FindBy(xpath="//*[@id='quote-termination']/div[1]/div/div")
    public WebElement message_TerminationMessage;
    
    @FindBy(xpath="//*[@id=\"quote-termination\"]/div[1]/div/div/div[2]")
    public WebElement message_PHSuspendedLicense;

    @FindBy(xpath="//*[@id=\"quote-termination\"]/div[1]/div/div/div")
    public WebElement message_BrandedVin;
}

