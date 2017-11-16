package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FirstDemo 
{
	WebDriver driver;
	@Test
	public void testLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\@PT@\\chromedriver.exe");
		//driver =new FirefoxDriver();
		//Thread.sleep(500);
		driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://cloudlexqaapi.eastus.cloudapp.azure.com:84");
		driver.get("https://cloudlexqadb1.eastus.cloudapp.azure.com/#/matter-documents/21985");
		Thread.sleep(2000);
		
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("partner");

		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Lexvia#2015");
		driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div[2]/div/div[2]/form/input[1]")).click();
		
		System.out.println("priyanka");
	}
}
