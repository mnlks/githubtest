package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class MyhomePage extends Annotations {
	

	public MyhomePage() {
		PageFactory.initElements(driver, this); 
	}

	public MyLeads clickLeads() {
		WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);  
		return new MyLeads();

}
}
