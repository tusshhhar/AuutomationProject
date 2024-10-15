package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchTheBroswer {

	public static void main(String[] args) {
	// to launch the browser	
		WebDriver driver=new ChromeDriver();
		// to Navigate the URL
		driver.get("https://www.selenium.dev/downloads/");
		
		        //String title=driver.getTitle();
				//System.out.println(title);
	System.out.println("The title of the selenium is :"+driver.getTitle());
	// To fetch the URL of the website
	System.out.println("The URL of the selenium is :"+driver.getCurrentUrl());
		
	// To fetch the URL of the website
	//System.out.println(driver.getPageSource());
		
	//To fetch the window id
	System.out.println("The Window id is :"+driver.getWindowHandle());
	
//	driver.close();
	driver.quit();
	}

}
