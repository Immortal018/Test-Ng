package DemoTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Methods {
	  WebDriver driver;
	  
  @Parameters({"browser"})	 
  @Test(invocationCount=5)
  public void createuser(String browser) throws InterruptedException {
	  if(browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
		
	 } 
	 else if (browser.equalsIgnoreCase("chrome")) {
		 driver = new ChromeDriver();
		
	}
	  
	  driver.get("https://www.google.co.in/");
	  driver.findElement(By.id("APjFqb")).sendKeys("f1");
	  driver.findElement(By.xpath("//img[@alt='Google']")).click();
	  driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	  System.out.println("Title of the page is:"+driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Google");
	  Thread.sleep(3000);
	  driver.close();
	  }
 
}
