package webelements.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxUnchechBox {

	public static void main(String[] args) {
		//initialize steps
				WebDriver driver=new ChromeDriver();
				driver.get("https://echoecho.com/htmlforms09.htm");
				driver.manage().window().maximize();
				//to select check box
				driver.findElement(By.name("Checkbox")).click();
				driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click();
				driver.findElement(By.xpath("//td[@class='table8']/input[3]")).click();
				
				//to uncheck the box
				driver.findElement(By.xpath("//td[@class='table8']/input[2]")).click();
				

	}

}
