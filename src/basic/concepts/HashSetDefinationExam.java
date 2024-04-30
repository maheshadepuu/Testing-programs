package basic.concepts;

import java.util.HashSet;

public class HashSetDefinationExam {

	public static void main(String[] args) {
		/*Is a class implemented in Set interface class
		Heterogeniuos data allowed
		Insertion order not preserved  (i.e. index not supported)
		Duplicate elementes not allowed
		multiple nulls not allowed/single null allowed */
	
	HashSet mySet= new HashSet(); 
			//Set mySet = new HashSet();
			//HashSet<String> mySet = new HashSet(); --> for Homegenious data
			
			mySet.add("MaheshChinna");
			mySet.add(250);
			mySet.add(10.786);
			
			//To find number of values
			System.out.println("Number of values are: "+mySet.size());
			//To read all the values
			System.out.println(mySet);  
			//to remove specific value
			mySet.remove(10.786);
			
			//to read all the values
			for(Object x : mySet) {
				System.out.println(x);
			}

	}

}
