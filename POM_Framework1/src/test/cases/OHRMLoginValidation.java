package test.cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import object.respository.OHRMDashboardpg;
import object.respository.OHRMHomepg;

public class OHRMLoginValidation {

	public static void main(String[] args) throws InterruptedException {
		 //initialize browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//to intialize "object.repository"package classes
		OHRMHomepg ohp=PageFactory.initElements(driver, OHRMHomepg.class);
		OHRMDashboardpg odp=PageFactory.initElements(driver, OHRMDashboardpg.class);
		//to perform login operations 
		ohp.setUid("Admin");
		ohp.setPwd("admin123");
		ohp.clickBtn();
		Thread.sleep(4000);
		//to verify login sucessful or not
		if (odp.dashboardDisplay()) {
			System.out.println("sucessful login operation");
		}
		else {
			System.out.println("unsucessful login operation");
		}
	}

}
