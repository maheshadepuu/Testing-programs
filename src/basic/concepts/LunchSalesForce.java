package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchSalesForce {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		 driver.navigate().to("https://login.salesforce.com/?locale=in");
			
		//driver.get("https://login.salesforce.com/?locale=in");
		
		//driver.manage().window().maximize();
		
		//driver.findElement(By.id("username")).sendKeys("Mindqsystems");
		//driver.findElement(By.id("password")).sendKeys("Sr Nagar");
		//driver.findElement(By.id("Login")).click();
		
		 String gtTitle=driver.getTitle();
		 System.out.println(gtTitle);
		 String maUrl=driver.getCurrentUrl();
		 System.out.println(maUrl);
		 String pgSource=driver.getPageSource();
		 System.out.println(pgSource);
		 //driver.navigate().to("https://login.salesforce.com/?locale=in");
		 
		 driver.navigate().refresh();
		 driver.navigate().back();
		 driver.navigate().forward();
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 driver.close();
		 driver.quit();
		 
		 
		
		
		

	}

}
