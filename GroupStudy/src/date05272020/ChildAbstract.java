package date05272020;

public class ChildAbstract extends AbstractionPractice {

	@Override
	void show() {
		System.out.println("This is abstract method from child class");

	}

	@Override
	void nonAbstract() {
		System.out.println("This is non abstract overrid in Child Class");
		super.nonAbstract();
	}

}
