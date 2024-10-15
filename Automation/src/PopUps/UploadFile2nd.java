package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class UploadFile2nd {

	public static void main(String[] args) {
		
		
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Select user type (Experienced/Fresher)
		driver.findElement(By.xpath("//body/div[@id='root']/div[contains(@class,'container')]/div[contains(@class,'content')]/div[contains(@class,'right-container')]/div[contains(@class,'right-pane')]/div[contains(@class,'registerWrapper')]/div[contains(@class,'formWrapper')]/form[contains(@name,'register')]/div[contains(@class,'formElems')]/div[contains(@class,'formField userType')]/div[contains(@class,'radioWrap')]/div[1]")).click();

		// Locate the file input element and upload the file using sendKeys
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		
		fileInput.sendKeys("C:\\Users\\tusha\\Downloads");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
