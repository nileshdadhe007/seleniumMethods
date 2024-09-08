package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2_xPathByText 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("file:///C:/nilesh%20software%20training/html/exforLocator.html");
		 
		 //when we could not use the attribute because of the duplicate then we use "text"
		 //xpath by text       - //tagname[text()='text value']
		// driver.findElement(By.xpath("//a[text()='google']")).click();
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='facebook']")).click();
		 
}
}
