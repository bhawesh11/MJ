package SharedTC;

import ApplicationPages.GetInfo;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_GetInfo {


    
    

    //For Getting the Policy Number
    public  void GetPolicyNumber(Testing test)
    {
        test.setPage(GetInfo.class);
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, test.getPage());
        String PolicyNo = test.webFunctions().readInfo(test,getInfo.PolicyNumber);
        System.out.println("-------------"+ PolicyNo +"=====================");

    }

    //For Getting the Suspended License status Text
    public void GetLicenseStatus(Testing test)
    {
        test.setPage(GetInfo.class);
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, test.getPage());
        String LicenseTextMsg = test.webFunctions().readInfo(test,getInfo.SuspendedLicenseText);
        System.out.println("-------------"+ LicenseTextMsg +"=====================");

    }

    public void GetDUIMessage(Testing test)
    {
        test.setPage(GetInfo.class);
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, test.getPage());
        String DUIMsg = test.webFunctions().readInfo(test,getInfo.SuspendedLicenseText);
        System.out.println("-------------"+ DUIMsg +"=====================");

    }



}
