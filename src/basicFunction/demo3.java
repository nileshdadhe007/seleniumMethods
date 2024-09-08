package basicFunction;
//TO OPEN THE BROWSER AND CLOSE THE OPEN WINDOW

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3
{
	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(3000);
		 
		 
		 driver.close();
	
	}

}