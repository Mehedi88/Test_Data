package faceBook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amzon {
	
	@Test (dataProvider = "test")
	public void t(String myid, String pass) {
		System.setProperty("webdriver.chrome.driver","C:\\Dev\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");

		driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']")).click();
		driver.findElement(By.id("ap_email")).sendKeys(myid);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(pass);
		driver.findElement(By.id("signInSubmit")).click();
	
		driver.quit();
	}
	
	
	
	@DataProvider(name = "test")
	public String  [][] d (){
		
		String data [][] = new String [1][2];
		data[0][0] = "tushar.7588@yahoo.com";
		data[0][1] = "Bangladesh1";
		
		return data;
		
	}
	
	
   
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	
	
		
		
		
		
		
		
		
		
		
	
	


