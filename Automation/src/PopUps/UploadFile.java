package PopUps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			 driver.findElement(By.xpath("//p[contains(text(),'I have work experience')]")).click();
			    
				
				 driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
		    
		     File f=new File("./AutoIt/Tushar Manual.docx");
			
			
			 Thread.sleep(3000);
			 
		WebElement file = driver.findElement(By.cssSelector("input[type=file]"));
		file.sendKeys(f.getAbsolutePath());
		
		
		// file.sendKeys(Keys.ENTER);

		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	

}
