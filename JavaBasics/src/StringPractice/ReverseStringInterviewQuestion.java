package StringPractice;

public class ReverseStringInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testdata = "The Brown Fox jumped from the desk";

		StringBuilder sB = new StringBuilder(testdata);

		//System.out.println(sB.reverse()); // if it was String we won't be able to reverse it.
	
		//System.out.println(testdata.reverse); // reverse method doesn't exist.  
		sB.append("or maybe not");
		System.out.println(testdata);
		System.out.println(sB.reverse());
		System.out.println(sB.reverse());
		
	}	

}
