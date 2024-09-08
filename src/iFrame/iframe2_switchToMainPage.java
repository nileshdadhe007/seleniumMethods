package iFrame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframe2_switchToMainPage {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		//switch to frame
		driver.switchTo().frame("iframeResult"); // String frameName

		//perform action on frame
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();

		//switch to main page from frame
		driver.switchTo().defaultContent();
		
		
		//perform action on main page
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

	}
}