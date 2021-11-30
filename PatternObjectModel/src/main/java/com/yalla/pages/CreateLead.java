package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class CreateLead extends Annotations{
	public CreateLead() {
		PageFactory.initElements(driver, this); 
	}
	
	public CreateLead enterCompName(String data) {
		WebElement eleCmpyName = locateElement("id", "createLeadForm_companyName");
		eleCmpyName.sendKeys(data);  
		return this; 
	}

	public CreateLead enterFirstName(String data) {
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		eleFirstName.sendKeys(data);  
		return this; 
	}
	
	public CreateLead enterLastName(String data) {
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		eleLastName.sendKeys(data);  
		return this; 
	}
	public ViewLead clickcreateB() {
		WebElement eleCreateLeadbutton = locateElement("name", "submitButton");
		click(eleCreateLeadbutton);
		return new ViewLead();
}
}
