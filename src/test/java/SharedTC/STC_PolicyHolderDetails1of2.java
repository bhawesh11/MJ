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

public class STC_PolicyHolderDetails1of2 {

	// POLICYHOLDER-DETAILS-1
	public void policyHolderDetails1of2(Testing test) {
		test.setPage(PolicyholderDetails1of2.class);
		PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, test.getPage());
		test.webFunctions().staticWait(3000);
		test.webFunctions().click(test, policyholderDetails1of2.btn_Gender,test.getTestData("PolicyholderDetails.Gender"));
		test.webFunctions().click(test, policyholderDetails1of2.btn_MaritalStatus,test.getTestData("PolicyholderDetails.MaritalStatus"));
		
		wfhDriveToWork(test);

		try {
			if (policyholderDetails1of2.text_EducationCompleted.isDisplayed() == true) {
				test.webFunctions().click(test, policyholderDetails1of2.btn_Education,test.getTestData("PolicyholderDetails.Education"));
				if (test.getBrandName().equalsIgnoreCase("Elephant")) {
					occupation(test); // Make JSON changes according to your Occupation
				} else
					occupation_Apparent(test);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		test.webFunctions().click(test, policyholderDetails1of2.btn_Continue);
		test.getLogger().info("Policy holder Details 1of2 page: Success!");
	}

	// -------------------------------------------------------------------------------------------

	

	// **Only For GA State**
	public void wfhDriveToWork(Testing test) {
		test.setPage(PolicyholderDetails1of2.class);
		PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, test.getPage());
		try {
			if (policyholderDetails1of2.radiobutton_Days.isDisplayed() == true) {
				test.webFunctions().click(test, policyholderDetails1of2.btn_DaysYouDrive,test.getTestData("PolicyholderDetails.DaysYouDriveToWork"));
				test.webFunctions().click(test, policyholderDetails1of2.btn_WFHOrAttendClasses,test.getTestData("PolicyholderDetails.WFH"));
				test.webFunctions().click(test, policyholderDetails1of2.btn_School,test.getTestData("PolicyholderDetails.School"));
			}
		} catch (Exception e) {
		}
	}

	public void occupation(Testing test) {
		test.setPage(PolicyholderDetails1of2.class);
		PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, test.getPage());
				
		test.webFunctions().click(test, policyholderDetails1of2.btn_CurrentlyEmployed,test.getTestData("PolicyholderDetails.Employment"));
		String employmentSelected= test.getTestData("PolicyholderDetails.Employment");
			
