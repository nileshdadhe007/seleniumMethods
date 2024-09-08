package webElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_clear {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");

		
		//approach-1 
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name='email']")).clear();
//		
				
		//approach-2 		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("abc");
		Thread.sleep(2000);
		email.clear();
		Thread.sleep(2000);
		email.sendKeys("xyz");
		Thread.sleep(2000);
		email.clear();
		
		
		
	}
}