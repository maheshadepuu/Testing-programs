package oopsConcepts;

public class DemoTest {

	//method-1:to perform multiplication
			public int multiOf(int a,int b) {
			int x=a;
			int y=b;
			int z=x*y;
			return (z);
			}

	public static void main(String[] args) {
		DemoTest dt=new DemoTest();
		int result=dt.multiOf(9, 5);
		System.out.println(result);
		
		}

	}


