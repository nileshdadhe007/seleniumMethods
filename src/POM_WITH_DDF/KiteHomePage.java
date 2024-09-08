package POM_WITH_DDF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//regular class--> pom class 3
public class KiteHomePage {
	// 1. declaration
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userID;

	// 2. initialization
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//3. usage
	public void verifyUserId(String expUserID)
	{
		String actUserID = userID.getText();
		if(actUserID.equals(expUserID)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	
}
