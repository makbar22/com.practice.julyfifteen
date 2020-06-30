package date04302020;

public class Student {

	// We don't create main method because this is main method and we will have a
	// runner class

	private String name;
	private int age;

	// default constructor method
	public Student() {
		name = ""; // char default value could be nothing
		age = 0; // age default value is 0

	}

	// parameterized constructor method
	public Student(String newName, int newAge) { // it has parameter (properties) - newName, newAge
		name = newName;
		age = newAge;

	}

	public Student(String newName) // <<called definition of method // we creat this to access all the above in the
									// runner class
	{
		name = newName;
		age = 0; // because we didn't specify above
	}

	public String getName() { // getter
		return name;
	}

	public void setName(String newName) { //setter
		name = newName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int newAge) {
		age = newAge;

	}
}
