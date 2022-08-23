package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;

public class Test_002 extends BaseClass {
	@Test
	public void TC_0001() throws Exception {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		  login.getEmailid().sendKeys("Ramprasad@gmail.com");
		  login.getPassword().sendKeys("123456");
		  login.getLogin().click();
		  Thread.sleep(5000);
	}
}
