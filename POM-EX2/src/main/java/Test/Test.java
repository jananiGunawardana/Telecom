package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import ExtentReport.ExtentReport;
import PageObject.Register;
import PageObject.Login;
import PageObject.QuatationRequest;

public class Test {

	WebDriver driver;
	Register  register;
	Login login;
	QuatationRequest quatationRequest;
	
	
	static String email;
	
	ExtentReport Report=new ExtentReport();
	
	@BeforeTest
	public void setup()
	{

		System.setProperty("webdriver.chrome.driver","D:\\MY\\SeleniumResources\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		Report.SetupReport();
	}

	@org.testng.annotations.Test(priority=1)
	public void Register() 
	{
	
		register=new Register(driver,Report);
		
		register.clickRegister();
		
		register.Registercustomer();
		
		
		register.ClickCreate();
	}

	
	@org.testng.annotations.Test(priority=2)
	public void Login()
	{
		login=new Login(driver,Report);
		login.Enterlogindetails();
		login.clickLogin();
	}
	
	
	@org.testng.annotations.Test(priority=3)
	public void QuatationRequest()
	{
		quatationRequest=new QuatationRequest(driver,Report);
		quatationRequest.navigateto_Requestquatation();
		quatationRequest.EnterData_Requestquatation();
		quatationRequest.Click_CalculatePremium();
		//quatationRequest.Click_SaveQutation();
		quatationRequest.Click_ResetForm();
			
	}
	
	
	
	@AfterTest
	public void CreateFinalExtentReport() 
	{
	Report.createFinalReport();
	}
}


