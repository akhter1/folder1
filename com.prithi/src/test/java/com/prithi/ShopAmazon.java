package com.prithi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopAmazon {

	public static void main(String[] args) {
		

   WebDriver driver = new ChromeDriver();
   
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHI\\eclipse-workspace\\com.prithi\\chromedriver.exe");
   
   driver.get("https://www.amazon.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   driver.close();
   
 




	}

		
	}


