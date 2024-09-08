package locator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/nilesh%20software%20training/html/idLocator.html");

		// enter FN
		driver.findElement(By.id("123")).sendKeys("nilesh");

		// enter LN
		driver.findElement(By.id("123")[1]).sendKeys("dadhe");
	
		
//		// enter FN
	//	driver.findElement(By.id("123")).sendKeys("abc");
//
//		// enter LN
	 //   driver.findElement(By.id("467")).sendKeys("xyz");

	}
}