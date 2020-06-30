package date05142020;

public class Runner {
	public static void main(String[] args) {

		Car x = new BMW("car", "new", 2020, 4, 6, "Good"); // up casting

		Car x2 = new BMW(); // up casted

		BMW y = (BMW) x2; // down casted

		Car[] arrayOfCars = new Car[10];

		arrayOfCars[0] = new BMW(); // (only if BMW and Car has inheritance relations i.e. bmw child of car) we
									// instantiate child class instead of parent because it's polym...
		Object[] data = new Object[10]; // since all classes inherit from object class we can do the following
		data[0] = "String";
		data[1] = 10;
		data[2] = 10.2;
		data[3] = true;
		data[4] = new Car();
		data[5] = new BMW();
		

	}

}
