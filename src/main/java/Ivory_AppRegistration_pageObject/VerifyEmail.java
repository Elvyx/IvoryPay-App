package Ivory_AppRegistration_pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyEmail {
	
WebDriver driver;
	
	public VerifyEmail (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//driver.findElement(By.id("login")).sendKeys("mlther");
	
	@FindBy(id="login")
	WebElement emailCredentials;
	
	//driver.findElement(By.id("login")).sendKeys(Keys.RETURN);
	@FindBy(id="login")
	WebElement gotoInbox;
	
	
	public void verifyEmail(String emailcredential)
	{
		
		emailCredentials.sendKeys(emailcredential);
		gotoInbox.sendKeys(Keys.RETURN);
	
}
}