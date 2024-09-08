package POM_WITH_DDF;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//main class--> Test class
public class KiteLoginTest1 {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\eclipse-workspace\\April21A_Selenium\\TestData\\Apr21A.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	 ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
 
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sanjay\\eclipse-workspace\\April21A_Selenium\\Browsers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://kite.zerodha.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	KiteLogin1Page login1=new KiteLogin1Page(driver);
		
	login1.enterUN(sh.getRow(0).getCell(0).getStringCellValue());
	
	login1.enterPWD(sh.getRow(0).getCell(1).getStringCellValue());
	
	login1.clickOnLoginBtn();
	Thread.sleep(2000);
	
	KiteLogin2Page login2 =new KiteLogin2Page(driver);
	
	login2.enterPin(sh.getRow(0).getCell(2).getStringCellValue());
	login2.clickOnCntBtn();
	
	KiteHomePage home=new KiteHomePage(driver);
	
	home.verifyUserId(sh.getRow(0).getCell(3).getStringCellValue());
	
	Thread.sleep(2000);
	driver.close();
	
	
}
}