package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_tagname 
{
	
		public static void main(String[] args) 
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
			 
			 WebDriver driver =new ChromeDriver();
			 
			driver.get("file:///C:/nilesh%20software%20training/html/tagname.html");
			 //enter full name
			 driver.findElement(By.tagName("input")).sendKeys("abc");
			 
			// driver.findElement(By.tagName("input"));
			 //enter last name
			 driver.findElement(By.tagName("input")).sendKeys("xyz");
			
		}

	}



