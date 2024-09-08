package basicFunction;
//TO GET THE PIXEL SIZE OF THE BROWSER
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(3000);
		 
		 Dimension dime = driver.manage().window().getSize();
		 
		 System.out.println(dime);
		 
		 
	
	}

}