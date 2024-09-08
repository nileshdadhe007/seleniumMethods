package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2_getColSizeInARow {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\nilesh software training\\html\\exampleOfWebtable.html");
		Thread.sleep(2000);

		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println("col Size: "+ colSize);
		
		//System.out.println(" col size: "+ driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size());
	}
}