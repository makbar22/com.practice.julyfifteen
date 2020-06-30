package date05032020;

public class RefANDStringPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = "Test";
		String st2 = "Test";
		String st3 = new String ("Test");
		
		System.out.println("using == (checking value in the Stack)");
		System.out.println(st1 == st2); // they're both place in heap in String Pool and the reference in Stack will be equal i.e. 001 == 001
		System.out.println(st1 == st3);// st3 will create a new object (variable) in Heap and in Stack it will have a different reference i.e. 002
		System.out.println(st2 == st3);// ^^
		
		System.out.println("using the .equals (checking value in the Heap)");
		System.out.println(st1.equals (st2)); // they're both place in heap in String Pool and the value in the heap are equal i.e. Test equals Test
		System.out.println(st1.equals (st3));// they're both place in heap in String Pool and the value in the heap are equal i.e. Test equals Test
		System.out.println(st2.equals (st3));// // they're both place in heap in String Pool and the value in the heap are equal i.e. Test equals Test
	}

}
