package webelements.ex;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinkGoogleLang {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement myLang=driver.findElement(By.id("SIvCob"));
		List<WebElement> myLinks=myLang.findElements(By.tagName("a"));
		System.out.println("Number languages"+myLinks.size());
		
		for (WebElement Lang : myLinks) {
			 System.out.println(Lang.getText());
		 }

	}

}
