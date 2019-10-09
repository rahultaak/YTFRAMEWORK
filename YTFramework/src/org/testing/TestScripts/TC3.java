package org.testing.TestScripts;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.base.Base;
import org.testing.pages.Video_play;
import org.testing.pages.login;
import org.testing.utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC3 extends Base{
	
	


@Test
public void ytc2() throws InterruptedException, IOException
{
	login l = new login(driver, pr);
	l.signin("user", "password");
	Video_play v= new Video_play(driver, pr);
	v.video_pl();
	
	
	Screenshot.Take_Screenshot(driver, "C:\\Users\\RAHUL TAAK\\Desktop\\videoplay.png");
	System.out.println("video play screenshot taken successfully");
	
	
	
	

//WebElement like = driver.findElement(By.xpath(pr.getProperty("like3")));
	
	//WebElement sample=driver.findElements(By.xpath(pr.getProper'ty("like3")));
	WebElement sample=driver.findElement(By.xpath(pr.getProperty("like3")));
	System.out.println(sample);
	sample.click();
	System.out.println("end");
	
	//WebElement like_selector=driver.findElement(By.xpath("//ytd-video-primary-info-renderer/div/div/div[3]/div/ytd-menu-renderer/div/ytd-toggle-button-renderer[1]/a/yt-icon-button/button"));
	//like_selector.click();
	System.out.println("clicked on like button");
	
	
	
}


}
