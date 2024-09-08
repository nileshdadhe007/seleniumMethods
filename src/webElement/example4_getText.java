package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_getText {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");

		System.out.println(driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText());
		
//		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
//		System.out.println(text);
		
		
		
//		WebElement forgotP = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
//		String text = forgotP.getText();
//		System.out.println(text);
		
	}
}