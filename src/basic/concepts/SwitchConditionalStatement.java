package basic.concepts;

public class SwitchConditionalStatement {
	//nested if /if else= to check more than one condition,simple placing if statement inside the another if statement is nested if
      //int a=50;(intialization) ab=10;(Condition) ab++;(Increment)
	public static void main(String[] args) {
		int a=50;
		int b=30;
		int c=20;
		if (a>b && a>c) {
		System.out.println("Print higher value:" +a);}
		
		else if (b>c) {
			System.out.println("Print higher value:" +b);}
			
			else {
				System.out.println("Print higher value:" +c);
			}
			
			}
		}
	