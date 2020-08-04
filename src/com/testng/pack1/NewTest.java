package com.testng.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class NewTest {
  
	 @Test
		 public void fop() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rvpra\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.get("https://www.gradsiren.co.in/");
	
  
  NewTest.Clickon(driver, driver.findElement(By.linkText("LOG IN")), 15);
  NewTest.Enteron(driver, driver.findElement(By.xpath("//*[@id='userName']")), 15);
  NewTest.Enteron1(driver, driver.findElement(By.xpath("//*[@id='loginPassword']")), 15);
  NewTest.Clickon(driver, driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/public[1]/login[1]/\"\n" + 
  		"	  		+ \"div[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/div[2]/form[1]/button[1]")), 15);
                
	 }
	  public static void Clickon(WebDriver driver , WebElement locator , int timeout) {
		  
		  new WebDriverWait(driver ,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
          
          locator.click();
        }   
	  
 public static void Enteron(WebDriver driver , WebElement locator , int timeout) {
		  
		  new WebDriverWait(driver ,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
          
          locator.sendKeys("wwwvaraprasad33@gmail.com");
	  }   
 
 public static void Enteron1(WebDriver driver , WebElement locator , int timeout) {
	  
	  new WebDriverWait(driver ,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
     
     locator.sendKeys("Vara@214");
 }  
 
}
			 
  

