package twenty_eight_of_sep;

public class Notes {

	public static void main(String[] args) {
		// when a variable is inside a curly bracket or inside
		// a certain region it is not global. 
		int a = 1;
		{
			int b = 2;
			System.out.println(a);
			System.out.println(b); //no error
		}
		
		System.out.println(a);
		//System.out.println(b); error
		
		
		
		
		
		//only until 7 decimal
		float f1 = 1.0000001f;
		System.out.println(f1);
		float f2 = 1.000000001f;
		System.out.println(f2);
		
		//can go up to 15 decimal places
		double d1 = 1.0000000000001;
		System.out.println(d1);
		
		//byte, short, int, long
		//The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127
		//The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). 
		//By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1
		//The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1.
		//
//		Data Type				Default Value (for fields)
//		byte						0
//		short						0
//		int							0
//		long						0L
//		float						0.0f
//		double						0.0d
//		char						'\u0000'
//		String (or any object)  	null
//		boolean						false
		//downcasting and upcasting when changing variables
		System.out.println("-----------------");
//		int z = 1;
//		System.out.println(false && ++z>6);

	}

}
