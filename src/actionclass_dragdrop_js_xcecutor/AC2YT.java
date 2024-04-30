package actionclass_dragdrop_js_xcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC2YT {

	public static void main(String[] args) throws InterruptedException {
		// To initialize the browser
				WebDriver driver = new ChromeDriver();
				driver.get("https://google.co.in");
				driver.manage().window().maximize();
				
				//To create Object for Search editbox
				WebElement ele= driver.findElement(By.name("q"));
				
				Actions actObj= new Actions(driver);
				
				//To enter "selenium"
				actObj.keyDown(Keys.SHIFT).sendKeys(ele,"mahesh youtube channel").keyUp(Keys.SHIFT).build().perform();
				
				Thread.sleep(3000);
				ele.sendKeys(Keys.ENTER);
	}

}
