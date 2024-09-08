package popUp;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup5_switchTo_mainPage_From_childBrowser {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		// click on newTab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		//get child window id		
		Set<String> AllIds = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(AllIds);
	
		//switch to child window
		driver.switchTo().window(al.get(1));
			
		// click on Training from childbrowser popup
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		//switch to main page/window
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(2000);
				
		//click on new window from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

	}
}