package WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable5_getAllDataInACol {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/html%20files/wetable1.html");
		Thread.sleep(2000);

		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();

		for (int i = 1; i <= rowSize; i++)
		{
			String text;
			if (i == 1) 
			{
				text = driver.findElement(By.xpath("//table[@id='1234']//tr[" + i + "]/th[2]")).getText();
			} 
			else
			{
				text =driver.findElement(By.xpath("//table[@id='1234']//tr[" + i + "]/td[2]")).getText();
			}

			System.out.println(text);
		}

	}
}
