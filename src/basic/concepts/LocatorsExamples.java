package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://login.salesforce.com/?locale=in");
		
		//1)Id()
		 
		driver.findElement(By.id("username")).sendKeys("Mahesh");
		driver.findElement(By.id("password")).sendKeys("Mahesh@123");
		driver.findElement(By.id("Login")).click();*/
		
		//2)Name()
		
		/*driver.get("https://demo.guru99.com/test/login.html");
		driver.findElement(By.name("email")).sendKeys("Mahesh@gmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Mahesh@123");
		driver.findElement(By.name("SubmitLogin")).click();*/
		
		//3)className()
		
		/*driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.className("username")).sendKeys("Mahesh");*/
		
		//4)LinkTest();
		
		/*driver.get("https://www.facebook.com/login");
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("Mahesh@gamil.com"); */
		
		//5)paritalLinkText
		
		/*driver.get("https://www.facebook.com/login");
		driver.findElement(By.partialLinkText("F")).click();*/
		
		//Xpath
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Mahesh@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mahesh");
		driver.findElement(By.linkText("Forgotten account?")).click();
		//driver.findElement(By.xpath("//input[name='email']")).sendKeys("Mahesh@gmail.com123");
		driver.navigate().back();
		Thread.sleep(6000);
		driver.quit();
	}

}
