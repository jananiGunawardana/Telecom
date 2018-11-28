package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ExtentReport.ExtentReport;

public class Login {

	WebDriver driver;
	ExtentReport Report;
	Register register;
	
	
	By Email=By.id("email");
	By password=By.id("password");
	By Sumbmit=By.name("submit");
	
	public Login(WebDriver driver,ExtentReport Report)
	{
	this.driver=driver;
	this.Report=Report;
	}
	
	
	public void Enterlogindetails()
	{
		
		Report.startTestCase("Enter Login Details");
	
		String Passwordsend=register.returnpassword();
		String email=register.returnemail();
		
		driver.findElement(Email).sendKeys(email); 
		driver.findElement(password).sendKeys(Passwordsend);
		Report.logEventsPass("Successfully entered login details");
	}
	
	public void clickLogin()
	{
		Report.startTestCase("Click Login Button");
		driver.findElement(Sumbmit).click();
		Report.logEventsPass("Successfully Logged");
	}
	

}
