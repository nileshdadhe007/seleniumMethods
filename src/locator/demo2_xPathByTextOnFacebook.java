package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2_xPathByTextOnFacebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 
		 //when we could not use the attribute because of the duplicate then we use "text"
		 
		// driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.id("inputUsername")).click();
}
}
