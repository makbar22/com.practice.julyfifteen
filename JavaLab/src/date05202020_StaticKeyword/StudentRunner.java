package date05202020_StaticKeyword;

public class StudentRunner {

	public static void main(String[] args) {
		
		
		Student.setCollegeName("American University");
		
		Student s1 = new Student ("John");
		Student s2 = new Student ("Alex");
		
		s1.getStudentInfo();
		s2.getStudentInfo();
	}

}
