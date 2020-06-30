package inheritance_resolvedByAhmad_05152020;

public class Car extends Vehicle {

	private int wheels; // we are initializing variables that belongs to Car class
	private int doors;
	private int gear;
	private boolean isManual;
	private int currentGear;

	public Car(String name, String size, int currentSpeed, int currentDirection, int wheels, int doors, int gear,
			boolean isManual) {
		super(name, size, currentSpeed, currentDirection);
		this.wheels = wheels;
		this.doors = doors;
		this.gear = gear;
		this.isManual = isManual;
	}

	public void changeGear(int currentGear) { // setter method to change gear
		this.currentGear = currentGear;
		System.out.println("Car gear change to" + this.currentGear); // we need a validation to make sure it works
	}

	public void changeSpeed(int speed, int direction) {
		move(speed, direction);
		System.out.println("Car speed" + speed + "direction" + direction);
	}

}
