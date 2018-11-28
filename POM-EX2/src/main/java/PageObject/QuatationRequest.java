package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import ExtentReport.ExtentReport;

public class QuatationRequest {

	WebDriver driver;
	ExtentReport Report;
	
	By Requestquatation=By.xpath("//a[@href='#tabs-2']");
	By breakdowncover =By.id("quotation_breakdowncover");
	By windscreenrepair_YES=By.id("quotation_windscreenrepair_t");
	By windscreenrepair_NO=By.id("quotation_windscreenrepair_f");
	By incidents=By.id("quotation_incidents");
	By registration=By.id("quotation_vehicle_attributes_registration");
	By annualmileage=By.id("quotation_vehicle_attributes_mileage");
	By estimatedvalue=By.id("quotation_vehicle_attributes_value");
	By parkinglocation=By.name("parkinglocation");
	By policystartYEAR=By.id("quotation_vehicle_attributes_policystart_1i");
	By policystartMONTH=By.id("quotation_vehicle_attributes_policystart_2i");
	By policystartDATE=By.id("quotation_vehicle_attributes_policystart_3i");
	By CalculatePremium=By.xpath("//input[@value='Calculate Premium']");
	By Resetform=By.xpath("//input[@value='Reset form']");
	By SaveQuotation=By.xpath("//input[@value='Save Quotation']"); 
	
	public QuatationRequest(WebDriver driver,ExtentReport Report)
	{
		this.driver=driver;
		this.Report=Report;
		
	}
	
	
	public void navigateto_Requestquatation()
	{
		Report.startTestCase("Navigate to Request quatation Menu");
		driver.findElement(Requestquatation).click();
		Report.logEventsPass("Successfully Navigated to Request quatation Menu ");
	}
	
	public void  EnterData_Requestquatation()
	{
		Report.startTestCase("Enter Quatation request Details");
		Select breakdowncoverText= new Select (driver.findElement(breakdowncover));
		breakdowncoverText.selectByIndex(2);
		driver.findElement(windscreenrepair_YES).click();
		driver.findElement(incidents).sendKeys("To buy a new vehicle");
		driver.findElement(registration).sendKeys("WR-6890");
		driver.findElement(annualmileage).sendKeys("75000");
		driver.findElement(estimatedvalue).sendKeys("5600000");
		
		Select parkinglocationText= new Select (driver.findElement(parkinglocation));
		breakdowncoverText.selectByIndex(2);
		//breakdowncoverText.selectByVisibleText("Public place");
		Select policystartYEARText= new Select (driver.findElement(policystartYEAR));
		breakdowncoverText.selectByIndex(2);
		Select policystartMONTHText= new Select (driver.findElement(policystartMONTH));
		breakdowncoverText.selectByIndex(2);
		Select policystartDATEText= new Select (driver.findElement(policystartDATE));
		breakdowncoverText.selectByIndex(2);
		Report.logEventsPass("Successfully Entered Quatation Details");
	
	}
	
	public void Click_CalculatePremium()
	{
		Report.startTestCase("Calculate Premium");
		driver.findElement(CalculatePremium).click();
		Report.logEventsPass("Successfully Caluculate Premium");
		Report.logEventsFail("Failed to Caluculate Premium");
	}
	
	public void Click_SaveQutation()
	{
		driver.findElement(SaveQuotation).click();
	}
	
	public void Click_ResetForm()
	{
		Report.startTestCase("Reset form Data");
		driver.findElement(Resetform).click();
		Report.logEventsPass("Successfully Reset the form");
	}
	 
}
