package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC005_MergeLead extends Annotations{
	@BeforeTest
	public void setData() {
		testcaseName = "TC005_MergeLead";
		testcaseDec = "Merging Lead";
		author = "Kalai";
		category = "smoke";
		excelFileName = "TC005";
	} 

	@Test(dataProvider="fetchData") 
	public void EditLead(String uname, String pwrod) {
		new LoginPage()
		.enterUserName(uname)
		.enterPassWord(pwrod)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickMerge()
		.fromLead()
		.toLead()
		.mergeB();
		
		
		
	}		
		
		
		


}
