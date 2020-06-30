package date05222020_Polymorphism;

public class Child_RunTime extends RunTime_Parent {

	@Override // annotation...
	void Print() {
		System.out.println(" This is the child class"); // we are overriding the parent method
	}
}
