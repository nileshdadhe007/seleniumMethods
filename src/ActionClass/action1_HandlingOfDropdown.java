package ActionClass;

//program to handle drop down
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action1_HandlingOfDropdown {
public static void main(String[] args) throws InterruptedException {
	

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

	Thread.sleep(2000);
	
	//step1:
	WebElement loginBtn = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
	
	
	//step2:
	Actions act=new Actions(driver);
	
	
	//step3:
	act.moveToElement(loginBtn).perform();
	
	
	
}
}