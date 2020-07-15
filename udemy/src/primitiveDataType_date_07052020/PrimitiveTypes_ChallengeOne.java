package primitiveDataType_date_07052020;

public class PrimitiveTypes_ChallengeOne {
	public static void main(String[] args) {

		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		int sumByteShortInt = byteValue + shortValue + intValue;
		long grandValue = (sumByteShortInt * 10L);

		long longValue = 50000L;

		int finalValue = (int) (longValue + grandValue);

		System.out.println(finalValue);

	}

}
