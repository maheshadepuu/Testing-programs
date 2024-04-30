package basic.concepts;

import org.openqa.selenium.WebDriver;  //ctrl+shift+O for import package
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LunchBrowser {

	public static void main(String[] args) {
		//WebDriver driver= new EdgeDriver();
		WebDriver driver=new ChromeDriver();
		
		//to navigate IG application
		//driver.get ("https://www.instagram.com/?hl=en");
		driver.get("https://twitter.com/?lang=en");	
		//driver.get("https://www.bcci.tv/rankings/odi?platform=international&type=men");
		
		//to maximize browser window 
		driver.manage().window().maximize();
		
		//to read page title
		 String pgTitle=driver.getTitle();
		 System.out.println(pgTitle);
		 
		 
		 
		//to read page source code
		//String pgSource=driver.getPageSource();
		//System.out.println(pgSource);
		
		//to close application
		//driver.close();
		
		
		}

}
