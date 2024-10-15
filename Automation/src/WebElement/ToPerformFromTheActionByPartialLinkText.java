package WebElement;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page.GetAppManifestResponse;

public class ToPerformFromTheActionByPartialLinkText {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
        driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
//
//		WebElement home = driver.findElement(By.partialLinkText("Home"));
//		
//		System.out.println("it is the text of the link: "+home.getText());
//	//	home.click();
//
//		System.out.println(home.isEnabled());
//		System.out.println(home.isDisplayed());
//		System.out.println(home.isSelected());
//		
//		System.out.println("Attribute Value= "+home.getAttribute("style"));
//		
//		System.out.println("Css Value= "+home.getCssValue("color"));
		
		
		// To find the location and size of the search bar with the help of getrect()
		
		WebElement search=driver.findElement(By.tagName("input"));
		
		Rectangle rec=search.getRect();
		
		Dimension size=rec.getDimension();
		
		System.out.println(size);
		
		System.out.println("This is the height of the box: "+size.getHeight());
		System.out.println("This is the height of the box: "+size.getWidth());
		Point loc=rec.getPoint();
		
		System.out.println(loc);
		System.out.println("This is the X distance of the box: "+loc.getX());
		System.out.println("This is the Y distance of the box: "+loc.getY());
	}

}
