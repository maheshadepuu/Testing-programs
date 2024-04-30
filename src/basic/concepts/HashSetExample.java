package basic.concepts;

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet mySet=new HashSet();
		
		mySet.add("Mahesh");
		mySet.add(250);
		mySet.add(10.5033);
		//to find number of values
		System.out.println("Number of values are :" +mySet.size());
		//to read all values 
		System.out.println(mySet);
		//to remove specfic values
		mySet.remove(250);
		System.out.println(mySet);
		//to remove all values
		mySet.clear();
		System.out.println(mySet);
		
	}
}
