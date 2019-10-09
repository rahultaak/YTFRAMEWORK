package org.testing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	 public ChromeDriver driver;
	 public Properties pr;
	@BeforeMethod
	public void browserlounch() throws IOException
	{
	    File f = new File("E:\\selenium\\YTFramework\\obj.properties");
	    FileInputStream fi = new FileInputStream(f);
	     pr=new Properties();
	    pr.load(fi);
	    
		System.setProperty("webdriver.chrome.driver", "E:\\testing software\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
	}
	
	@AfterMethod
	public void browserclose()
	{
		driver.close();
	}


}
