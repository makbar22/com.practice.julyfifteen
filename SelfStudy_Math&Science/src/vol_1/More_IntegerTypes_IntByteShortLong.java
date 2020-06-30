package vol_1;

public class More_IntegerTypes_IntByteShortLong {

	public static void main(String[] args) {

		/*
		 * byte 8 bits -128 to 127 short 16 bits -32768 to 32767 integer 32 bits
		 * -2,147,483,648 to 2,147,483,647 long 64 bits -9,223,372,036,854,775,808 to
		 * 9,223,372,036,854,775,807
		 * 
		 * when using long we need to be l (L) at the end of the number to be treated
		 * long not integer
		 */

		byte byteVariable;
		byteVariable = 100;

		short shortVariable;
		shortVariable = 3500;

		int integerVariable;
		integerVariable = 1525544454;

		long longVariable;
		longVariable = 152554445454L;
		System.out.println(longVariable);

		longVariable = longVariable + 1;
		System.out.println(longVariable);

		
		
	}

}
