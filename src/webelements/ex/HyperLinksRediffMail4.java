package webelements.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksRediffMail4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		//find number of links in page 
		List <WebElement>
		myLinks= driver.findElements(By.tagName("a"));
		System.out.println("number of links are" +myLinks.size());
		
		//temporary value
		int count=0;
		
		//to read each link from collection
		 for(WebElement link : myLinks) {
			 if(!link.getText().isEmpty()) {
				 count++;
	 			 }
			 }
		 //printed visible & Hidden Links
		 System.out.println("Number of visible Links" +count);
		 System.out.println("Number Hidden links" +(myLinks.size() -count));
	}
}
