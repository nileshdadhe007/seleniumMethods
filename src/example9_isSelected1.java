
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example9_isSelected1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		WebElement female = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		boolean result = female.isSelected();
		
		if(result==true)
		{
			System.out.println("radio button already selected");
		}
		else 
		{
			System.out.println("radio button not selected");
			Thread.sleep(3000);
			female.click();
			
			boolean result1 = female.isSelected();
			if(result1 == true)
			{
				System.out.println("radio button selected");
			}
			else
			{
				System.out.println("radio button not selected");
			}			
			
		}
		
	}
}
