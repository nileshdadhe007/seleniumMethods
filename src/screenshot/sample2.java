package screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample2 {
public static void main(String[] args) throws IOException  {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
	String random = RandomString.make(2);  //ad dj jf lo 
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	File dest=new File("C:\\nilesh software training\\screenshots\\screenshot"+random+".jpg");
	System.out.println(dest);

	FileHandler.copy(source, dest);
	


}
}