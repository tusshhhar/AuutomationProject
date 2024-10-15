package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		WebElement kid=driver.findElement(By.linkText("KIDS"));
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(kid).perform();
		
		act.moveByOffset(393,36).click().perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
