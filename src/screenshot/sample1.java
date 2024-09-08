package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample1 { 
public static void main(String[] args) throws IOException  {
	

	System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\nilesh software training\\screenshots\\xyz.jpg");

	FileHandler.copy(source, dest);
}
}