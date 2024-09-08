package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex_isDisplayed1
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");
		 
		 boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img1']")).isDisplayed();
		 
		 System.out.println(result);
		 if(result==true)
		 {
			 System.out.println("element is found");
		 }
		 else
		 {
			 System.out.println("element is not found");
		 } 
	}
}