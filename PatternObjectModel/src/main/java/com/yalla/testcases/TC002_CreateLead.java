package com.yalla.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.yalla.pages.LoginPage;
import com.yalla.testng.api.base.Annotations;

public class TC002_CreateLead extends Annotations {
	@BeforeTest
	public void setData() {
		testcaseName = "TC002_CreateLead";
		testcaseDec = "Creating Lead";
		author = "Kalai";
		category = "smoke";
		excelFileName = "TC002";
	} 

	@Test(dataProvider="fetchData") 
	public void CreateLead(String uname, String pwrod, String compName, String firstName,String lastName) {
		new LoginPage()
		.enterUserName(uname)
		.enterPassWord(pwrod)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickcreate()
		.enterCompName(compName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickcreateB();
	}

		
		
		
	}	
		
		
		
		
		
		



