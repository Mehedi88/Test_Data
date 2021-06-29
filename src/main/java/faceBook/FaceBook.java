package faceBook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBook {
	
	@Test (dataProvider = "testdata")
	public void t(String myName, String myPass) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Dev\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.NANOSECONDS);
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(myName);
		driver.findElement(By.id("pass")).sendKeys(myPass);
		
		System.out.println("First Name - "+myName+ "Last Name  -" +myPass    );
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);	
		}
	
	@DataProvider(name = "testdata")
	public String [][] d(){
		
		String [][] data1 = new String [3][2];
		data1[0][0] = "tushar.7588@yahoo.com";
		data1[0][1] = "777777777";
		
		data1[1][0] = "Tanisha@gmail.com";
		data1[1][1] = "345678";
		
		data1[2][0] = "jami@yahoo.com";
		data1[2][1] = "85645358";
			
		return data1;
		
	}

}
