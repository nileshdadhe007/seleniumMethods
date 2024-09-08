package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Sendkeys {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");
		
		//approach-1 
		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
			

		//approach-12
		WebElement priya = driver.findElement(By.xpath("//input[@name='email']"));
		priya.sendKeys("abc");

		Thread.sleep(2000);

		priya.clear();

		Thread.sleep(2000);

		priya.sendKeys("xyz");
	}
}