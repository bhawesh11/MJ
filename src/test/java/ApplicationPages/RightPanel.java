package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RightPanel {


    @FindBy(xpath="//*[contains(text(),'Add Driver')]")
    public WebElement btn_AddDriver;
    @FindBy(xpath="//*[contains(text(),'Add Vehicle')]")
    public WebElement btn_AddVehicle;
    @FindBy(xpath="//*[contains(text(),'Vehicles')]/i")
    public WebElement btn_RightPanelVehicleExpand;
    @FindBy(xpath="//*[contains(text(),'Drivers')]/i")
    public WebElement btn_RightPanelDriverExpand;


  /*  public String btn_AddDriver ="//*[contains(text(),'Add Driver')]";
    public String btn_AddVehicle ="//*[contains(text(),'Add Vehicle')]";
    //public String btn_Add Driver/Vehicle ="//*[contains(text(),'{0}')]";
    public String btn_Discount ="//div[@class='discounts-content']/ul/li[contains(text(),'{0}')]";
    public String btn_RightPanelVehicleExpand ="//*[contains(text(),'Vehicles')]/i";
    public String btn_RightPanelDriverExpand ="//*[contains(text(),'Drivers')]/i";
    // public String btn_RightPanelVehicle/DriverExpand ="//*[contains(text(),'{0}')]/i";
*/

}
