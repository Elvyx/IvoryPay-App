import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Ivory_AppRegistration_pageObject.LandingPage;
import Ivory_AppRegistration_pageObject.SignUpScreen;
import Ivory_AppRegistration_pageObject.VerifyEmail;
import io.github.bonigarcia.wdm.WebDriverManager;

public class successfulRegistrationFramework {
	
	@Test

	public  void signup() throws InterruptedException {
		// TODO Auto-generated method stub

		{
	
    WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://qa.d1ainun5cjrnni.amplifyapp.com");
	LandingPage landingPage= new LandingPage(driver);
	landingPage.loginScreen();
	SignUpScreen signup= new SignUpScreen(driver);
	signup.userReg("Sucre", "Blaq", "sucreb@yopmail.com", "FM and Sons Ltd", "712222222514", "Password123*", "Password123*");
	
	
	
	String vm=driver.findElement(By.cssSelector("div[class='mb-4'] div")).getText();
	Assert.assertTrue(vm.equalsIgnoreCase("A verification Link has been sent to your email. Verify to log in"));
	System.out.println(vm);
	
	driver.switchTo().window(driver.getWindowHandle());
	driver.get("https://yopmail.com/");
	
	VerifyEmail verifyEmail=new VerifyEmail(driver);
	verifyEmail.verifyEmail("sucreb");
	
	
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   // WebElement verificationEmail = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Verify your email address')]")));
   // verificationEmail.click();
    
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    //driver.findElement(By.partialLinkText("Go To Dashboard")).click();
	
	
	driver.close();
			
	
}

}
}
