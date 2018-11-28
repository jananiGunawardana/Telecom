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

public class TariffPlans {

	@Test

	public void TariffPlans()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\MY\\SeleniumResources\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='assigntariffplantocustomer.php']")).click();
		driver.findElement(By.name("customer_id")).sendKeys("761076");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.name("submit")).click();
	}
	
}
