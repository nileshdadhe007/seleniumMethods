package iFrame;


import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1_switchToFrame {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		//switch to frame
		//driver.switchTo().frame(0)   int frameindex
		//driver.switchTo().frame("iframeResult");   //String FrameId
	//	driver.switchTo().frame("iframeResult");  //String frameName
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(frame);   //webElement
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		
	}
}