package Insuarance;
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



public class Register {
	@Test

	public void Register()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\MY\\SeleniumResources\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@href='register.php']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='index.php']")));

		//User Registration
		Select droptitle=new  Select(driver.findElement(By.id("user_title")));
		droptitle.selectByIndex(1);

		driver.findElement(By.id("user_firstname")).sendKeys("janani");
		driver.findElement(By.id("user_surname")).sendKeys("Gnawardana");
		driver.findElement(By.id("user_phone")).sendKeys("071589655");

		Select dropYear=new  Select(driver.findElement(By.id("user_dateofbirth_1i")));
		dropYear.selectByVisibleText("1988");

		Select dropMonth=new  Select(driver.findElement(By.id("user_dateofbirth_2i")));
		dropMonth.selectByVisibleText("June");

		Select dropDate=new  Select(driver.findElement(By.id("user_dateofbirth_3i")));
		dropDate.selectByVisibleText("3");


		driver.findElement(By.id("licencetype_f")).click();

		Select dropOccupation=new  Select(driver.findElement(By.id("user_occupation_id")));
		dropOccupation.selectByVisibleText("Engineer");

		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Peradeniya Road");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Kandy");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("Sri Lanka");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("02545");
		driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("Janani@gmail.com");
		driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("1234");
		driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();

		//Login
		driver.findElement(By.id("email")).sendKeys("Janani@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.name("submit")).click();

		List<WebElement> MenuList=driver.findElements(By.tagName("li"));
		for (WebElement li : MenuList)
		{
			if (li.getText().equals("Edit Profile")) 
			{
				li.click();
				break;   
			}
		}
		
		driver.findElement(By.tagName("h5")).getText(); 
		//WebDriverWait wait2 = new WebDriverWait(driver, 100);
		//WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_title")));
		
		//Select droptitleEdit=new  Select(driver.findElement(By.id("user_title")));
		//System.out.println(droptitleEdit);
		List<WebElement> droptitleEdit=driver.findElements(By.id("user_title"));
		for (WebElement li : droptitleEdit)
		{
			if (li.getText().equals("Mr")) 
			{
				li.click();
				break;   
			}
		}
		
		//droptitle.selectByIndex(5);
		driver.findElement(By.id("user_surname")).sendKeys("GnawardanaEdit");
		driver.findElement(By.id("user_firstname")).sendKeys("jananiEdit");
		driver.findElement(By.id("user_phone")).sendKeys("077589657");
		
		
		//WebDriverWait wait2 = new WebDriverWait(driver, 100);
		//WebElement element2 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_dateofbirth_1i")));
		//Select dropYearEdit=new  Select(driver.findElement(By.id("user_dateofbirth_1i")));
		//dropYear.selectByVisibleText("1990");
		
		//Select dropMonthEdit=new  Select(driver.findElement(By.id("user_dateofbirth_2i")));
		//dropMonth.selectByVisibleText("May");
		//Select dropDateEdit=new  Select(driver.findElement(By.id("user_dateofbirth_3i")));
		//dropDate.selectByVisibleText("5");
		//driver.findElement(By.id("user_licencetype_t")).click();
		//Select dropOccupationEdit=new  Select(driver.findElement(By.id("user_occupation_id")));
		//dropOccupation.selectByVisibleText("Nurse");
		driver.findElement(By.id("user_address_attributes_street")).sendKeys("Peradeniya");
		driver.findElement(By.id("user_address_attributes_city")).sendKeys("Gale");
		driver.findElement(By.id("user_address_attributes_county")).sendKeys("India");
		driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("02545236");
		driver.findElement(By.name("commit")).click();


	}
}

