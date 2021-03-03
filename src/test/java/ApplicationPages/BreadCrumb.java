package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BreadCrumb {
	
    @FindBy(xpath="//*[@class='progress-nav']/ul/li[2]")
    public WebElement btn_BreadCrumb_Vehicles;
    
    @FindBy(xpath="//*[@class='progress-nav']/ul/li[3]")
    public WebElement btn_BreadCrumb_Drivers;

    @FindBy(xpath="//*[@class='progress-nav']/ul/li[4]")
    public WebElement btn_BreadCrumb_Quote;

}
