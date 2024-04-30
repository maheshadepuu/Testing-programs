package basic.concepts;

public class DataTypes {

	public static void main(String[] args) {
		
		byte myByte = 127;
		System.out.println("Byte value is: "+myByte);

		short myShort = 32767;
		System.out.println("My short value is: "+myShort);

		int myInt =  2147483647;
		System.out.println("My Integer value is: "+myInt);

		long myVal= 9223372036854775807L;   		 //suffix with "l" or "L"
		System.out.println("Long value is: "+myVal);

		float myFloat= 32.56123421F;		//it will give upto 4 to 7 digits after decimal point
		System.out.println("My Float value is: "+myFloat);
		
		double myDouble= 32.56123421;	//it will return all the digits after decimal point
		System.out.println("Double value is: "+myDouble);

		char myGender='M';
		System.out.println(myGender);


		boolean myStatus= true;
		System.out.println(myStatus);


	}

}
