package basic.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraverserXPath {
	public static void main(String[]args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_ab32']/div/label/input")).sendKeys("Mahesh");
		driver.findElement(By.xpath("//div[@class='_ab32']/div/label/input//following::input")).sendKeys("Mahi123");
		driver.findElement(By.tagName("button")).click();
		
		
		
	}

}
