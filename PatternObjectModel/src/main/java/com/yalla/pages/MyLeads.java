package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class MyLeads extends Annotations {
	
	public MyLeads() {
		PageFactory.initElements(driver, this); 
	}
	
	
	public CreateLead clickcreate() {
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		return new CreateLead();
		
		
	}
	
	public MyLeads clickLeadid() {
		WebElement Mylead = locateElement("Link", "My Leads");
		click(Mylead);
		return this;
		
			}
	
	public mergeLeads clickMerge() {
		WebElement Mylead = locateElement("Link", "Merge Leads");
		click(Mylead);
		return new mergeLeads();
		
			}
	
	public ViewLead clickID() {
		
		WebElement leadname = locateElement("xpath","(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])[1]//a");
		click(leadname);
		return new ViewLead();
	}
	
	
}
	
