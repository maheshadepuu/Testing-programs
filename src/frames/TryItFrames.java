package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryItFrames {

	public static void main(String[] args) throws InterruptedException {
		//Initialize Browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		//Syntax of Frames
		//driver.switchTo().frame("Id,Name,Index");
		
		Thread.sleep(3000);
		//To switch to Frame
		driver.switchTo().frame("iframeResult");
		//To click on "Try it" button
		driver.findElement(By.xpath("//button[text()='Tryit']")).click();

	}

}
