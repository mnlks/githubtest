package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC004_DeleteLead extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "TC004_DeleteLead";
		testcaseDec = "Deelting Lead";
		author = "Kalai";
		category = "smoke";
		excelFileName = "TC004";
	} 

	@Test(dataProvider="fetchData") 
	public void DeleteLead(String uname, String pwrod) {
		new LoginPage()
		.enterUserName(uname)
		.enterPassWord(pwrod)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickLeadid()
		.clickID()
		.clickdelete();
		
		
	}		
		
		
		


}
