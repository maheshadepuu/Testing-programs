package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItNaukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAjwte-vBhBFEiwAQSv_xX_9dZNDYl_yGtFw7OH3NGBWSoEKeQVWJHcsY0owSYm5oPgolOqgIBoCkxgQAvD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//2)click on experience
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Thread.sleep(3000);
		//3)Upload Resume
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(4000);
		//4)to call .exe file
		//Runtime.getRuntime().exec(D:\Canniba.exe);
	}

}
