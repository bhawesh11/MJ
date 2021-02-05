package SharedTC;

import ApplicationPages.PolicyholderDetails1of2;
import resources.BrowserFactory;
import resources.TestData;
import resources.Testing;
import resources.WebFunctions;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SharedTestCases_PolicyHolderDetails1of2 {

    //	POLICYHOLDER-DETAILS-1
    public void policyHolderDetails1of2(Testing test) {
        test.setPage(PolicyholderDetails1of2.class);
        PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, test.getPage());
        test.webFunctions().staticWait(3000);
        test.webFunctions().click(test,policyholderDetails1of2.btn_Gender, test.getTestData("PolicyholderDetails.Gender"));
        test.webFunctions().click(test,policyholderDetails1of2.btn_MaritalStatus,test.getTestData("PolicyholderDetails.MaritalStatus"));
        try {
        if(policyholderDetails1of2.text_EducationCompleted.isDisplayed()==true)
        {
        	test.webFunctions().click(test,policyholderDetails1of2.btn_Education,test.getTestData("PolicyholderDetails.Education"));
            test.webFunctions().click(test,policyholderDetails1of2.btn_CurrentlyEmployed,test.getTestData("PolicyholderDetails.Employment"));
        }}
        catch (Exception e) {
			// TODO: handle exception
		}
        wfhDriveToWork(test);
        test.webFunctions().click(test,policyholderDetails1of2.btn_Continue);
        test.getLogger().info("Policy holder Details 1of2 page: Success!");
    }

    // -------------------------------------------------------------------------------------------
    
   /* public void currentlyEmployed(Testing test) {
    	 test.setPage(PolicyholderDetails1of2.class);
         PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, test.getPage());
         test.webFunctions().click(test,policyholderDetails1of2.btn_CurrentlyEmployed,test.getTestData("PolicyholderDetails.Employment"));
         test.webFunctions().staticWait(3000);
         try {
        	 if(policyholderDetails1of2.radiobutton_Days.isDisplayed()==true)
        	 {
        		 test.webFunctions().click(test,policyholderDetails1of2.btn_DaysYouDrive,test.getTestData("PolicyholderDetails.DaysYouDriveToWork"));
        		 test.webFunctions().click(test,policyholderDetails1of2.btn_WFHOrAttendClasses,test.getTestData("PolicyholderDetails.WFH"));
        		 
        		 try {
        		 if(policyholderDetails1of2.textbox_CurrentOccupation.isDisplayed()==true) 
        		 {
        			 test.webFunctions().staticWait(2000);
        			 test.webFunctions().dropdownMelissaJS(test,policyholderDetails1of2.textbox_CurrentOccupation,test.getTestData("PolicyholderDetails.CurrentOccupation"));
        		 }	
        		 }catch (Exception e) {}
  
        		 try {
        			 if(policyholderDetails1of2.btn_Army.isDisplayed()==true) {
        				 System.out.println("Hi There");
        				 test.webFunctions().click(test,policyholderDetails1of2.btn_MilitaryBranch_School,test.getTestData("PolicyholderDetails.MilitaryBranch/School"));
            			 test.webFunctions().staticWait(2000);
            			 test.webFunctions().click(test,policyholderDetails1of2.dropdown_militaryStatus);
            			 test.webFunctions().staticWait(2000);
            			 test.webFunctions().click(test,policyholderDetails1of2.dropdown_SelectRank,test.getTestData("PolicyholderDetails.Rank"));
        			 }
        		 }catch (Exception e) {}
        	 }
        		 
         }catch (Exception e) {}
         test.webFunctions().click(test,policyholderDetails1of2.btn_MilitaryBranch_School,test.getTestData("PolicyholderDetails.MilitaryBranch/School"));
         
         
    } */
    
    //**Only For GA State**
    public void wfhDriveToWork(Testing test)
    {
     test.setPage(PolicyholderDetails1of2.class);
     PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, test.getPage());
    	try {
       	 if(policyholderDetails1of2.radiobutton_Days.isDisplayed()==true)
       	 {
       		 test.webFunctions().click(test,policyholderDetails1of2.btn_DaysYouDrive,test.getTestData("PolicyholderDetails.DaysYouDriveToWork"));
       		 test.webFunctions().click(test,policyholderDetails1of2.btn_WFHOrAttendClasses,test.getTestData("PolicyholderDetails.WFH"));
       		 test.webFunctions().click(test,policyholderDetails1of2.btn_InSchool,test.getTestData("PolicyholderDetails.InSchool"));
       	 }
    }catch (Exception e) {}
    }
}
