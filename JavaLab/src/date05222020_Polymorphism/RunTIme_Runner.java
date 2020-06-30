package date05222020_Polymorphism;

public class RunTIme_Runner {

	public static void main(String[] args) {

		RunTime_Parent a;

		a = new RunTime_Parent();
		a.Print();

		a = new Child_RunTime();
		a.Print();

	}

}
