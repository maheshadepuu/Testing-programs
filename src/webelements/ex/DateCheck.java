  package webelements.ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCheck {
	public static void main(String[] args) {
	Date dt=new Date();
	System.out.println(dt);
	
	DateFormat df=new SimpleDateFormat("dd_MM_YYYY_HH_mm_SS");
	System.out.println(df.format(dt));
	
	}

}
