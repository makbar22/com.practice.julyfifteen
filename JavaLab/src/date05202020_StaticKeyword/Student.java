package date05202020_StaticKeyword;

public class Student {

	String name;
	
	int rollNo;
	
	static String collegeName;
	
	static int counter = 0;
	
	public Student (String name) {
		this.name = name;
		this.rollNo=setRollNo();
		
	}
	static int setRollNo() {
		counter ++;
		return counter;
	
	}
	static void setCollegeName (String name) {
		collegeName = name;
	}
	public void getStudentInfo () {
		System.out.println("name: " +this.name);
		System.out.println("rollNo: " +this.rollNo);
		
		System.out.println("CollegeName: " + collegeName);
	}
}
