package org.testing.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_play {
	
	ChromeDriver driver;
	Properties pr;
	
	public Video_play (ChromeDriver driver,Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
	}

	
	public void video_pl() throws InterruptedException
	{
		List<WebElement> li = driver.findElements(By.id(pr.getProperty("li")));
		li.get(1).click();
		
		Thread.sleep(10000);
	}


}
