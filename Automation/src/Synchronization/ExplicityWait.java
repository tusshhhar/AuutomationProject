package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.TextBoxSnapshot;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();		
			
			driver.manage().window().maximize();
			driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");

			
			//driver.manage().timeouts().explicity(15,TimeUnit.SECONDS);
			WebElement textbox = driver.findElement(By.id("email"));

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.until(ExpectedConditions.visibilityOf(textbox));
			
			textbox.sendKeys("tusharvishnoi1998@gmail.com");
			
			WebElement btn = driver.findElement(By.xpath("//button[@data-continue-to='password-container']"));
			wait.until(ExpectedConditions.elementToBeClickable(btn));
			btn.click();
			
			
			
	}

}
