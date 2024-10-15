package ScreenShort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class ToCaptureTheScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		   WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.myntra.com/");

	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	File Destination=new File("./ScreenShot/FirstSS.png");
	
	
       Files.copy(source, Destination);
	
	}

}
