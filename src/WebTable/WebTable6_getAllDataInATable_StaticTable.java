package WebTable;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable6_getAllDataInATable_StaticTable {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjay\\Desktop\\Study\\Selenium_Syallabus\\Apr21_Selenium_Soft\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/sanjay/Desktop/Study/Selenium_Syallabus/html%20files/wetable1.html");
		Thread.sleep(2000);

		// outer for loop for rows
		for (int i = 2; i <= 6; i++) {

			// inner for loop for col
			for (int j = 1; j <= 3; j++) {

				String text = driver.findElement(By.xpath("//table[@id='1234']//tr[" + i + "]/td[" + j + "]"))
						.getText();

				System.out.print(text + "  ");
			}

			System.out.println();
		}

	}
}