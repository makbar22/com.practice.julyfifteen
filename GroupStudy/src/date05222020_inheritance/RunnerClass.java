package date05222020_inheritance;

public class RunnerClass {

	public static void main(String[] args) {

		Dealership obj = new Dealership();

		obj.CarLaon();
		obj.service();
		obj.setcamery("I want a fancy Camery");
		obj.Sepcifications();

		System.out.println(obj.getArrayVIN()[2]);
		// System.out.println(obj.getcamery());

		obj.setcorolla("BMW");
		System.out.println(obj.getcorolla());
	}

}
