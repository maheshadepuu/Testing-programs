package webelements.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksRediffMail {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//to read number of links from page
		
		List<WebElement> myLinks=driver.findElements(By.tagName("a"));
		System.out.println(myLinks.size());		
		}
	}