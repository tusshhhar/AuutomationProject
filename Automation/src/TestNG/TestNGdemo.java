package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGdemo {

	
	WebDriver driver;
	@BeforeClass
	//@Test(priority = 0)
	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	@Test(priority = 1)
	public void Enter_FullName() {
		driver.findElement(By.name("name")).sendKeys("Tushar Vishnoi");
		
	}
	@Test(priority = 2)
    public void Enter_Email() {
    	driver.findElement(By.xpath("(//input[@name=\"email\"])[2]")).sendKeys("tusharvishnoi27@gmail.com");
		
	}
	@Test(priority = 3)
    public void Click_On_Signup_Button() {
    	driver.findElement(By.xpath("//button[.='Signup']")).click();
		
	}
	@Test(priority = 4)
	public void teardown() {
		
		//driver.close();
	}
		
		
		
		
		
		
		
		
		
	}


