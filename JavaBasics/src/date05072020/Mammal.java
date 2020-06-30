package date05072020;

public class Mammal extends Animal {

	public Mammal() {
		super();
		System.out.println("Mammal constructor ran");

	}

	public Mammal(String name) {
		super(name); // calling parameterized constructor of parent class (hold ctrl and click on
						// super, it will take you to the parent)

	}
	
	//override method
	public String getName() {
		return "mammal class getname method " + super.getName();
	}

	public String giveMeTheName() {

		return super.getName();

	}

}
