package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
        Thread.sleep(4000);
        
        
        
        driver.findElement(By.xpath("(//input[contains(@class,'js-continue-input js-continue')])[1]")).sendKeys("smartybittu27@gmail.com");
        
        driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]")).click();
        
        
        
        
	}

}
