package popUp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1_HiddenDivision {
	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver",
				//"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		Thread.sleep(2000);
		//click on login button
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		
		//enter UN
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("abc");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("xyz");
		
		//click on login button
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		
		
	}
}