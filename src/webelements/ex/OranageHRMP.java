package webelements.ex;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class OranageHRMP {

	public static void main(String[] args) throws IOException  {
		
		//Scanner Class Creation And Variables Given
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter UserName");
		String uid=sc.nextLine();
		System.out.println("Enter Password");
		String pwd=sc.nextLine();
		sc.close();
		//Initialization browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//login operations
		//Syncronization implicity
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		//Date
		Date dt=new Date();
		DateFormat df=new SimpleDateFormat("dd_mm_yyyy_hh_MM_ss");
		//ScreenShot
		File myFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//to save the SS into File
		FileHandler.copy(myFile, new File("./ScreenShots\\Mahesh"+df.format(dt)+".png"));


	}

}


