package primitiveDataType_date_07052020;

public class FloatDouble {
	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = " + myMinFloatValue);
		System.out.println("Float maximum value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = " + myMinDoubleValue);
		System.out.println("Double maximum value = " + myMaxDoubleValue);

		float myFloatValue = (float) 5.5;

		
		//challenge
		double poundValue = 200D;
		double poundToKilo = 0.45359237D;
		double poundToKiloValue = poundValue * poundToKilo;
		System.out.println("Coverted Kilogrames = " +poundToKiloValue);

	}

}
