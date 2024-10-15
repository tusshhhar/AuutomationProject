package PopUps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");

			Thread.sleep(3000);
			  WebElement file = driver.findElement(By.className("main-3"));
			 
			    file.click();
			 Thread.sleep(3000);
			 driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']")).click();
	    
			 Thread.sleep(3000);
		
		Runtime.getRuntime().exec("./autoit/Upload File.exe");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
