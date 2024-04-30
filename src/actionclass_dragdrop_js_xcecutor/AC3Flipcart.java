package actionclass_dragdrop_js_xcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AC3Flipcart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//to work on popup
		try {
			if(driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).isDisplayed()) {
				System.out.println("Popup displayed");
			//To enter "Mobile no"
			driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("9848761579");

			Thread.sleep(5000);
			//To close popup
			driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();	
			Thread.sleep(5000);
			}			
		}
		catch(Exception e) {
			System.out.println("Popup not displayed");
		}
		
		WebElement ele= driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions actObj= new Actions(driver);
		
		//to perform mousehover operation on "Fashion" menu
		actObj.moveToElement(ele).build().perform();
		
		Thread.sleep(3000);
		
		//To select "Men's Kurtas" option
		driver.findElement(By.linkText("Men's Kurtas")).click();
	}

}
