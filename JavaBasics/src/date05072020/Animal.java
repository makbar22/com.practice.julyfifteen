package date05072020;

public class Animal {

	// all animal share names

	// introduce the String
	private String name;

	// default constructor
	public Animal() {
		name = "";
		System.out.println("Animal constructor ran");
	}

	// parameterized constructor
	public Animal(String name) {
		this.name = name;

	}

	// getter method
	public String getName() {
		return name;

	}

	// setter method
	public void setName(String name) {
		this.name = name;

	}
}
