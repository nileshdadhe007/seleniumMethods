package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ClassName {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/nilesh%20software%20training/html/className.html");

		// enter FN
		driver.findElement(By.className("abc")).sendKeys("nilesh");

		// enter LN
		driver.findElement(By.className("abc")).sendKeys("dadhe");
		
		
		

//		// enter FN
//		driver.findElement(By.className("abc")).sendKeys("abc");
//
//		// enter LN
//		driver.findElement(By.className("xyz")).sendKeys("xyz");

	}
}