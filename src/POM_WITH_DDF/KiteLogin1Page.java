package POM_WITH_DDF;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//regular class-pom class 1
public class KiteLogin1Page {
	// 1. declaration
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN; 	// private WebElement UN = driver.findElement(By.xpath("xpath xpression"))
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd; 	// private WebElement pwd = driver.findElement(By.xpath("xpath xpression"))
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement login; // private WebElement login = driver.findElement(By.xpath("xpath xpression"))

	//2. initialization
	public KiteLogin1Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. usage
	public void enterUN(String username)
	{
		UN.sendKeys(username);
	}
	
	public void enterPWD(String Password)
	{
		pwd.sendKeys(Password);
	}
	
	public void clickOnLoginBtn() {
		login.click();
	}

}
