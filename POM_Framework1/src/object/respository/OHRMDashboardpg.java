package object.respository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OHRMDashboardpg {
	//to assign web element locator value (i.e Dashboard element)
	@FindBy(xpath="//text[h6()='Dashboard']")
	WebElement dashboardObj;
	//method:to return status based on "Dashboard" webelement availability
	public boolean dashboardDisplay() {
		boolean myStatus=false;
		try {
			if(dashboardObj.isDisplayed()) {
				myStatus=true;
			}
		}
		catch(Exception e) {
		myStatus=false;
	}
       return(myStatus);
}
}
