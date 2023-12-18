package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleandUrlEfficientcode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the expected browser: ");
		Scanner sc=new Scanner(System.in);
		String browser = sc.next();

		if(browser.equalsIgnoreCase("chrome")) {
			ChromeDriver c=new ChromeDriver();
			test(c);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			FirefoxDriver f=new FirefoxDriver();
			test(f);
		}
		else {
			System.out.println("Enter valid browser chrome or firefox");
		}
	}

	private static void test(WebDriver webdriver) {
		// TODO Auto-generated method stub
		webdriver.get("https://www.facebook.com");
		System.out.println("Current title is: "+webdriver.getTitle());
		System.out.println("Current URL is: "+webdriver.getCurrentUrl());
	}
	

}
