package basic.concepts;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
	/*
	 HashMap:	
	 	It is a class implemented in Map interface class
		Data can be stored in the form of key, value pairs.
		Key is unique. But we can have duplicate values.
		Insertion order not preserved(Index not followed)

		Ex:*/
				//HashMap hm= new HashMap();
				//Map hm = new HashMap();
				
				HashMap<Integer,String> hm= new HashMap<Integer,String>();
				//Adding Data
				hm.put(101, "MaheshChinna");
				hm.put(102, "Mindq");
				hm.put(103, "Jatial");
				
				//To read all the values
				System.out.println (hm);
				
				//To find number of pair of values
				System.out.println(hm.size());
				
				//To remove the value
				hm.remove(103);
				System.out.println(hm);
				
				//To read specific value
				System.out.println(hm.get(101));
				
				//To read only keys
				System.out.println(hm.keySet());
				
				//To read all the values
				for(Object k: hm.keySet()) {
					System.out.println(hm.get(k));
				
				}

				//To clear data
				hm.clear();
	}

}
