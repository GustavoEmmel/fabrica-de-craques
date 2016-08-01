package org.dbserver.ecommerce.testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Step00_VirtueMart_Home_ClickInCreateAnAccount {
	
	public WebDriver driver = new FirefoxDriver();
	
	@Test
	public void testMain() {
		driver.get("http://demo.virtuemart.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[contains(text(), 'Create an account')]")).click();
	}
}
