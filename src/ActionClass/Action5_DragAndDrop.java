package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action5_DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();

	Thread.sleep(2000);

	WebElement src = driver.findElement(By.xpath("//a[text()=' SALES ']"));
	WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	
	Actions act=new Actions(driver);
	act.dragAndDrop(src, dest).perform();
	
	//act.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
	
	
}
}