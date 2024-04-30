package webelements.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksRediffMail3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		//find number of links
		 List<WebElement> 
		 myLinks =driver.findElements(By.tagName("a"));
		 //all links size in numbers
		 System.out.println("Number of Links" +myLinks.size());
		 //for all links names print
		 for (WebElement link : myLinks) {
			 System.out.println(link.getText());
		 }

	}

}
