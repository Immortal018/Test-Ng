package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	public void openbr() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "dp")
	public void login(String email,String pwd) throws InterruptedException {
		
			
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		boolean stat=driver.findElement(By.xpath("(//img[@src='/css/admin/images/logo.png'])[2]")).isDisplayed();
		
		if(stat==true) {
			System.out.println("Valid Credentials");
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		
	}
	
	@DataProvider(name="dp")
	
	Object[][] logindata()
	{
		
			
	Object data [][]	={
			{"kdark516@gmail.com","test"},
			{"abc@gmail.com","tet123"},
			{"admin@yourstore.com","admin"}
	};
		
		return data;
	}

}