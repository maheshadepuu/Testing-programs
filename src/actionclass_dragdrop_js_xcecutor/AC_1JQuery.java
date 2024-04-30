package actionclass_dragdrop_js_xcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC_1JQuery {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		Actions ac=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
		//act.moveToElement(button).contextClick().build().perform();
		ac.moveToElement(button).contextClick().build().perform();
		//on click on button right click
		driver.findElement(By.xpath("//span[text()='Paste']")).click();		
		//to close java alerts
		driver.switchTo().alert().accept();
		
		

	}

}
