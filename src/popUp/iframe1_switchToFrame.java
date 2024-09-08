package popUp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class iframe1_switchToFrame {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.IE.driver",
				"C:\\Users\\Nilesh\\Downloads\\EIE11_EN-US_MCM_WIN764.EXE");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://mail.google.com/mail/u/0/#inbox");
      
		
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nileshdadhe007@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	}
}