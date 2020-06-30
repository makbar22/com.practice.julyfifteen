package murRoh;

public class DifferentDataTypeInArray05092020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] obj = new Object[6];

		obj[0] = "Ahmad";
		obj[1] = 123;
		obj[2] = 54.45;
		obj[3] = 'R';
		obj[4] = true;
		obj[5] = 12;

		for (Object i : obj) {
			System.out.println(i);
		}
		
		// we can't use different data type here because we didn't use the object class
		String[] x = { "Ahmad", "john" };

		for (String a : x) {
			System.out.println(a);
		}
	}

}
