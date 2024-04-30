package object.respository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OHRMHomepg {
	//to assiagn element locator values @FindBy
	@FindBy (name="username")
	WebElement userNameObj;
	
	@FindBy (name="password")
	WebElement pwdObj;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement loginObj;
	
	//methods to perform operations on WebElement
	public void setUid(String uid) {
		userNameObj.sendKeys(uid);
	}
    public void setPwd(String pwd) {
    	pwdObj.sendKeys(pwd);
    }
    public void clickBtn() {
    	loginObj.click();    	
    }
}
