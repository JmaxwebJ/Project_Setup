package selenium.methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;


import page.objects.SignInOR;

public class SignInMethods {
	
	final static Logger logger = LogManager.getLogger(SignInMethods.class);

	public static WebDriver driver;
	
	public static void launchBrowser(String systemURL, WebDriver driver)
	
	{
		try {

			driver.get(systemURL);
			
			}
			catch (NoSuchElementException e) 
			{
				logger.info("URL is taking time to load", e);
			}
		logger.info("Browser Launched successfully");
	}
	
	
	public static void entersUsername(String Username, WebDriver driver)
	{
		try {
			
			driver.findElement(SignInOR.USERNAME1).sendKeys(Username);			
		} catch (NoSuchWindowException e) {
			logger.info("Not able to locate UserName ", e);
		} catch (TimeoutException e) {
			logger.info("TimeoutException in UserName", e);
		}
		logger.info("Values are enetered inside Username");
	}

	public static void entersPassword(String password, WebDriver driver) {
		try {
			
			driver.findElement(SignInOR.PASSWORD1).sendKeys(password);			
		} catch (NoSuchWindowException e) {
			logger.info("Not able to locate password ", e);
		} catch (TimeoutException e) {
			logger.info("TimeoutException in password", e);
		}
		logger.info("Values are enetered inside password");
	}


	public static void clickLogin(WebDriver driver) {
		try {
			
			driver.findElement(SignInOR.LOGINBUTTON).click();			
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate LOGIN button on login page" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}


	public static void verifyOutput(WebDriver driver) throws InterruptedException {
		
		
		Thread.sleep(5000);

		String output = driver.getCurrentUrl();
		if(output.contains("profile"))
		{
			System.out.println("Get URL "+output);
			System.out.println("User logged in successfully");
		}
		else {
			System.out.println("Get URL2 "+output);
			System.out.println("User not logged in ");
		}
		
	}
	
	
	
}
