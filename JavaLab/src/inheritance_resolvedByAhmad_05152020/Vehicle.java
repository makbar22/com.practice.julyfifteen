package inheritance_resolvedByAhmad_05152020;

public class Vehicle {

	private String name;  //we make it private because we don't want other classes to modify it. We can access it by setter and getter method (public).
	private String size;
	private int currentSpeed;
	private int currentDirection;

	public Vehicle(String name, String size, int currentSpeed, int currentDirection) {
		super();
		this.name = name;
		this.size = size;
		this.currentSpeed = currentSpeed;
		this.currentDirection = currentDirection;
	}

	public void steer(int direction) {
		this.currentDirection += direction;
		System.out.println("Vehicle steering at" + currentDirection + "degrees");
	}

	public void move(int speed, int direction) {
		currentSpeed = speed;
		currentDirection = direction;
		System.out.println("Vehicle is moving at" + currentSpeed + "in direction" + currentDirection);
	}

	public String getName() {
		return name;
	}

	public String getsiz() {
		return size;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void stop() {
		this.currentSpeed = 0;
	}

}