		switch (employmentSelected) {
		case "Employed":
			test.webFunctions().click(test,policyholderDetails1of2.btn_DaysYouDrive,test.getTestData("PolicyholderDetails.DaysYouDriveToWork"));
			test.webFunctions().click(test,policyholderDetails1of2.btn_WFHOrAttendClasses,test.getTestData("PolicyholderDetails.WFH"));
			test.webFunctions().dropdownMelissaJS(test,policyholderDetails1of2.textbox_CurrentOccupation,test.getTestData("PolicyholderDetails.CurrentOccupation"));

		case "SelfEmployed":
			test.webFunctions().click(test,policyholderDetails1of2.btn_DaysYouDrive,test.getTestData("PolicyholderDetails.DaysYouDriveToWork"));
			test.webFunctions().click(test,policyholderDetails1of2.btn_WFHOrAttendClasses,test.getTestData("PolicyholderDetails.WFH"));
			test.webFunctions().dropdownMelissaJS(test,policyholderDetails1of2.textbox_CurrentOccupation,test.getTestData("PolicyholderDetails.CurrentOccupation"));
			break;

		case "Full-Time Student":
			test.webFunctions().click(test,policyholderDetails1of2.btn_DaysYouDrive,test.getTestData("PolicyholderDetails.DaysYouDriveToWork"));
			test.webFunctions().click(test,policyholderDetails1of2.btn_WFHOrAttendClasses,test.getTestData("PolicyholderDetails.AttendOnlineClasses"));
			test.webFunctions().click(test,policyholderDetails1of2.btn_School,test.getTestData("PolicyholderDetails.School"));
			break;
			
		case "Military – Active":
			test.webFunctions().click(test,policyholderDetails1of2.btn_DaysYouDrive,test.getTestData("PolicyholderDetails.DaysYouDriveToWork"));
			test.webFunctions().click(test,policyholderDetails1of2.btn_WFHOrAttendClasses,test.getTestData("PolicyholderDetails.WFH"));
			test.webFunctions().click(test,policyholderDetails1of2.btn_MilitaryBranch,test.getTestData("PolicyholderDetails.MilitaryBranch"));
			test.webFunctions().click(test,policyholderDetails1of2.dropdown_militaryStatus);
			test.webFunctions().staticWait(2000);
			System.out.println(test.getTestData("PolicyholderDetails.Rank"));
			test.webFunctions().click(test,policyholderDetails1of2.dropdown_SelectRank,test.getTestData("PolicyholderDetails.Rank"));
			break;
			
		case "Military – Retired":
			test.webFunctions().click(test,policyholderDetails1of2.btn_MilitaryBranch,test.getTestData("PolicyholderDetails.MilitaryBranch"));
			test.webFunctions().click(test,policyholderDetails1of2.dropdown_militaryStatus);
			test.webFunctions().click(test,policyholderDetails1of2.dropdown_SelectRank,test.getTestData("PolicyholderDetails.Rank"));
			break;
			
		case "Retired":
			test.webFunctions().dropdownMelissaJS(test,policyholderDetails1of2.textbox_CurrentOccupation,test.getTestData("PolicyholderDetails.CurrentOccupation"));
			break;
			
		default:
			break;
		}

	}
	
	public void occupation_Apparent(Testing test) {
		test.setPage(PolicyholderDetails1of2.class);
		PolicyholderDetails1of2 policyholderDetails1of2 = (PolicyholderDetails1of2) PageFactory.initElements(test.driver, test.getPage());
		String employmentSelected= test.getTestData("PolicyholderDetails.Employment");
		if (employmentSelected.equalsIgnoreCase("Disabled")
						|| employmentSelected.equalsIgnoreCase("Military – Active")
						|| employmentSelected.equalsIgnoreCase("Military – Retired")
						|| employmentSelected.equalsIgnoreCase("Not Currently Employed")
						|| employmentSelected.equalsIgnoreCase("Retired"))
		{
			test.webFunctions().click(test, policyholderDetails1of2.btn_CurrentlyEmployed,"More Options");
		}
		test.webFunctions().click(test, policyholderDetails1of2.btn_CurrentlyEmployed,test.getTestData("PolicyholderDetails.Employment"));
			
		switch (employmentSelected) {
		case "Employed":			
			test.webFunctions().dropdownMelissaJS(test,policyholderDetails1of2.textbox_CurrentOccupation,test.getTestData("PolicyholderDetails.CurrentOccupation"));
			break;

		case "SelfEmployed":			
			test.webFunctions().dropdownMelissaJS(test,policyholderDetails1of2.textbox_CurrentOccupation,test.getTestData("PolicyholderDetails.CurrentOccupation"));
			break;

		case "Full-Time Student":		
			test.webFunctions().click(test,policyholderDetails1of2.btn_School,test.getTestData("PolicyholderDetails.School"));
			break;
			
		case "Military – Active":			
			test.webFunctions().click(test,policyholderDetails1of2.btn_MilitaryBranch,test.getTestData("PolicyholderDetails.MilitaryBranch"));
			test.webFunctions().dropdown(test,policyholderDetails1of2.dropdown_militaryStatus,test.getTestData("PolicyholderDetails.Rank"));
			test.webFunctions().staticWait(2000);
			break;
			
		case "Military – Retired":
			test.webFunctions().click(test,policyholderDetails1of2.btn_MilitaryBranch,test.getTestData("PolicyholderDetails.MilitaryBranch"));
			test.webFunctions().click(test,policyholderDetails1of2.dropdown_militaryStatus);
			test.webFunctions().click(test,policyholderDetails1of2.dropdown_SelectRank,test.getTestData("PolicyholderDetails.Rank"));
			break;
			
		case "Retired":
			test.webFunctions().dropdownMelissaJS(test,policyholderDetails1of2.textbox_CurrentOccupation,test.getTestData("PolicyholderDetails.CurrentOccupation"));
			break;
			
		default:
			break;
		}

	}
}
