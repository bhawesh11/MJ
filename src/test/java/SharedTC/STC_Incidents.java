package SharedTC;

import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import ApplicationPages.Incidents;

public class STC_Incidents {

  
    public void incident_PolicyHolder(Testing test)
    {
    	test.setPage(Incidents.class);
        Incidents incidents = (Incidents) PageFactory.initElements(test.driver, test.getPage());
       
    	if(test.getTestData("Policyholder-details-2.IncidentHistory").equalsIgnoreCase("Yes"))
    	{
    		int incident_count = Integer.parseInt(test.getTestData("Policyholder-details-2.IncidentCount"));
        	
    		for(int count=1 ; count<=incident_count ; count++)
    		{
    			test.webFunctions().dropdown(test, incidents.dropdown_WhatHappened, test.getTestData("Policyholder-details-2.Incidents.Incident"+ count +".Type"));
    			test.webFunctions().type(test, incidents.textBox_IncidentDate, test.getTestData("Policyholder-details-2.Incidents.Incident"+ count +".Date"));
    		
    			if(count==incident_count)
    			{
    				test.webFunctions().click(test,incidents.btn_Next);
    				test.getLogger().info("Incident added Successfully !");
    				break;
    	    		    				
    			}
    			else {
    				
    				test.webFunctions().click(test,incidents.btn_AddAnotherIncident);
    			}
    			
    		}
    		}
    	else
    	{
    		test.getLogger().info("No Incident added!");
    	}
    }
    
    
    public void incident_Spouse(Testing test)
    {
    	test.setPage(Incidents.class);
        Incidents incidents = (Incidents) PageFactory.initElements(test.driver, test.getPage());
       
    	int incident_count = Integer.parseInt(test.getTestData("Spouse.IncidentCount"));
    	if(test.getTestData("Spouse.IncidentHistory").equalsIgnoreCase("Yes"))
    	{
    		for(int count=1 ; count<=incident_count ; count++)
    		{
    			test.webFunctions().dropdown(test, incidents.dropdown_WhatHappened, test.getTestData("Spouse.Incidents.Incident"+ count +".Type"));
    			test.webFunctions().type(test, incidents.textBox_IncidentDate, test.getTestData("Spouse.Incidents.Incident"+ count +".Date"));
    		
    			if(count==incident_count)
    			{
    				test.webFunctions().click(test,incidents.btn_Next);
    				test.getLogger().info("Incident added Successfully !");
    				break;
    	    		    				
    			}
    			else {
    				
    				test.webFunctions().click(test,incidents.btn_AddAnotherIncident);
    			}
    			
    		}
    		}
    	else
    	{
    		test.getLogger().info("No Incident added!");
    	}
    }
   
    
    public void incident_Driver(Testing test, int driverno)
    {
    	test.setPage(Incidents.class);
        Incidents incidents = (Incidents) PageFactory.initElements(test.driver, test.getPage());
       
    	
    	if(test.getTestData("Driver.D" + driverno + ".IncidentHistory").equalsIgnoreCase("Yes"))
    	{
    		int incident_count = Integer.parseInt(test.getTestData("Driver.D" + driverno + ".IncidentCount"));
    		for(int count=1 ; count<=incident_count ; count++)
    		{
    			test.webFunctions().dropdown(test, incidents.dropdown_WhatHappened, test.getTestData("Driver.D1.Incidents.Incident"+ count +".Type"));
    			test.webFunctions().type(test, incidents.textBox_IncidentDate, test.getTestData("Driver.D1.Incidents.Incident"+ count +".Date"));
    		
    			if(count==incident_count)
    			{
    				test.webFunctions().click(test,incidents.btn_Next);
    				test.getLogger().info("Incident added Successfully !");
    				break;
    	    		    				
    			}
    			else {
    				
    				test.webFunctions().click(test,incidents.btn_AddAnotherIncident);
    			}
    			
    		}
    		}
    	else
    	{
    		test.getLogger().info("No Incident added!");
    	}
    }
    
    
}
