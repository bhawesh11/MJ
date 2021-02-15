package SharedTC;


import ApplicationPages.VehicleList;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import resources.TestData;

public class STC_VehicleList  {

    
       //	VEHICLE LIST
    public void vehicleList(Testing test)
    {
        test.setPage(VehicleList.class);
        VehicleList vehicleList = (VehicleList) PageFactory.initElements(test.driver, test.getPage());

        test.webFunctions().click(test,vehicleList.btn_Next);
        test.getLogger().info("VehicleList page: Success!");
    }

 }
