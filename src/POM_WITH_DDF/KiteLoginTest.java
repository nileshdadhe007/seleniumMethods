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
public class KiteLoginTest {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\Apr21A.xlsx");
	 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	 ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");

	 
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://kite.zerodha.com/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	KiteLogin1Page login1=new KiteLogin1Page(driver);
	
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	login1.enterUN(UN);
	
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	login1.enterPWD(pwd);
	
	login1.clickOnLoginBtn();
	Thread.sleep(2000);
	
	KiteLogin2Page login2 =new KiteLogin2Page(driver);
	
	String pin = sh.getRow(0).getCell(2).getStringCellValue();
	login2.enterPin(pin);
	login2.clickOnCntBtn();
	
	KiteHomePage home=new KiteHomePage(driver);
	
	String useID = sh.getRow(0).getCell(3).getStringCellValue();
	home.verifyUserId(useID);
	
	Thread.sleep(2000);
	driver.close();
	
	
	
}
}