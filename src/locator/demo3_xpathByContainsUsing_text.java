package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3_xpathByContainsUsing_text
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");
		 
		 //  xpath by contains with text  - //tagname[contains(text(),'text value')]
		 driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();
		
	}

}
