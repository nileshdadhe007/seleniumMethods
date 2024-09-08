package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomizedListbox1 {
public static void main(String[] args) throws InterruptedException {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");

	//click on Create New Account btn
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();

	
	Thread.sleep(2000);
	
	//step1: identify listbox
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	//step2: create object of actions class
	Actions act=new Actions(driver);
	
	//step3:  click on ele
	act.click(month).perform();
	
	Thread.sleep(2000);
	
	//step4: select option 
	//1. move 1 option upword
	act.sendKeys(Keys.ARROW_UP).perform();
	
	Thread.sleep(2000);
	
	//2. move 1 option downword
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	
	Thread.sleep(2000);
	
	//3. select option-->enter
	act.sendKeys(Keys.ENTER).perform();
	
}
}