
public class Car extends Vehicle {

	public Car() { // we use this to call variable in super class so we don't have to declare again
		super();
	}

	/*
	 * private String name; private String model; private String steering; private
	 * int gear; private int maxSpeed
	 */

	public Car(String name, String model, String steering, int gear, int maxSpeed) {
		super(name, model, steering, gear, maxSpeed);
	}
}
