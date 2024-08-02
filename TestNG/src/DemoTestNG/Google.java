package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Google {
	
	public WebDriver driver;
	 @Test(invocationCount=5)
	  public void createuser() throws InterruptedException {
		 
			driver = new EdgeDriver();
		
		  driver.get("https://www.google.co.in/");
		  driver.findElement(By.id("APjFqb")).sendKeys("f1");
		  driver.findElement(By.xpath("//img[@alt='Google']")).click();
		  driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		  System.out.println("Title of the page is:"+driver.getTitle());
		  Thread.sleep(3000);
		  driver.close();
		  }
	 
	}


