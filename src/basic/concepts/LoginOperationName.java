package basic.concepts;
   
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOperationName {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://app.zoom.us/signin?from=pwa#/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("Mahesh");
		driver.findElement(By.name("zm-form-item zm-form-password is-no-asterisk")).sendKeys("Mahesh");
		driver.findElement(By.name("mgt-sm")).click();
		
		/*driver.get("https://login.salesforce.com/?locale=in");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("Mercury");
		driver.findElement(By.name("password")).sendKeys("Mercury");
		driver.findElement(By.name("submit")).click();
		
	driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("Mindq");*/;

	}

}
