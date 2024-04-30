package basic.concepts;

import java.util.Scanner;

public class ScannerClassExamples {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		//String myVal=sc.nextLine();   //for names
		int myVal=sc.nextInt();       //for numbers
		System.out.println("Assigned value is:"+myVal);

	}

 
}
