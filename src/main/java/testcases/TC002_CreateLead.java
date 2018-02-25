package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Creating a lead";
		testNodes="Leads";
		category="Smoke";
		authors="Vini";
		browserName="chrome";
		dataSheetName="TC002_CreateLead";
	}

	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String cName,String fname,String lname) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLead()
		.createLead()
		.input_FName(fname)
		.input_Compname(cName)
		.input_lName(lname)
		.clickCreate()
		.verify(cName);
			
	}
	}

