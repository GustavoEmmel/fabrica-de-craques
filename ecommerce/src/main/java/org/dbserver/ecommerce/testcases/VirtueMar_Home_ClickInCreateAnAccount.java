package org.dbserver.ecommerce.testcases;

import org.dbserver.ecommerce.appobjects.HomeAppObject;
import org.dbserver.ecommerce.framework.BrowserUtils;
import org.dbserver.ecommerce.framework.ScreenShot;
import org.dbserver.ecommerce.framework.VerificationPoint;
import org.dbserver.ecommerce.tasks.UserRegistrationTask;
import org.eclipse.jetty.util.log.Logger;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VirtueMar_Home_ClickInCreateAnAccount {

	private WebDriver driver 							= BrowserUtils.ChromeDriver();
	private HomeAppObject home 							= new HomeAppObject(driver);
	private VerificationPoint verification 				= new VerificationPoint(driver);
	private UserRegistrationTask user					= new UserRegistrationTask(driver);
	
	private static ExtentReports report					= new ExtentReports("B:/dbserver/workspace/ecommerce/reports/Report.html");
	private static ExtentTest logger					= report.startTest("New User Registration");
	
	@Test
	public void testMain(){
		driver.get("http://demo.virtuemart.net/");
		driver.manage().window().maximize();

		logger.log(LogStatus.INFO, "The website has started.", logger.addScreenCapture(ScreenShot.capture(driver)));
		
		home.getCreateAnAccountButton().click();
		user.toRegister();
		
		if(verification.contains("The passwords you entered do not match. Please enter your desired password in the password field and confirm your entry by entering it in the confirm password field.")){
			logger.log(LogStatus.PASS, "Step Passed.", logger.addScreenCapture(ScreenShot.capture(driver)));
		} else {
			logger.log(LogStatus.FAIL, "Step Failed.", logger.addScreenCapture(ScreenShot.capture(driver)));
		}
						
	}
	
	@AfterClass
	public static void tearDownTest(){
		report.endTest(logger);
		report.flush();
	}
	
	
}
