package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttributes
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		
		 //driver.findElement(By.xpath("xpath expression"));
		 //xpath by attribute   - //tagname[@attributeName='attribute value']
		 
		 
		//sendkey is use to provide the input to the field
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nileshdadhe007@gmail.com");
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
		 
		 //click keyword is use to click on the field
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		
		 
		 
		
	
	}

}