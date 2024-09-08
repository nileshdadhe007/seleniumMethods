package basicFunction;
//CHECK THE TEST CASES WHETHER THE TITLE IS SAME OR NOT

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 Thread.sleep(3000);
		 
		String actTitle =driver.getTitle();
		String exptitle="google";
		
		if(actTitle.equals(exptitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
	}

}