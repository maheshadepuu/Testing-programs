package webelements.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {
	public static void main(String[]args) {
		//initialize browser steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//create refrence object for web table		
		WebElement myTable=driver.findElement(By.id("customers"));
		//to find number of td tags 
		List<WebElement> tds=myTable.findElements(By.tagName("td"));
		for(WebElement td:tds) {
			//read/print all the td values or names
			System.out.println(td.getText());
		}	
	}
}
