package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
        Thread.sleep(4000);
        
        //To click on search
   //     WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
	
	   // searchbox.sendKeys("T-shirts");
	    
	 //   driver.findElement(By.xpath("//span[@data-reactid=\"909\"]")).click();
	
        //To click on any options
     //   driver.findElement(By.xpath("//span[@data-reactid=\"903\"]")).click();
	
       WebElement searchbox = driver.findElement(By.xpath("//span[text()='Bag']"));
	
	
	    searchbox.click();
	
	    WebElement searchbox1 = driver.findElement(By.xpath("//div[text()='ADD ITEMS FROM WISHLIST']"));
		
		
	    searchbox1.click();
	
	
	
	
	
	}

}
