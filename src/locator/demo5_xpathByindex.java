package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5_xpathByindex
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		 
		 driver.get("https://en-gb.facebook.com/");
		 //driver.navigate().to("https://en-gb.facebook.com/");
		 Thread.sleep(2000);
		 
		 //click on "create new account" buttom
		 driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		
		Thread.sleep(2000);
		
		 //enter full name
		 driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("nilesh");
		 //Thread.sleep(2000);
		 
		 //enter sirname
		 driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("dadhe");
		 //Thread.sleep(2000);
		 
		 //enter mo no
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9623218871");
		 
	}
	}