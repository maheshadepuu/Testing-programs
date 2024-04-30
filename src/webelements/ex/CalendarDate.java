package webelements.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		System.out.println("ok");	
		driver.manage().window().maximize();	
		driver.findElement(By.name("fromPlaceName")).sendKeys("Hyd");
		System.out.println("a");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='HYDERABAD AIRPORT-RGIA']")).click();
		System.out.println("b");		
		Thread.sleep(3000);
		driver.findElement(By.name("toPlaceName")).sendKeys("gun");
		System.out.println("c");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='GUNDLAPALLY']")).click();
		System.out.println("1");
		driver.findElement(By.id("txtJourneyDate")).click();
		System.out.println("2");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr[2]/td[3]/a")).click();
		System.out.println("3");
		//driver.findElement(By.name("txtReturnJourneyDate")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[2]/table/tbody/tr[5]/td[3]/a")).click();
		driver.findElement(By.name("searchBtn")).click();
		System.out.println("4");
		Thread.sleep(2000);
		driver.findElement(By.id("BtFid")).click();
		System.out.println("5");
		Thread.sleep(2000);
		driver.findElement(By.id("Bustypes200")).click();
		System.out.println("6");
		driver.findElement(By.id("BpFid")).click();
		System.out.println("7");
		Thread.sleep(2000);
		driver.findElement(By.id("DpFid")).click();
		System.out.println("8");
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		//driver.quit();
	}

}
