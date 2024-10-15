package ScreenShort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToTakeTheSingleScreenshot {

	private static final String Destination = null;

	public static void main(String[] args) throws IOException {

		   WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.myntra.com/");

				TakesScreenshot ts=(TakesScreenshot)driver;
				WebElement button = driver.findElement(By.xpath("//body"));
				File source = button.getScreenshotAs(OutputType.FILE);
				
				File Destination=new File("./ScreenShot/SS.png");
				
				
			       Files.copy(source, Destination);
	
  

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static File File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
