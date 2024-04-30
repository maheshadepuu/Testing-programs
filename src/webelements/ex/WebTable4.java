package webelements.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable4 {

	public static void main(String[] args) {
		//condition to print
		String expData="Germany123";
		boolean myStatus=false;
		
		//initialize Browser Steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//creating object for webtable
		WebElement myTable=driver.findElement(By.id("customers"));
		//to find number of rows in a table
		List<WebElement> tds=myTable.findElements(By.tagName("td"));
		for(WebElement td:tds) {
			if(td.getText().equalsIgnoreCase(expData)){
				System.out.println("Execpted data exist in a table:");
				myStatus=true;
				
			}
		}
		if(myStatus=false) {
			System.out.println("Execpted data doesn't exist in a table");
		}
	}

}
