package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
	
	@Test
	
	public void DragDropTest() {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); // open browser

		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();
		
		WebElement sp = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement target = driver.findElement(By.id("bank"));
		
		Actions act  = new Actions(driver);
		
		act.dragAndDrop(sp, target).perform();
		
		driver.quit();
		
		
	}

}
