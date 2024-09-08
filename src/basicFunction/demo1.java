package basicFunction;

import org.openqa.selenium.chrome.ChromeDriver;

//PROGRAM TO OPEN THE CHROME BROWSER


public class demo1
{
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 ChromeDriver driver =new ChromeDriver();
		 driver.close();
		
	}
}
