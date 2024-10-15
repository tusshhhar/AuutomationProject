package WebElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseTheChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		

        WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://accounts.lambdatest.com/register");
		Thread.sleep(4000);
		
		String parentid=driver.getWindowHandle();
		driver.findElement(By.linkText("Privacy Policy")).click();
		
		Set<String> allid = driver.getWindowHandles();
		
		for(String ids:allid) {
			
			if(!ids.equalsIgnoreCase(parentid)) {
				
				driver.switchTo().window(ids);
				Thread.sleep(4000);
				driver.close();
				
			}
		}
		

	}

}
