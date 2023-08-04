package Ivory_AppRegistration_pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LandingPage  {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement signUp=driver.findElement(By.cssSelector("a[href='/register']"));
	
	@FindBy(css="a[href='/register']")
	WebElement signUpbtn;


public void loginScreen()
{
	
	signUpbtn.click();
}
}


	
	