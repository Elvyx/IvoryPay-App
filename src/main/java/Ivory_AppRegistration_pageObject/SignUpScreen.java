package Ivory_AppRegistration_pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignUpScreen {

	
WebDriver driver;
	
	public SignUpScreen (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//WebElement firstName=driver.findElement(By.xpath("//input[@id='register_firstName']"));
	
	@FindBy(xpath="//input[@id='register_firstName']")
	WebElement firstName;
	
	//driver.findElement(By.cssSelector("#register_lastName"))
	@FindBy(css="#register_lastName")
	WebElement lastName;
	
	//driver.findElement(By.cssSelector("#register_email")).sendKeys("mlther@yopmail.com");
	@FindBy(css="#register_email")
	WebElement userEmail;
	
	//driver.findElement(By.id("register_businessName")).sendKeys("picano Services");
	
	@FindBy(id="register_businessName")
	WebElement businessName;
	
	//driver.findElement(By.cssSelector("#rc_select_0")).click();
	
	@FindBy(css="#rc_select_0")
	WebElement countryField;
	
	//driver.findElement(By.xpath("//div[contains(text(),'Nigeria')]")).click();
	@FindBy(xpath="//div[contains(text(),'Nigeria')]")
	WebElement countryName;
	
	//driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8175777712");
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement phoneNumber;
	
	//driver.findElement(By.id("register_password")).sendKeys("Password123*");
	@FindBy(id="register_password")
	WebElement createPassword;
	
	//driver.findElement(By.xpath("(//*[name()='svg'])[2]")).click();
	@FindBy(xpath="(//*[name()='svg'])[2]")
	WebElement unmaskPassword;
	
	//driver.findElement(By.id("register_confirmPassword")).sendKeys("Password123*");
	@FindBy(id="register_confirmPassword")
	WebElement confirmPassword;
	
	//driver.findElement(By.xpath("//span[@aria-label='eye']//*[name()='svg']")).click();
	@FindBy(xpath="//span[@aria-label='eye']//*[name()='svg']")
	WebElement viewConfirmPassword;
	
	//driver.findElement(By.xpath("(//input[@value='starter'])[1]")).click()
	
	@FindBy(xpath="(//input[@value='starter'])[1]")
	WebElement businessType;
	
	//driver.findElement(By.xpath("//input[@value='false']")).click();
	@FindBy(xpath="//input[@value='false']")
	WebElement userType;
	
	//driver.findElement(By.cssSelector("div[class='mb-8'] input[type='checkbox']")).click();
	
	@FindBy(css="div[class='mb-8'] input[type='checkbox']")
	WebElement acceptTC;
	
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitReg;
	
	
	
	
	
	public void userReg(String firstname, String lastname, String Email, String businessname, String phonenumber, String Password,String confirmpassword)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		userEmail.sendKeys(Email);
		businessName.sendKeys(businessname);
		countryField.click();
		countryName.click();
		phoneNumber.sendKeys(phonenumber);
		createPassword.sendKeys(Password);
		unmaskPassword.click();
		confirmPassword.sendKeys(confirmpassword);
		viewConfirmPassword.click();
		JavascriptExecutor js=  (JavascriptExecutor) driver;	
		js.executeScript("window.scrollBy(0, 500)");
		businessType.click();
		userType.click();
		acceptTC.click();
		submitReg.click();
		
	}

}


