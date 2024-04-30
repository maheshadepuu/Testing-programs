package com.hrms.LIB;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrm.objects.ObjectsInfo;

public class General extends ObjectsInfo{
	public void Setup() {
		driver=new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		//implicit wait synchronization
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Application Sucessfully Opened");		
	}	
	public void adminLogin() throws InterruptedException {
		driver.findElement(By.name(txt_username)).sendKeys(uid);
		driver.findElement(By.name(txt_password)).sendKeys(pwd);
		driver.findElement(By.xpath(btnlogin_type)).click();
		System.out.println("Admin Login Successfull");
		Thread.sleep(5000);
	}
	public void addEmp() throws InterruptedException {
		System.out.println("Added New Employee");
		Thread.sleep(5000);
	}
	public void delEmp() throws InterruptedException {
		System.out.println("Deleted Employee");
		Thread.sleep(5000);
	}
	public void adminLogout() throws InterruptedException {
		driver.findElement(By.xpath(alt_profile)).click();
	 	Thread.sleep(5000);
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Admin Logout Successfull");
					}
	public void TearDown() {
		driver.quit();
		System.out.println("Application Browser are Closed");		
	}
	
		
	}


