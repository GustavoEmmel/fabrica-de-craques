package org.dbserver.ecommerce.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPoint {
	
	private WebDriver driver;
	
	public VerificationPoint(WebDriver driver){
		this.driver =  driver;
	}
	
	public boolean contains(String value){
		return driver.findElement(By.xpath("//*[contains(text(), '" + value + "')]")).isDisplayed();
	}
}
