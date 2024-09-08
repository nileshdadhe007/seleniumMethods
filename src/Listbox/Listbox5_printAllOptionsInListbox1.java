package Listbox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox5_printAllOptionsInListbox1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		//click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		//step1:
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s=new Select(year);
		
		List<WebElement> allOptions = s.getOptions();
		
		for(WebElement option:allOptions) {
			System.out.println(option.getText());
		}
		
		
	}
}