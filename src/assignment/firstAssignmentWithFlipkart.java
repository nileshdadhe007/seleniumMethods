package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstAssignmentWithFlipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//open Flipkart
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		//maximize the browser
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//close login popup 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//click on mobile
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		
		//click on flipkart assure 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_24_Dny _3tCU7L']")).click();
		
		// click on Samsung 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='_24_Dny'])[11]")).click();
		
		//click on high to low
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Price -- High to Low']")).click();
		Thread.sleep(3000);
		
		//adding all the mobiles name into list
		List<WebElement> allMobiles = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> mobilePrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		//get size of mobile which is going to use in for loop
		int mobileCount = allMobiles.size();
	
		//print mobile and their price
		for(int i=0;i<=mobileCount-1;i++)
		{
			System.out.println("product name:"+allMobiles.get(i).getText());
			System.out.println("  product price:"+mobilePrice.get(i).getText());
			System.out.println();
		
		}
		
		
	}

}
