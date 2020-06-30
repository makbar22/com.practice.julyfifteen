package date05272020;

public abstract class AbstractionPractice {

	abstract void show(); // won't take body
	
	void nonAbstract() { // non abstract method so this class is 50% abstract, can take body
		System.out.println("this is non abstract method printed from parent class");
	}
	
	
	
}
