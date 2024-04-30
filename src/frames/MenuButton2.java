package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuButton2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		//To Click On MenuButton 
		driver.switchTo().frame("iframeResult");
		//child frame
		driver.switchTo().frame(0);
		//click menu button
		driver.findElement(By.linkText("Menu")).click();
	}

}
