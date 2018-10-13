package com.prithi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ups {

	public static void main(String[] args) {
	
		System.setProperty("webdrivr.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.ups.com/us/en/global.page");
		driver1.close();
		driver1 = new FirefoxDriver();
		driver1.get("https://www.ups.com/us/en/global.page");
		driver1.close();
		
		
		
		

	}

}
