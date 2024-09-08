package WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4_getAllDataInARow {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/html%20files/wetable1.html");
		Thread.sleep(2000);
		
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();

	for(int i=1; i<=colSize; i++) 
	{
		String data = driver.findElement(By.xpath("//table[@id='1234']//tr[5]/td["+i+"]")).getText();
		System.out.print(data+ " ");
	}
		
		
	}
}