package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Multiple {
	
	WebDriver driver;
	
	@BeforeClass
	public void Initalization() throws InterruptedException
	{
		 driver = new ChromeDriver(); //open browser
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		//Thread.sleep(12000);
	}
	
	@Test(priority=1)
	
	public void MouseHovering() throws InterruptedException
	{
		Actions act = new Actions(driver);
		
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Your Account']")).click();
		
	}
	
	
	@Test(priority=2)
	public void DropDown()
	{
		
		
		WebElement dropdownoption = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(dropdownoption);
		
		sel.selectByIndex(10); //we can select option with index  //least option is index
		
		sel.selectByValue("search-alias=automotive"); // second best option is value
		
		sel.selectByVisibleText("Health & Personal Care");
		
		
	}
	
	
	
	
	
	@AfterClass
	public void CleanUp()
	{
		driver.quit();// browser close here
	}

}
