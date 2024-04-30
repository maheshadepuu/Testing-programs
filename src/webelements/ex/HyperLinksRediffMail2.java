package webelements.ex;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksRediffMail2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		//count the number of links 
		List<WebElement> webLinks=driver.findElements(By.tagName("a"));
		if (webLinks.size()==200){
		System.out.println("my expected pass");
		}
		else {
			System.out.println("my expected failed" +webLinks.size());
			driver.close();
		}
	}

}
