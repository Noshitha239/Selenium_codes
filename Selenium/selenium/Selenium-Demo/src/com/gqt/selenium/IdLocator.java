package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com");
		WebElement emtf=driver.findElement(By.id("email"));
		emtf.sendKeys("vnoshitha@gmail.com");
		WebElement pstf=driver.findElement(By.id("pass"));
		pstf.sendKeys("Navya@123");
	}
	

}
