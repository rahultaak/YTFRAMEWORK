package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.Video_play;
import org.testing.pages.login;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 extends Base {
	
	

	
	@Test
	public void ytc2() throws InterruptedException
	{
		login l = new login(driver, pr);
		l.signin("user", "password");
		Video_play v= new Video_play(driver, pr);
		v.video_pl();
		
		
		
		WebElement subscribe = driver.findElement(By.xpath(pr.getProperty("subscribe")));
		  
		subscribe.click();
		System.out.println("clicked on subscribe button");

}
	
	

}
