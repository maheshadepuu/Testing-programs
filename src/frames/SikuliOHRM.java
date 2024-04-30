package frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
public class SikuliOHRM {
	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//login operations
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		//to click on PIM
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(3000);
		// click on Add Employee
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);
		//to upload file
		driver.findElement(By.xpath("//img[@class='employee-image']")).click();
		Thread.sleep(3000);
		//syntax of sikulitool
		Screen obj=new Screen();
		Pattern pat1=new Pattern("C:\\Users\\Canniba\\Pictures\\Snipping SS\\open.png");		
		Pattern pat2=new Pattern("C:\\Users\\Canniba\\Pictures\\Snipping SS\\open.png");
		obj.type(pat1, "C:\\Users\\Canniba\\Pictures\\Snipping SS\\Capture x.png");
		obj.click();		
		//to click submit
		driver.findElement(By.xpath("//button[@type='submit']")).click();		
	}
}