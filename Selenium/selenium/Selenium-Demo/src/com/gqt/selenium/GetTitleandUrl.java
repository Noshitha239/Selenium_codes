package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleandUrl {

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


	private static void test(FirefoxDriver driver) {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com");
		System.out.println("Current title is: "+driver.getTitle());
		System.out.println("Current title is: "+driver.getCurrentUrl());
	}
	private static void test(ChromeDriver driver) {
		// TODO Auto-generated method stub
		driver.get("https://www.facebook.com");
		System.out.println("Current title is: "+driver.getTitle());
		System.out.println("Current title is: "+driver.getCurrentUrl());
	}


}
