package basicFunction;
// TO GET THE CURRENT URL OF THE BROWSER

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.navigate().to("https://www.facebook.com/");
		 
		 Thread.sleep(3000);
		 
		 driver.navigate().to("https://www.google.com");
		 
		 
		Thread.sleep(3000);
		
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		
		String Curl =driver.getCurrentUrl();
		System.out.println(Curl);
		
		 

	
	}

}