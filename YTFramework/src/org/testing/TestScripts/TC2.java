package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 extends Base{
	

	@Test
	public void ytc1() throws InterruptedException
	{
		login l = new login(driver, pr);
		l.signin("user", "password");
		
		
		WebElement subcription = driver.findElement(By.xpath(pr.getProperty("subcription")));
		subcription.click();
		
		System.out.println("clicked on subcription button");
	}
	
	
}

