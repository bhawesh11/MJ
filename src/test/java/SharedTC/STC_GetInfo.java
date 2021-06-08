package SharedTC;

import ApplicationPages.GetInfo;
import resources.BrowserFactory;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class STC_GetInfo {

    //For Getting the Policy Number
    public  void GetPolicyNumber(Testing test)
    {
        test.setPage(GetInfo.class);
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, test.getPage());
        String PolicyNo = test.webFunctions().readInfo(test,getInfo.PolicyNumber);
        test.getLogger().info("Policy Number :"+ PolicyNo );
        
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
        String DUIMsg = test.webFunctions().readInfo(test,getInfo.DUIMessage);
        System.out.println("-------------"+ DUIMsg +"=====================");

    }
    
    public void GetPhSuspendedLicenseMessage(Testing test)
    {
        test.setPage(GetInfo.class);
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, test.getPage());
        String SuspendedLicenseMsg = test.webFunctions().readInfo(test,getInfo.message_PHSuspendedLicense);
        System.out.println("-------------"+ SuspendedLicenseMsg +"=====================");

    }

    public void GetBrandedVinMessage(Testing test)
    {
        test.setPage(GetInfo.class);
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, test.getPage());
        String BrandedVinMsg = test.webFunctions().readInfo(test,getInfo.message_BrandedVin);
        System.out.println("-------------"+ BrandedVinMsg +"=====================");

    }

    public void GetTerminationMessage(Testing test)
    {
        test.setPage(GetInfo.class);
        GetInfo getInfo = (GetInfo) PageFactory.initElements(test.driver, test.getPage());
        String ActivePolicymsg = test.webFunctions().readInfo(test,getInfo.message_TerminationMessage);
        System.out.println("-------------"+ ActivePolicymsg +"=====================");

    }
}
