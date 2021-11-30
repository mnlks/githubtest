package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginsteps {
	ChromeDriver driver;
	
	@Given("open the browser")
	public void openTheBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();    
	}

	@Given("load the url")
	public void loadTheUrl() {
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    
	}

	@Given("enter the username as (.*)")
	public void enterTheUsernameAsDemoSalesManager(String uname) {
		driver.findElementById("username").sendKeys(uname);
	    
	}

	@Given("enter the password as (.*)")
	public void enterThePasswordAsCrmsfa(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		
	}

	@When("click on the login button")
	public void clickOnTheLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	    	}

	@Then("verify the login is success")
	public void verifyTheLoginIsSuccess() {
		System.out.println("login successful");
	    
	}

	@When("click on crmsfa")
	public void clickOnCrmSfa() {
		
		driver.findElementByLinkText("CRM/SFA").click();
	    
	}
	@When("click on Leads")
	public void clickOnLeads() {
		driver.findElementByLinkText("Leads").click();
	    
	}


	@When("click on createlead")
	public void clickOnCreatelead() {
		driver.findElementByLinkText("Create Lead").click();
	    
	}

	@When("enter the company name as (.*)")
	public void enterTheCompname(String cName) {
		
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	    
	}

	@When("enter the firstname as (.*)")
	public void enterTheFirstname(String fname) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
	   
	}

	@When("enter the lastname as (.*)")
	public void enterTheLastname(String lname) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
	   
	}

	
	@When("click on createlead Button")
	public void clickOnCreateleadButton() {
		driver.findElementByClassName("smallSubmit").click();
	    
	}
	
	
	

	
	

		
		
	}


