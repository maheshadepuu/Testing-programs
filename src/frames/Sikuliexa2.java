package frames;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuliexa2 {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		Pattern f1=new Pattern("C:\\Users\\Canniba\\Pictures\\Snipping SS\\Capture.png");
		
		Pattern f2=new Pattern("C:\\Users\\Canniba\\Pictures\\Snipping SS\\Capture 9.png");
		
		Pattern f3=new Pattern("C:\\Users\\Canniba\\Pictures\\Snipping SS\\Capture x.png");
		
		Pattern f4=new Pattern("C:\\Users\\Canniba\\Pictures\\Snipping SS\\Capture 5.png");
		
		Pattern f5=new Pattern("C:\\Users\\Canniba\\Pictures\\Snipping SS\\Capture equal.png");
		
		//create object for screen class
		Screen scobj=new Screen();
		
		//write script to perform operation on elements
		scobj.click(f1);
		Thread.sleep(2000);
		scobj.click(f2);
		Thread.sleep(2000);
		scobj.click(f3);
		Thread.sleep(2000);
		scobj.click(f4);
		Thread.sleep(2000);
		scobj.click(f5);
		

	}

}
