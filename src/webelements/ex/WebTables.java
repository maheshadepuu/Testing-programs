package webelements.ex;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class WebTables {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//to read(Print-getText()names) the certain row and column 
		String tableData=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[2]")).getText();
		System.out.println(tableData);
	}

}

