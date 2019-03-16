package org.testing.testscripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TC1 {
	
	
	public WebDriver driver;
 
 
  
  @BeforeMethod
  
	  
	 public void browserlaunch()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.manage().window().maximize();
			
		}
		
	@Test
	public void login() throws InterruptedException
	{
		
		WebElement signin=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signin.click();
		WebElement email=driver.findElement(By.xpath("//*[@id='identifierId']"));
		email.sendKeys("9reenadahiya");
		WebElement next=driver.findElement(By.xpath("//*[@class='RveJvd snByac']"));
		next.click();
		Thread.sleep(5000);
		WebElement passw=driver.findElement(By.name("password"));
		passw.sendKeys("9@78802934853");
		WebElement next2=driver.findElement(By.xpath("//*[@id=\"passwordNext\"]"));
		next2.click();
		
	}
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}

