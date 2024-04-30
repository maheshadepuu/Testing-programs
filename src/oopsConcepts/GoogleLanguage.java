package oopsConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguage {	
	WebDriver driver;
	
	public void setUp() {
	//Initialize Browser-1
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
 }
	//select language-2
	public void langSelect(String myLang) throws InterruptedException {
		driver.findElement(By.linkText(myLang)).click();
		Thread.sleep(4000);
	}		
	//close app-3
	public void closeApp() {
		driver.close();
	}	
	//Switch Languages-4
	public static void main(String[] args) throws InterruptedException {
		GoogleLanguage obj=new GoogleLanguage();
		obj.setUp();
		obj.langSelect("ಕನ್ನಡ");
		Thread.sleep(2000);
		obj.langSelect("हिन्दी");
		Thread.sleep(2000);
		obj.langSelect("മലയാളം");
		Thread.sleep(2000);
		obj.langSelect("తెలుగు");
		Thread.sleep(2000);
		obj.langSelect("English");
		obj.closeApp();
	System.out.println("All Opertions are Sucessfully running");
	}
}


