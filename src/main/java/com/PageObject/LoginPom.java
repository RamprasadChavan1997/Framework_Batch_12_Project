package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement emailid;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement login;

	public WebElement getEmailid() {
		return emailid;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLogin() {
		return login;
	}

}


