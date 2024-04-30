package webelements.ex;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Date_ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to screenshot the application
		File myFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//date format prints
		Date dt=new Date();
		DateFormat df=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		System.out.println(df.format(dt));
		//save as file location path
		FileHandler.copy(myFile, new File("./ScreenShots\\Mahesh"+df.format(dt)+".png"));
	}
}