package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/eclipse/Selenium/Selenium-Demo/src/Login.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("rangappa@gqt.cvom");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("gqt123456");
	}
}
