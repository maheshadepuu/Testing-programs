package frames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		//Initialize Browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?ifkv=ARZ0qKLsR73imjM3OpR3D_cNQaCSDN8vSe9Qh8YEPTqdCC8V9ssDlKg5GI0SY1ji60Q_DcRdgrCv&theme=mn&ddm=0&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		//read 1st window title
		String pgTitle1=driver.getTitle();
		System.out.println(pgTitle1);
		//2nd window
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(4000);		
		Set<String> pgHandle=driver.getWindowHandles();
		//To read each window handle
		Iterator<String> winHandles=pgHandle.iterator();
		String win1=winHandles.next();
		String win2=winHandles.next();
		
		System.out.println(win1);
		//To Focus on 2nd window 
		driver.switchTo().window(win2);
		//To Read 2nd window Title
		String pgTitle2=driver.getTitle();
		System.out.println(pgTitle2);
		
	}

}
