package basic.concepts;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringMethodsExamples {
	
	public static void main (String[]args) {
		//1Length()
		String str="MindqSystems";
		System.out.println(str.length());
		
		//2charAt()
		String str1  ="MindqSystems";
		System.out.println(str1.charAt(0));
		
		System.out.println(str1.charAt(11));
		
		System.out.println(str1.charAt(str1.length()-1));
		
		//3indexOf()
		String str2 ="MindqSystems";
		System.out.println(str2.indexOf("M"));
		System.out.println(str2.indexOf("S"));
		System.out.println(str2.indexOf(0));
		System.out.println("S");
		
		//4toUpperCase()
		String str3="MindQ";
		System.out.println(str3.toUpperCase());
		
		//5toLowerCase()
		System.out.println(str3.toLowerCase());
		
		//6equals()
		String str4="MindQ";
		System.out.println(str4.equals("MindQ"));
		System.out.println(str4.equals("mindq"));
		System.out.println(str4.equals("Mindq"));
		
		//7equalsIgnore()
		
		String str5="MindQ";
		System.out.println(str5.equalsIgnoreCase("MindQ"));
		System.out.println(str5.equalsIgnoreCase("ABCD1"));
		System.out.println(str5.equalsIgnoreCase("minq")); 
		
		//8startswith()
		String str6="MindQ";
				System.out.println(str6.startsWith("Mind"));
				System.out.println(str6.startsWith("mind"));
				System.out.println(str6.startsWith("MInd"));
				
		//9endswith()
				String str7="MindQ";
				System.out.println(str7.endsWith("dQ"));
				System.out.println(str7.endsWith("indQ"));
				System.out.println(str7.endsWith("ndq")); 
				
		//10contains() equals in one line everything
		String str8="MindqSystems";
		System.out.println(str8.contains("Syst"));
		System.out.println(str8.contains("Minq"));
		System.out.println(str8.contains("qSys")); 
		
		//11isEmpty() certain values given
		String str9="MindQ";
		System.out.println(str9.isEmpty());
		String str10="";
		System.out.println(str10.isEmpty());
		
		//12concat() +adding
		String str11="Mindq";
		String str12="Systems";
		System.out.println(str11.concat("Systems"));
		System.out.println(str11+str12); 
		int myVal=300;
		System.out.println(str11+myVal); 
		
		//13trim() read spaces 
		String str13=" Mindq ";
		System.out.println(str13.length());
		String str14="Mindq";
		System.out.println(str14.length());
		System.out.println(str14.trim().length()); 
		
		//14replace() replace names 
		String str15="MindqSystems";
		System.out.println(str15.replace("s", "1"));
		System.out.println(str15.replace("Mi", "Sys")); 
		
		//15substring() 
		String str16="MindqSystems";
		System.out.println(str16.substring(9));
		System.out.println(str16.substring(1, 9));
		System.out.println(str16.substring(5, 12));
		
		
		
		
	}

}
