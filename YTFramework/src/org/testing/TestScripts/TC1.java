package org.testing.TestScripts;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.login;
import org.testing.utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 extends Base{
	
	@Test
	public void ytc1() throws InterruptedException, IOException
	{
		login l = new login(driver, pr);
		l.signin("user", "password");
		
		Thread.sleep(3000);
		
		Screenshot.Take_Screenshot(driver, "C:\\Users\\RAHUL TAAK\\Desktop\\login.png");
		
		
		System.out.println("login screenshot taken successfully");
		
		
		
		WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
		trending.click();
		
		Screenshot.Take_Screenshot(driver, "C:\\Users\\RAHUL TAAK\\Desktop\\tending.png");
		
		System.out.println("trending screen shot taken successfully");
		
		System.out.println("clicked on tranding button");
	}
	
}
