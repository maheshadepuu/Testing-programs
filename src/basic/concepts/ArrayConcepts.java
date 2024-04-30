package basic.concepts;

public class ArrayConcepts {
	
	public static void main(String[] args) { 
		//1)Declare an array
		String[] myCars=new String[3];
		
		//2)Insert values into array
		myCars[0]="Benz";
		myCars[1]="Audi";
		myCars[2]="Bmw";
		
		//3)Find size of an array
		System.out.println("Number of values are:" +myCars.length);
		
		//4)read single values from an array
		System.out.println(myCars[0]);
		
		//5)read multiple values from array
		for(int i=0; i<=myCars.length-1; i++) {
		System.out.println(myCars[i]);
		}
	}

}
