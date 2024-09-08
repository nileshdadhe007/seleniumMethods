package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action2_MouseRightClick {
public static void main(String[] args) throws InterruptedException {
	
    WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	Thread.sleep(2000);
	
//	Actions act=new Actions(driver);	
//	act.contextClick().perform();

	
//	WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
//	Actions act=new Actions(driver);	
//	act.moveToElement(loginBtn).perform();
//	Thread.sleep(2000);
//	act.contextClick().perform();
	
//	WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
//		Actions act=new Actions(driver);	
//		act.moveToElement(loginBtn).contextClick().build().perform();
//	
	WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
	Actions act=new Actions(driver);	
	
	act.contextClick(loginBtn).perform();

	
	
	
}
}