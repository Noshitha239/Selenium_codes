package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		String cUrl = driver.getCurrentUrl();
		System.out.println("The Current URL is : "+cUrl);
	}

}
