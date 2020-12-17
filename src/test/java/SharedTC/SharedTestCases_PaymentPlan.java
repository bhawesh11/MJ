package SharedTC;

import ApplicationPages.PaymentPlan;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PaymentPlan {

    
    

    public void paymentPlan(Testing test) {
        test.setPage(PaymentPlan.class);
        PaymentPlan paymentPlan = (PaymentPlan) PageFactory.initElements(test.driver, test.getPage());
        try{Thread.sleep(15000);}catch(Exception e){};
        test.webFunctions().click(test,paymentPlan.link_PaymentPlan, test.getTestData("PaymentPlan.PaymentPlan"));
        test.webFunctions().click(test,paymentPlan.btn_Next);
        test.getLogger().info("PaymentPlan page: Success!");
    }

}
