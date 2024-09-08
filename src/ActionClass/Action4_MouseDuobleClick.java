package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action4_MouseDuobleClick {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
 
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");

	Thread.sleep(2000);
	
//	WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
//	Actions act=new Actions(driver);	
//	act.moveToElement(ele).perform();
//	act.doubleClick().perform();
	
	
//	WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
//	Actions act=new Actions(driver);	
//	act.moveToElement(ele).doubleClick().build().perform();
	
	WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
	Actions act=new Actions(driver);	
	act.doubleClick(ele).perform();
	//act.scrollToElement(ele).perform();
	
	
}
}