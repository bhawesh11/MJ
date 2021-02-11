package ApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Incidents {
	
	@FindBy(id="incidentType")
	public WebElement dropdown_WhatHappened;
	
	@FindBy(id="incidentDate")
	public WebElement textBox_IncidentDate;
	
	@FindBy(id="addMore")
	public WebElement btn_AddAnotherIncident;
	
	@FindBy(xpath="//*[@identity='rdDriverIncidents']/div/div/label")
	public WebElement checkbox_OhNoIncidents;
	
	@FindBy(id="btnContinue")
	public WebElement btn_Next;
}
