package Listbox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox9_isMultiple1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\nilesh software training\\\\selenium installation\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/nilesh%20software%20training/html/multselect.html");

		
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='cars']"));

		
		Select s=new Select(ele);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		if(result) 
		{
			System.out.println("listbox is of multi selectable");
		}
		else {
			System.out.println("listbox is of single selectable");
		}
		
		
	}
}