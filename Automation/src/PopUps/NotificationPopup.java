package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotificationPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		 WebDriver driver=new ChromeDriver();		
			
			driver.manage().window().maximize();

			driver.get("https://www.myntra.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.findElement(By.linkText("KIDS")).click();	
			
			Thread.sleep(3000);
		Robot robo = new Robot();
		
			for(int i=1;i<=2;i++){

				robo.keyPress(KeyEvent.VK_TAB);
				
				}
			Thread.sleep(3000);
			robo.keyPress(KeyEvent.VK_ENTER);
			
			
			
			
			
			
			
			
			
	}

}
