package basicFunction;
//TO GET THE X AND Y CORDINATES OF THE BROWSER

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(3000);
		 
		 
		Point pt=driver.manage().window().getPosition();
		
		System.out.println(pt);
	
	}

}