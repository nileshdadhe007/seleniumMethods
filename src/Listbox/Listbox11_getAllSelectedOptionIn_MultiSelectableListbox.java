package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox11_getAllSelectedOptionIn_MultiSelectableListbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/nilesh%20software%20training/html/multselect.html");

		WebElement ele = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		List<WebElement> mulSelectedOptions = s.getAllSelectedOptions();
		
		for(WebElement selectedOption:mulSelectedOptions) {
			System.out.println(selectedOption.getText());
		}

	}
}