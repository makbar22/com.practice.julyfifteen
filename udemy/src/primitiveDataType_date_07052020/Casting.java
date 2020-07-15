package primitiveDataType_date_07052020;

public class Casting {
	public static void main(String[] args) {

		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);

		//byte myNewByteValue = (myMinByteValue / 2);

		byte myNewByteValue_Casted = (byte)(myMinByteValue/2);
	}
}
