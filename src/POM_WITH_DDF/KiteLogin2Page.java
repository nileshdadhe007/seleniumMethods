package POM_WITH_DDF;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//regular class--> pom class 2
public class KiteLogin2Page {
	// 1. declaration
	@FindBy(xpath = "//input[@id='pin']") private WebElement pin;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement contBtn;

	
	// 2. initialization
	public KiteLogin2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. usage
	public void enterPin(String pinValue) {
		pin.sendKeys(pinValue);
	}
	
	public void clickOnCntBtn() {
		contBtn.click();
	}
	
	

}