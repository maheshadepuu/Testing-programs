package webelements.ex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables2 {

	public static void main(String[] args) {
		// To initialize browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//create object for web table
		WebElement myTable=
		driver.findElement(By.id("Company"));
		//to find number of rows in a Table
		List<WebElement> trs=driver.findElements(By.tagName("tr"));
		System.out.println("Number Rows are:" +trs.size());
		System.out.println("Company,Contact,Country");
		for(WebElement tr : trs) {
			//read all the tds from each tr
		List<WebElement> tds=tr.findElements(By.tagName("td"));
			for(WebElement td : tds) {
				System.out.print(td.getText());
			}
			
			System.out.println();
			
		}}}
