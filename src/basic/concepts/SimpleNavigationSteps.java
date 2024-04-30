package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleNavigationSteps {

	public static void main(String[] args) throws InterruptedException {
		
		//Initialize Broweser Steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
				
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("un")).sendKeys("Mahi");
		driver.findElement(By.name("cancel")).click();
		
		driver.findElement(By.linkText("Use Custom Domain")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("mydomain")).sendKeys("Mahi");
		driver.findElement(By.id("hint_back_domain")).click();
		driver.navigate().refresh();
		driver.findElement(By.name("username")).sendKeys("Mahi");
		driver.findElement(By.name("pw")).sendKeys("Mahesh");
		driver.findElement(By.name("Login")).click();

		
		
		
	}

}
