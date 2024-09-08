package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_name {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/nilesh%20software%20training/html/name.html");

		// enter FN
		driver.findElement(By.name("abc1")).sendKeys("abc");

		// enter LN
		driver.findElement(By.name("abc1")).sendKeys("xyz");
		
		
//		// enter FN
//		driver.findElement(By.name("abc1")).sendKeys("abc");
//
//		// enter LN
//		driver.findElement(By.name("xyz1")).sendKeys("xyz");
		
		
		


	}
}