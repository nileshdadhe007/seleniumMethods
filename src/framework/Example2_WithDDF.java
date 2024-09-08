package framework;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_WithDDF {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream file =new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\Apr21A.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	//enter UN
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	
	Thread.sleep(2000);
	
	//enter pwd
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
	Thread.sleep(2000);
	
	//click on login btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	Thread.sleep(2000);
	
	//enter pin
	String PIN = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
	
	Thread.sleep(2000);
	//click on continue btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	Thread.sleep(2000);
	
	//verify profile name
	String actPN = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	String expPN = sh.getRow(0).getCell(3).getStringCellValue();
	
	if(actPN.equals(expPN)) 
	{
		System.out.println("Pass");
	}
	else {
		System.out.println("Fail");
	}
	
	
	

}
}