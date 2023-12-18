package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","C:\\Users\\91817\\Desktop\\Selenium softwares\\geckodriver.exe");
        FirefoxDriver driver1=new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91817\\Desktop\\Selenium softwares\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver2=new ChromeDriver();
	}

}
