package webelements.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkRegisterLinks {

	public static void main(String[] args) {
		String expLink="Regis";
		boolean myStatus=false;
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		List<WebElement> 
		pgLinks= driver.findElements(By.tagName("a"));
		//System.out.println("Number of Links"+pgLinks.size());
		for (WebElement link:pgLinks) {
			if(link.getText().equalsIgnoreCase(expLink)){
				System.out.println("Expected page links Exist in a page");
				//to click on link
				link.click();
				myStatus=true;
				break;
			}
		}
if (myStatus==false) {
	System.out.println("Expected page links doesn't Exist in a page");
}
	}

}
