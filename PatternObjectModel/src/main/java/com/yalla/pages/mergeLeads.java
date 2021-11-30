package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class mergeLeads extends Annotations {
	public mergeLeads() {
		PageFactory.initElements(driver, this); 
	}

	public mergeLeads fromLead() {
		WebElement flead = locateElement("xpath", "(//td[@class='titleCell']//following::a)[1]");
		click(flead);
		
		switchToWindow("Find Leads");
		
		WebElement fname = locateElement("xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a");
		clickWithNoSnap(fname);
			
		switchToWindow("Merge Leads | opentaps CRM");
		
		return this;

	}
	
	public mergeLeads toLead() {
		WebElement Tolead = locateElement("xpath", "(//img)[4]");
		clickWithNoSnap(Tolead);
		
		switchToWindow("Find Leads");
		WebElement fname1=locateElement("xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a");
		clickWithNoSnap(fname1);
		
		switchToWindow("Merge Leads | opentaps CRM");
		return new mergeLeads();
	}
	public mergeLeads mergeB() {
		WebElement merge1=locateElement("Link", "Merge");
		clickWithNoSnap(merge1);
		return this;
		
	}
	public mergeLeads acptalert() {
		acceptAlert();
		return this;
		
	}
		//switchToWindow("Merge Leads | opentaps CRM");
		//return new ViewLead();

	}

	

