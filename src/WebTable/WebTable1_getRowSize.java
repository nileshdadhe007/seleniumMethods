package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1_getRowSize {
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("C:\\nilesh software training\\html\\exampleOfWebtable.html");
	Thread.sleep(2000);
	
	//List<WebElement> AllRows = driver.findElements(By.xpath("//tr"));
	
	//List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));	
	List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));

	System.out.println("Row Size: "+ AllRows.size());
	
	
	//or
	
//	int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
//	System.out.println("Row Size: "+ rowSize);
	
	System.out.println("Row Size: "+driver.findElements(By.xpath("//table[@id='1234']//tr")).size());
}
}