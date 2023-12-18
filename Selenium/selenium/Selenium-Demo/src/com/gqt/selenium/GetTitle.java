package com.gqt.selenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the expected title: ");
        Scanner sc=new Scanner(System.in);
    	String title = sc.next();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String atitle = driver.getTitle();
	
		System.out.println("The title from web page is: "+atitle);
		if(title.equalsIgnoreCase(atitle)) {
			System.out.println("The test case is PASS");
		}
		else {
			System.out.println("The test case is FAILE");
		}
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}

}
