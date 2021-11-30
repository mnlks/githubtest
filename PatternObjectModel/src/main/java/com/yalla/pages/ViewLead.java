package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class ViewLead extends Annotations {
	
	public ViewLead() {
		PageFactory.initElements(driver, this); 
	}
	
	
	public EditLead clickedit() {
		WebElement edit = locateElement("link", "Edit");
		click(edit);
		return new EditLead();
		
	}
	public MyLeads clickdelete() {
		WebElement edit = locateElement("link", "Delete");
		click(edit);
		return new MyLeads();
		
	}
}


