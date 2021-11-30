package com.yalla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.yalla.testng.api.base.Annotations;

public class EditLead extends Annotations {
	public EditLead() {
		PageFactory.initElements(driver, this); 
	}
	
	public EditLead enterCompName(String data) {
		WebElement compname = locateElement("xpath", "//input[@class='inputBox' and @name='companyName']");
		clear(compname);
        compname.sendKeys(data);
       return this;
	}
	public EditLead  enterfirstNameE(String data) {
		WebElement compname = locateElement("xpath", "(//input[@id='updateLeadForm_firstName' ])[1]");
		clear(compname);
        compname.sendKeys(data);
        return this;
	}
	
       public ViewLead updateB() {
       WebElement update = locateElement("xpath", "(//input[@class='smallSubmit' and @name='submitButton'])[1]");
		click(update);
		return new ViewLead();
		
	}
	
	

}
