package org.dbserver.ecommerce.tasks;

import org.dbserver.ecommerce.appobjects.UserRegistrationAppObject;
import org.openqa.selenium.WebDriver;

public class UserRegistrationTask {
	private WebDriver driver;
	
	public UserRegistrationTask(WebDriver driver){
		this.driver = driver;
	}
	
	public void toRegister(){
		
		UserRegistrationAppObject registration 		= new UserRegistrationAppObject(driver);
	
		registration.getNameTextField().sendKeys("Gustavo Reichelt");
		registration.getUsernameTextField().sendKeys("gustavo2");
		registration.getPasswordTextField().sendKeys("123456");
		registration.getConfirmPasswordTextField().sendKeys("1234567");
		registration.getEmailTextField().sendKeys("gremmel@gmail.com");
		registration.getConfirmEmailTextField().sendKeys("gremmel@gmail.com");
		registration.getRegisterButton().click();
		
		
	}

}
