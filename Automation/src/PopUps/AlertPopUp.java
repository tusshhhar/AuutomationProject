package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();		
			
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Alerts.html");

			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//button[contains(text(),'click the button to display an  alert box')]")).click();
		
//alert with ok button
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(3000);
//		al.accept();
		
//alert with cancel button
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert al2=driver.switchTo().alert();
		Thread.sleep(3000);
		al2.dismiss();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
