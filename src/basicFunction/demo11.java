package basicFunction;
//TO SET THE POSITION OF THE BROWSER


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo11
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(3000);
		 
		 Dimension d= new Dimension(600,500);
		 
		 driver.manage().window().setSize(d);
		 
		 Thread.sleep(3000);
		 
		  Point p=new Point(10,90);
		 driver.manage().window().setPosition(p);
		 
	
	}

}