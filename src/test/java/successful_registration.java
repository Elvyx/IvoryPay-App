import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Ivory_AppRegistration_pageObject.LandingPage;
import Ivory_AppRegistration_pageObject.SignUpScreen;
import Ivory_AppRegistration_pageObject.VerifyEmail;
import io.github.bonigarcia.wdm.WebDriverManager;

public class successful_registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		{
	
    WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://qa.d1ainun5cjrnni.amplifyapp.com");
	driver.findElement(By.cssSelector("a[href='/register']")).click();

	driver.findElement(By.xpath("//input[@id='register_firstName']")).sendKeys("Louis");
	driver.findElement(By.cssSelector("#register_lastName")).sendKeys("Steven");
	driver.findElement(By.cssSelector("#register_email")).sendKeys("louis@yopmail.com");
	driver.findElement(By.id("register_businessName")).sendKeys("Lois Luxury Homes");
	driver.findElement(By.cssSelector("#rc_select_0")).click();
	driver.findElement(By.xpath("//div[contains(text(),'Nigeria')]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8177707820");
	driver.findElement(By.id("register_password")).sendKeys("Password123*");
	driver.findElement(By.xpath("(//*[name()='svg'])[2]")).click();
	driver.findElement(By.id("register_confirmPassword")).sendKeys("Password123*");
	driver.findElement(By.xpath("//span[@aria-label='eye']//*[name()='svg']")).click();
	driver.findElement(By.xpath("(//input[@value='starter'])[1]")).click();
	JavascriptExecutor js=  (JavascriptExecutor) driver;	
	js.executeScript("window.scrollBy(0, 500)");
	driver.findElement(By.xpath("//input[@value='false']")).click();
	driver.findElement(By.cssSelector("div[class='mb-8'] input[type='checkbox']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	String vm=driver.findElement(By.cssSelector("div[class='mb-4'] div")).getText();
	Assert.assertTrue(vm.equalsIgnoreCase("A verification Link has been sent to your email. Verify to log in"));
	System.out.println(vm);
	

	
	//Handle Alert
	//Alert alert=driver.switchTo().alert();
	//System.out.println(alert);
	//alert.dismiss();
	
	
	driver.switchTo().newWindow(WindowType.TAB);
	
	Set<String> handles=driver.getWindowHandles();
	Iterator<String>it=handles.iterator();
	
	String parentwindowid=it.next();
	String childwindowid=it.next();
	
	driver.switchTo().window(childwindowid);

	
	driver.get("https://yopmail.com/");
	driver.findElement(By.id("login")).sendKeys("louis");
	driver.findElement(By.id("login")).sendKeys(Keys.RETURN);
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    WebElement verificationEmail = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Verify your email address")));
    verificationEmail.click();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.partialLinkText("Go To Dashboard")).click();
	
   
   driver.close();
			
	
}

}
}
