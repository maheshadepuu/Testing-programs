package frames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopOnJava {

	public static void main(String[] args) throws InterruptedException {
		//initialize browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		//tryit button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Explicit wait
		WebDriverWait wt= new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.alertIsPresent());
		//Create Object for Alert class
		Alert alert=driver.switchTo().alert();
		//To read msg from java Alert
		String msg= alert.getText();
		System.out.println(msg);
				
		//To close java Alert
		alert.accept();
				
		
	}

}
