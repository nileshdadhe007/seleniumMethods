   package autoSuggetion;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(2000);

	List<WebElement> AllOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]"));
	
	String expText="redmi note 10";
	
	for( WebElement option: AllOptions) 
	{
		String actText = option.getText();
		System.out.println(actText);
		
		if(actText.equals(expText)) 
		{
			option.click();
			break;
		}
			
	}	
	}
}