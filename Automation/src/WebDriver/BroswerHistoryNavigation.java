package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroswerHistoryNavigation {

	private static Point Point;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
	      Navigation nav=driver.navigate();
	      Thread.sleep(4000);
	   nav.back();
	   Thread.sleep(4000);
	   nav.forward();
	   Thread.sleep(4000);
	   nav.refresh();
		
		Window win = driver.manage().window();
		
		win.maximize();
		win.fullscreen();
		
		// to fetch the size of the window
		
		 Dimension s = win.getSize();
		
		System.out.println(s);

		System.out.println("The hieght of the window is: " +s.getHeight()+"Pixel");
		System.out.println("The width of the window is: " +s.getWidth()+"Pixel");
		
		win.setSize(new Dimension(500, 500));
		
		Point pos=win.getPosition();
		
		System.out.println(pos);
		
		System.out.println(pos.getX());
		System.out.println(pos.getY());
		
		//to set the position
		win.setPosition(new Point(500,300));
		
	}

}
