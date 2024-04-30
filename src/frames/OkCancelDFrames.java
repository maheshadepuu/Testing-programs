package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OkCancelDFrames {

	public static void main(String[] args) {
		//Initialize Browser
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
				driver.manage().window().maximize();
				//To switch Frame-1
				driver.switchTo().frame("frame-1");
				//To click on "OK"
				driver.findElement(By.name("OK")).click();
				//To get driver position into defalut Location
				driver.switchTo().defaultContent();
				//To switch Frame-2
				driver.switchTo().frame("frame-2");
				//To click on "Cancel"
				driver.findElement(By.name("Cancel")).click();
				//To Switch to Child Frame
				System.out.println("Done");

	}

}
