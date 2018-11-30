package Telecom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.*;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddCustomer {
	@Test
	public void AddCustomer()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\MY\\SeleniumResources\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='addcustomer.php']")).click();
		
	//driver.findElement(By.xpath("//input[@id='done']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@lable='done']")));
		//WebElement done=driver.findElement(By.xpath("//div[@lable='done']"));
		//done.click();
	//@FindBy(xpath = "//div[@label='First Name']")
		//System.out.println(driver.findElement(By.xpath("//label[@for='done']")).getText());
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.name("fname")).sendKeys("Janani");
		driver.findElement(By.name("lname")).sendKeys("Gunawardana");
		
		driver.findElement(By.name("emailid")).sendKeys("Janani@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Peradeniya Road Kandy");
		driver.findElement(By.name("telephoneno")).sendKeys("01123566");
		driver.findElement(By.name("submit")).click();
		
				
		
		
		
		
		
		
	}
	}


