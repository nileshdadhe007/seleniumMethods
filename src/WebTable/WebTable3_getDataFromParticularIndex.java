package WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3_getDataFromParticularIndex {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\nilesh software training\\html\\exampleOfWebtable.html");
		Thread.sleep(2000);

//		// table header
//		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
//		System.out.println(text);

		// table data
		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[2]")).getText();
		System.out.println(text);
		
//		int i=3;
//		
//		System.out.println("Hi "+i+" Hello");
	}
}