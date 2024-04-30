package webelements.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		//intial browser steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//to click on create new account button
		driver.findElement(By.linkText("Create new account")).click();
       //to pause execution for some button dealy
		Thread.sleep(3000);
		//to custom radiobutton
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.xpath("//label[text()='Custom']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}

}
