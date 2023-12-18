package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximisedWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://gqtech.in/");
		System.out.println("Current title is: "+driver.getTitle());
		System.out.println("Current URL is: "+driver.getCurrentUrl());
	}
	

}
