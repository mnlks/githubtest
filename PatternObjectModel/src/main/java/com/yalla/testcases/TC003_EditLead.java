package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC003_EditLead extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_EditLead";
		testcaseDec = "Editing Lead";
		author = "Kalai";
		category = "smoke";
		excelFileName = "TC003";
	} 

	@Test(dataProvider="fetchData") 
	public void EditLead(String uname, String pwrod, String compName, String firstName) {
		new LoginPage()
		.enterUserName(uname)
		.enterPassWord(pwrod)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickLeadid()
		.clickID()
		.clickedit()
		.enterCompName(compName)
		.enterfirstNameE(firstName)
		.updateB();
		
		
	}		
		
		
		


}
