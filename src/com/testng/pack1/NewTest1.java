package com.testng.pack1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(invocationCount=10)
  public void f() throws IOException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  driver.get("https://mail.google.com");
	 send(driver, driver.findElement(By.xpath("//input[@id='identifierId']")),20);
	 Clickon(driver, driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")),20);

	  
  }
 public static void send(WebDriver driver , WebElement locator , int timeout) {
		  
		  new WebDriverWait(driver ,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
          
          locator.sendKeys("rvprasadchengi@gmail.com");
        }  
 public static void Clickon(WebDriver driver , WebElement locator , int timeout) {
	  
	  new WebDriverWait(driver ,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
     
     locator.click();;
   }  
 
	  
  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
  


