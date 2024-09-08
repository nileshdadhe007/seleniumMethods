package basicFunction;
//TO SET THE PIXEL SIZE OF THE BROWSER

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 Thread.sleep(3000);
		 
		 Dimension d= new Dimension(1080,500);
		 
		 driver.manage().window().setSize(d);
		 //setSize() accept dimension argument which set pixel of the browser
		 
		 
	
	}

}