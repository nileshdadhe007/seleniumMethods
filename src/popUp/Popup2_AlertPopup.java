package popUp;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2_AlertPopup {
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(2000);

		//click on click me button
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		
		Thread.sleep(2000);
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		
		//get text present in alert popup
		String text = alt.getText();
		System.out.println(text);
		
		//click on ok btn
		alt.accept();
		
//		//switch to alert popup & click on ok btn
//		driver.switchTo().alert().accept();
	}
}