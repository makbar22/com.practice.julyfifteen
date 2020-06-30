
public class Vehicle {

	// incomplete
	private String name;
	private String model;
	private String steering;
	private int gear;
	private int maxSpeed;

	public Vehicle() { // default constructor
		name = "";
		model = "";
		steering = "";
		gear = 0;
		maxSpeed = 0;
	}

	public Vehicle(String name, String model, String steering, int gear, int maxSpeed) { // parameterized consturctor
		this.name = name;
		this.model = model;
		this.steering = steering;
		this.gear = gear;
		this.maxSpeed = maxSpeed;
	}

	public String getName() { // getter method
		return name;
	}

	public String getModel() {
		return model;
	}

	public String getSteering() {
		return steering;
	}

	public int getGear() {
		return gear;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setModel(String model) {
		this.model = model;

	}

	public void setSteering(String steering) {
		this.steering = steering;

	}

	public void setGear(int gear) {
		this.gear = gear;

	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;

	}

}
