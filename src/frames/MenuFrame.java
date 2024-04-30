package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuFrame {

	public static void main(String[] args) throws InterruptedException {
		//Initialize Browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		//To switch Frame
		driver.switchTo().frame("iframeResult");
		//To Switch to Child Frame
		driver.switchTo().frame(0);
		//Click To Menu
		Thread.sleep(3000);
		driver.findElement(By.linkText("Menu")).click();
		driver.findElement(By.xpath("//*[@id='tnb-google-search-mobile-show']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='tnb-google-search-input']")).click();
		System.out.println("sucess");

	}

}
