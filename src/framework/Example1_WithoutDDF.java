package framework;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_WithoutDDF {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	//enter UN
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("");
	
	//enter pwd
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
	
	//click on login btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	//enter pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("");
	
	//click on continue btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	
	
	//verify profile name
	String actPN = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	String expPN = "AM2345";
	
	if(actPN.equals(expPN)) 
	{
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
	
	

}
}