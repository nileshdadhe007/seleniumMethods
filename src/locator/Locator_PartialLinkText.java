package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_PartialLinkText {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\nilesh software training\\\\selenium installation\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///C:/nilesh%20software%20training/html/partialLinkText.html");

		// click on facebook link
		driver.findElement(By.partialLinkText("book")).click();

		
	}
}