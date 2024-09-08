package basicFunction;
//TO CLOSE THE CHROME BROWSER

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(3000);
		 
		 
		 driver.quit();
		 //quit method is use to close all open window of the browser
	
	}

}