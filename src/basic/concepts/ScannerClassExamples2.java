package basic.concepts;

import java.util.Scanner;

public class ScannerClassExamples2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first Number");
		int num1=sc.nextInt();
		System.out.println("Enter your Second Number");
		int num2=sc.nextInt();
		System.out.println("Sum of Given Number:"+(num1+num2));
sc.close(); //remove the scanner warning
	}

}
