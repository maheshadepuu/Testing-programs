package basic.concepts;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> myCars=new ArrayList<String>();
		//to  assign string  values
		myCars.add("Benz");
		myCars.add("XUV300");
		myCars.add("Audi");
		
		System.out.println(myCars);
		
		//to change or update the values 
		myCars.set(1, "BMW");
		System.out.println(myCars);
		
		//to remove specfic value
		myCars.remove("Audi");
		
		//to close all the values
		//myCars.clear();
		System.out.println(myCars);


	}

}
	