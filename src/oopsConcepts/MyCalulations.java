package oopsConcepts;

public class MyCalulations {
		int result;
		//non static method
		//method-1 to perform addition
		public static void sumOf(){			
			int a=10;
			int b=20;
			int result=a+b;
			//System.out.println("Addition of number is:" +c);
			System.out.println("Addition of number is:" +result);			
		}
		//method-1 to perform Multiplication
		public static void multiOf() {
			try {
				int x=30;
				int y=0;
				int z=x/y;
				System.out.println("Multiplication of number is:" +z);
				//System.out.println("Multiplication of number is:" +result);
				//System.out.println(z);
			} catch (Exception e) {
				System.out.println("hii");
			}
			finally {
				System.out.println("iam finally block");
			}
			
		}

		public static void main(String[] args) {
			sumOf();
			multiOf();
		}
	}

