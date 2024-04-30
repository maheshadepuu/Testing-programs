package oopsConcepts;

public class ArithemeticExample {
	static int result;
	//static method
	//method-1 to perform addition
	public static void sumOf(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of number is:" +c);
		System.out.println("Addition of number is:" +result);		
	}
	//method-1 to perform Multiplication
	public static void multiOf() {
		int x=30;
		int y=40;
		int z=x*y;
		System.out.println("Multiplication of number is:" +z);
		System.out.println("Multiplication of number is:" +result);
	}
	public static void main(String[] args) {
		sumOf();
		multiOf();
	}
}
