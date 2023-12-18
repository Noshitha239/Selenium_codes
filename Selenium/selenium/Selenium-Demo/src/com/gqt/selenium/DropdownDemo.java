package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com/register");
		
		WebElement monthdd = driver.findElement(By.id("dob_m"));
		
		Select Sel = new Select(monthdd);
		Thread.sleep(2000);
		Sel.selectByIndex(2);
		Thread.sleep(2000);
		Sel.selectByValue("08");
		Thread.sleep(2000);
		Sel.selectByVisibleText("Dec");
		Thread.sleep(2000);
		driver.close();
	}

}
