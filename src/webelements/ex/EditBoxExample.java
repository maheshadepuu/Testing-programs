package webelements.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class EditBoxExample {
	public static void main(String[] args) throws InterruptedException {
		//initialize the browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		//create object for web element
		WebElement uidobj=driver.findElement(By.id("username"));
		WebElement uidobj2=driver.findElement(By.id("password"));
		uidobj2.sendKeys("Mahi");
		//to focus on 'username' editbox
		uidobj.click();
		//to enter sendKeys values
		uidobj.sendKeys("Mahesh");
		//to pause execution
		Thread.sleep(3000);
		uidobj.sendKeys("Chinna");
		//to read data from username editbox attitube values
		String uid=uidobj.getAttribute("value");
		//to comapre the values 
		if(uid.equals("MaheshChinna")) {	
		System.out.println("sendKeys()-method will not overwrite the exixting values");
		}
		else {
			System.out.println("sendKeys()-method will overwrite the exixting values");
		}
	}
	
	}
