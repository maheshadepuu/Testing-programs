package basic.concepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryToursLoginTest {

	public static void main(String[] args) {
	
		//to read user credentials using scanner class
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		String uid=sc.nextLine();
		System.out.println("Enter pasword");
		String pwd=sc.nextLine();
		
		//for scanner class warning close
		sc.close();
		
		//to intilize browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/tes"
				+ "t/newtours/");
		driver.manage().window().maximize();
		
		//to perform login operations
		
		driver.findElement(By.name("userName")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		
		//to read page title 
		
		String pgTitle=driver.getTitle();
		System.out.println(pgTitle);
		
		//comapre
		
		if(pgTitle.equals("Login: Mercury Tours"))
		{
				System.out.println("Succesful login operation");
	}
		else  
		{
		System.out.println("Unsucessful login operaton");
	}
	
	}
}
