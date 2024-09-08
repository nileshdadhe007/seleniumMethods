package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4_xpathByContainsUsing_attribute
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");
		 
		 // xpath by contains with attribute  - //tagname[contains(@ attributeName,'attribute value')]
		driver.findElement(By.xpath("//input[contains(@placeholder,'address')]")).sendKeys("nileshdadhe007@gmail.com");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("nilesh");
		driver.findElement(By.xpath("//button[contains(@name,'gin')]")).click();
		
	}

}
