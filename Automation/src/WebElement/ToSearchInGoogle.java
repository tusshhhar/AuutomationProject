package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSearchInGoogle {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://www.google.com/");

//		
//		WebElement search = driver.findElement(By.id("APjFqb"));
//		
//		search.sendKeys("Flipkart");
//		
//		Thread.sleep(3000);
//		search.sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.className("LC20lb MBeuO DKV0Md")).click();
		
		
		WebElement Link = driver.findElement(By.linkText("हिन्दी"));
		
		System.out.println("Text== "+Link.getText());
		
		System.out.println("Tagname== "+Link.getTagName());
		Link.click();
		
	}

}
