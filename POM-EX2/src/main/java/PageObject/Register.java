package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import io.codearte.jfairy.producer.text.TextProducer;
import ExtentReport.ExtentReport;
public class Register {

	WebDriver driver;
	Fairy fairy = Fairy.create();
	ExtentReport Report ;
	
	static String emailAdd;
	static String passwordsend;


	By  RegisterButton =By.xpath("//a[@href='register.php']");
	By Title =By.id("user_title");
	By firstname =By.id("user_firstname");
	By Surename=By.id("user_surname");
	By Phone=By.id("user_phone");
	By dateofbirthYear=By.id("user_dateofbirth_1i");
	By dateofbirthMonth=By.id("user_dateofbirth_2i");
	By dateofbirthdate=By.id("user_dateofbirth_3i");
	By licencetype=By.id("licencetype_f");
	By occupation=By.id("user_occupation_id");
	By Street=By.id("user_address_attributes_street");
	By city=By.id("user_address_attributes_city");
	By country=By.id("user_address_attributes_county");
	By Postcode=By.id("user_address_attributes_postcode");
	By email=By.id("user_user_detail_attributes_email");
	By Password=By.id("user_user_detail_attributes_password");
	By Confirmpassword=By.id("user_user_detail_attributes_password_confirmation");
	By Submitbtton=By.name("submit");


	public Register(WebDriver driver,ExtentReport Report ) {
		this.driver = driver;
		this.Report=Report;
	}

	public void clickRegister(){

		Report.startTestCase("Register Button Click");
		driver.findElement(RegisterButton).click();
		Report.logEventsPass("Succssefully Redirect to the Register Page");


	}


	public void Registercustomer()
	{

		Person person = fairy.person();
		TextProducer Text=fairy.textProducer();

		Select title=new Select (driver.findElement(Title));
		title.selectByVisibleText("Mrs");
		driver.findElement(firstname).sendKeys(person.getFirstName());
		driver.findElement(Surename).sendKeys(person.getLastName());
		driver.findElement(Phone).sendKeys(person.getTelephoneNumber());

		Select Year=new Select(driver.findElement(dateofbirthYear));
		Year.selectByVisibleText("1988");
		Select Month=new Select(driver.findElement(dateofbirthMonth));
		Year.selectByIndex(5);
		Select Date=new Select(driver.findElement(dateofbirthdate));
		Year.selectByIndex(5);
		driver.findElement(licencetype).click();

		Select dropOccupation=new Select (driver.findElement(occupation));
		dropOccupation.selectByVisibleText("Engineer");
		driver.findElement(Street).sendKeys("Peradeniya Road");
		driver.findElement(city).sendKeys("kandy");
		driver.findElement(city).sendKeys("country");
		driver.findElement(Postcode).sendKeys("14556");


		 emailAdd=person.getEmail();
		driver.findElement(email).sendKeys(emailAdd);


	    passwordsend=person.getPassword();
		driver.findElement(Password).sendKeys(passwordsend);
		driver.findElement(Confirmpassword).sendKeys(passwordsend);

	}
	
	public static String returnemail()
	{
		
		return emailAdd;
		
	}
	public static String returnpassword()
	{
		return passwordsend;
		
	}

	public void ClickCreate()
	{
		Report.startTestCase("Create Button Click");

		driver.findElement(Submitbtton).click();
		Report.logEventsPass("Succssefully Registerd the Customer");

	}


}
