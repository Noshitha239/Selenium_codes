package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagesDemo {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/eclipse/Selenium/Selenium-Demo/src/Page1.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Go to page2")).click();
		Thread.sleep(2000);
		//driver.close(); // closed only the tab where driver is pointing to
		driver.quit(); // closes all tabs in the browser where driver is pointing to

	}

}
