package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Jtest {
	
	public WebDriver ree;
	
	
	
@Before
	public void browserlaunch()
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	ree=new ChromeDriver();
	ree.get("https://www.facebook.com/");
	System.out.println("before");
	ree.getTitle();
	
	System.out.println(ree.getTitle());
	ree.manage().window().maximize();
	
	}
@Test
public void signup()
{
	
	System.out.println("test");
	WebElement user=ree.findElement(By.cssSelector("input#u_0_j"));
	user.sendKeys("ABC");

	ree.findElement(By.cssSelector("input#u_0_l")).sendKeys("ee");
	WebElement user1=ree.findElement(By.id("u_0_o"));
	user1.sendKeys("abc@g.co");
	ree.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@g.co");
	ree.findElement(By.id("u_0_v")).sendKeys("1234");
	ree.findElement(By.id("day")).sendKeys("123");

	 WebElement day=ree.findElement(By.cssSelector("select#day"));
	 Select se=new Select(day);
	 se.selectByIndex(7);
	 WebElement month= ree.findElement(By.name("birthday_month"));
		
	 Select w=new Select(month);
	 w.selectByVisibleText("Nov");
	 
	 WebElement year= ree.findElement(By.name("birthday_year"));
	 Select w1=new Select(year);
	 w1.selectByVisibleText("2013");
	
	
	 ree.findElement(By.id("u_0_9"));
		WebElement w2=ree.findElement(By.id("u_0_a"));
		w2.click();
		ree.findElement(By.name("websubmit")).click();
		
		  

		
		  
		  WebElement a=ree.findElement(By.id("u_0_2"));
			
		Actions ac=new Actions(ree);
		ac.keyDown(Keys.CONTROL).click(a).keyUp(Keys.CONTROL).build().perform();
}
@After
public void close()
{

	ree.close();
	System.out.println("after");
}

}
