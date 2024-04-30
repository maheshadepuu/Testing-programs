package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoponHTML {

	public static void main(String[] args) throws InterruptedException {
		//initialize browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//To clickon "Create new account" link
		driver.findElement(By.linkText("Create new account")).click();
		//Synchronization 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		//To enter "MAHESH"
		driver.findElement(By.name("firstname")).sendKeys("MAHESH");
		;

	}

}
