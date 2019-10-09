package org.testing.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	ChromeDriver driver;
	Properties pr;
	
	public login(ChromeDriver driver,Properties pr)
	
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void signin(String user,String password)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement login = driver.findElement(By.xpath(pr.getProperty("login")));
		login.click();
		System.out.println("login started");
		WebElement email = driver.findElement(By.xpath(pr.getProperty("email")));
		email.sendKeys("rahultaak06@gmail.com");
		
		WebElement next = driver.findElement(By.xpath(pr.getProperty("next")));
		next.click();
		
		
		WebElement password1 = driver.findElement(By.cssSelector(pr.getProperty("password")));
		password1.sendKeys("8800787678");
		
		

		WebElement next2 = driver.findElement(By.xpath(pr.getProperty("next2")));
		next2.click();
		System.out.println("logged in successfully");
		
	}

}
