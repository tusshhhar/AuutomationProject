package SelectClassDropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException  {
		
		 WebDriver driver=new ChromeDriver();
			
	        driver.manage().window().maximize();
			driver.get("https://demoqa.com/select-menu");
		
			//single Select
//		WebElement drop = driver.findElement(By.tagName("select"));
//		
//		Select sct=new Select(drop);
//		
//		System.out.println(sct.isMultiple());
//		
//		sct.selectByIndex(2);
//		Thread.sleep(3000);
//		sct.selectByValue("AZE");
//		Thread.sleep(3000);
//		sct.selectByVisibleText("Bhutan");
//		
//		List<WebElement> opt = sct.getOptions();		
//		
//		System.out.println("The total no. of the countries is: "+opt.size());
//		
//		for(WebElement allopt:opt) {
//			
//		
//		System.out.println(allopt.getText());
//	}
		
			//Multiple Select
			WebElement drop = driver.findElement(By.id("cars"));
        Select sct=new Select(drop);
		
		System.out.println(sct.isMultiple());
		
		sct.selectByIndex(2);
		Thread.sleep(3000);
		sct.selectByValue("saab");
		Thread.sleep(3000);
		sct.selectByVisibleText("Opel");
		
		List<WebElement> opt = sct.getOptions();		
		
		System.out.println("The total no. of the countries is: "+opt.size());
		
		for(WebElement allopt:opt) {
			
		
		System.out.println(allopt.getText());
	}
		sct.deselectByIndex(3);
		Thread.sleep(3000);
		
		sct.deselectByValue("saab");
		Thread.sleep(3000);
		
		sct.deselectByVisibleText("Opel");
		Thread.sleep(3000);
		
		sct.deselectAll();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
