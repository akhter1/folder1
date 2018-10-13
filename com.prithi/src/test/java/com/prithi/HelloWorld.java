 package com.prithi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();

System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRITHI\\eclipse-workspace\\com.prithi\\chromedriver.exe");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

driver.get("http://www.yahoo.com");

driver.findElement(By.xpath("//*[contains(text(),'Sign in')][1]")).click();
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Prithi_akhter@yahoo.com");
driver.findElement(By.xpath("//input[@id='login-signin']")).click();
driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Payelopi");
driver.findElement(By.xpath("//button[@id='login-signin']")).click(); 
driver.close();


		
	}  

}
