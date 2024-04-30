package basic.concepts;

public class ControlStatementsIFELSE {

	public static void main(String[] args) {
		int a=30;
		int b=50;
		int c=60;
		int d=90;
		
		if (a>b && a>c && a>d)
		System.out.println("a having largest number:" +a);
		
		else if (b>c && b>d) 
			System.out.println("b having largest number:" +b);
			
			else if (c>d) 
				System.out.println("c having larest number:" +c);
		
			else  System.out.println("d having largest number:" +d);
		
		}
	}
	
