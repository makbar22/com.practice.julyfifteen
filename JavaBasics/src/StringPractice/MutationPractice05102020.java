package StringPractice;

public class MutationPractice05102020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String is immutable
		String x = "test";
		x = "test1";

		// StringBuffer is mutable
		StringBuffer stb = new StringBuffer("test");
		// sb.append("test1"); // append adds the value to the original (for info only
		// not related to mutation here)
		stb = new StringBuffer("test1");

		System.out.println(stb);

		// OR

		String st = "test";
		StringBuffer sb = new StringBuffer("test");

		for (int i = 0; i < 10; i++) {
			st = st.replace('t', 'T'); // if we put st.replace ('t', "T") it will not change to T because it immutable and will not pick the recent location in the memory. so we have to re assign st.
			
			
			sb.replace(0, 1, "T");
			
			st += i + 1;
			sb.append(i + 1);

			System.out.print("st " + st + "\t\t\t\t\t");
			System.out.println("sd " + sb);

			// with string 10 different objects have been created with StringBuffer it will
			// replace the object in the same location in the memory. NOTHING IN CODE/RESULT WILL CHANGE

		}
	}

}
