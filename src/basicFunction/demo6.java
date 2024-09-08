package basicFunction;
// TO GET THE TITLE OF THE WEBSITE

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(3000);
		 
		//String title =driver.getTitle();
		//System.out.println(title);
		System.out.println(driver.getTitle());
		//getTitle method is use to get title of the webpage
	
	}

}