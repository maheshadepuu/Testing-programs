package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysGoogle123 {

	public static void main(String[] args) throws InterruptedException {
		//initial browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement searchbox=driver.findElement(By.name("mah"));
		searchbox.sendKeys("Mahindra University");
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		searchbox.sendKeys(Keys.ENTER);*/
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement searchTxt=driver.findElement(By.name("q"));
		searchTxt.sendKeys("selenium");
		Thread.sleep(2000);
		searchTxt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		searchTxt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		searchTxt.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		searchTxt.sendKeys(Keys.ENTER);
	}

}
