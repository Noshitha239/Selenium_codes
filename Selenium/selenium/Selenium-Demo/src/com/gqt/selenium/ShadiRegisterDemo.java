package com.gqt.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShadiRegisterDemo {

	public static void main(String[] args) throws Exception {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shadi.com/register");
		Thread.sleep(2000);
		
		driver.findElement(By.id("first_name")).sendKeys("Salman");
		driver.findElement(By.id("last_name")).sendKeys("Khan");
		driver.findElement(By.id("rblGender_0")).click();
		Thread.sleep(2000);
		
		WebElement monthdd = driver.findElement(By.id("dob_m"));
		Select sm = new Select(monthdd);
		sm.selectByIndex(12);
		Thread.sleep(2000);
		
		WebElement datedd = driver.findElement(By.id("dob_d"));
		Select sd = new Select(datedd);
		sd.selectByVisibleText("27");
		Thread.sleep(2000);
		
		WebElement yeardd = driver.findElement(By.id("dob_y"));
		Select sy = new Select(yeardd);
		sy.selectByValue("1965");
		Thread.sleep(2000);
		
		WebElement religiondd = driver.findElement(By.id("ddlReligion"));
		Select sr = new Select(religiondd);
		sr.selectByVisibleText("Islam");
		Thread.sleep(2000);
		
		WebElement educationdd = driver.findElement(By.name("education"));
		Select se = new Select(educationdd);
		se.selectByValue("5");
		Thread.sleep(2000);
		
		WebElement countrydd = driver.findElement(By.id("ddlCountry"));
		Select sc = new Select(countrydd);
		sc.selectByIndex(4);
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtEmailAddress")).sendKeys("sallustillsingle@khan.com");
		driver.findElement(By.id("txtPassword")).sendKeys("AishuKatrinaJack");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		driver.close();

	}

}
