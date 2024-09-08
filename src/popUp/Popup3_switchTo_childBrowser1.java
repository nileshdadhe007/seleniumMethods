package popUp;


import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup3_switchTo_childBrowser1 {
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Thread.sleep(2000);

		//click on newTab from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Thread.sleep(2000);
		
		//get address/Id of child window
		
		Set<String> Multipleids = driver.getWindowHandles();   // address of main page & child window
		
		ArrayList<String> al =new ArrayList<String>(Multipleids);
		
//		String addressOfChildWindow = al.get(1);
//		System.out.println(addressOfChildWindow);
		
		//switch to child browser popup/window
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(2000);
		
		//click on Training from childbrowser popup
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
	}
}