package org.dbserver.ecommerce.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserRegistrationAppObject {
	private WebDriver driver;
	
	public UserRegistrationAppObject(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getNameTextField(){
		return this.driver.findElement(By.id("jform_name"));
	}
	
	public WebElement getUsernameTextField(){
		return this.driver.findElement(By.id("jform_username"));
	}
	
	public WebElement getPasswordTextField(){
		return this.driver.findElement(By.id("jform_password1"));
	}
	
	public WebElement getConfirmPasswordTextField(){
		return this.driver.findElement(By.id("jform_password2"));
	}
	
	public WebElement getEmailTextField(){
		return this.driver.findElement(By.id("jform_email1"));
	}
	
	public WebElement getConfirmEmailTextField(){
		return this.driver.findElement(By.id("jform_email2"));
	}

	public WebElement getRegisterButton(){
		return this.driver.findElement(By.xpath("//*[@type = 'submit' and text() = 'Register']"));
	}
	
	public WebElement getErrorMensage(){
		return this.driver.findElement(By.xpath("//*[contains(text(), 'The passwords you entered do not match. Please enter your desired password in the password field and confirm your entry by entering it in the confirm password field.')]"));
	}
	
}
