package webelements.ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton {

	public static void main(String[] args) {
		//initialize steps
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		//driver.findElement(By.name("login")).click();
		
		//create object for login button
		WebElement buttonLogin=driver.findElement(By.name("login"));
		//to read visible text
		String buttonText=buttonLogin.getText();
		System.out.println("login button visibleText is:" +buttonText);
		//name attribute value
		String buttonName=buttonLogin.getAttribute("name");
		System.out.println("login button 'name' attribute value is:" +buttonText);
		//click on that element if it is enabled
		if(buttonLogin.isEnabled()) {
			buttonLogin.click();
			System.out.println("Login button enabled");}
			else 
				System.out.println("Login button disabled");
		}
		
		

	}

