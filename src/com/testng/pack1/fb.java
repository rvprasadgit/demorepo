package com.testng.pack1;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fb {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.get("https://www.facebook.com/");
		   
		  
		
		  
		  
			//Thread.sleep(1000);
			  driver.findElement(By.name("email"))
			  .sendKeys("prasadrvprasad214@gmail.com");
			driver.findElement(By.xpath("//input[@id='pass']"))
			  .sendKeys("Shivaji");
			 driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
			 
			 
		   
	}

}
