package SharedTC;

import ApplicationPages.ConfirmVehicle;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_ConfirmVehicle {


    
    

    public void confirmVehicle(Testing test) {
        test.setPage(ConfirmVehicle.class);
        ConfirmVehicle confirmVehicle = (ConfirmVehicle) PageFactory.initElements(test.driver, test.getPage());

        int NoOfVehicle = Integer.parseInt(test.getTestData("Scenario.Vehicle"));
        int j =0;
        do {
            test.webFunctions().click(test,confirmVehicle.btn_Damage,test.getTestData("Vehicle.V1.Model"),test.getTestData("ConfirmVehicle.Damage"));
            test.webFunctions().dropdown(test,confirmVehicle.dropdown_PrimaryGarage,test.getTestData("Vehicle.V1.Model"),test.getTestData("ConfirmVehicle.Parking"));
            test.webFunctions().dropdownMelissaJS(test,confirmVehicle.textBox_LienHolder,test.getTestData("Vehicle.V1.Model").replace(" ", ""),
                    test.getTestData("ConfirmVehicle.Lienholder"));
            test.webFunctions().type(test,confirmVehicle.textBox_VIN,test.getTestData("Vehicle.V1.Model").replace(" ", ""),
                    test.getTestData("ConfirmVehicle.VIN"));
        }
        while(j == NoOfVehicle);
        {
            for(int additionalCar = 2 ; additionalCar <= NoOfVehicle ;additionalCar++) {
               // "SecondVehicle-details."+additionalVehicle+"Year"
                test.webFunctions().click(test,confirmVehicle.btn_Damage, test.getTestData("Vehicle.V"+additionalCar+".Model"), test.getTestData("ConfirmVehicle.Damage"));
                test.webFunctions().dropdown(test,confirmVehicle.dropdown_PrimaryGarage, test.getTestData("Vehicle.V"+additionalCar+".Model"), test.getTestData("ConfirmVehicle.Parking"));
                test.webFunctions().dropdownMelissaJS(test,confirmVehicle.textBox_LienHolder, test.getTestData("Vehicle.V"+additionalCar+".Model").replace(" ", ""),
                        test.getTestData("ConfirmVehicle.Lienholder"));
                test.webFunctions().type(test,confirmVehicle.textBox_VIN, test.getTestData("Vehicle.V"+additionalCar+".Model").replace(" ", ""),
                        test.getTestData("ConfirmVehicle."+additionalCar+"VIN"));
                j++;
            }


        }
        test.webFunctions().click(test,confirmVehicle.btn_Next);
        test.getLogger().info("ConfirmVehicle page: Success!");

    }

}
