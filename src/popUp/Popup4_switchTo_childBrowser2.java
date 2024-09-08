package popUp;


import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4_switchTo_childBrowser2 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);

		// click on newWindow from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();

		// get address of child window
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);

		//switch to child window
		driver.switchTo().window(al.get(1));

		Thread.sleep(2000);
		
		//perform action on child window
		driver.manage().window().maximize();

	}
}