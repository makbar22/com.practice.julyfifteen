package date05142020;

public class Car {

	private String name;
	private String model;
	private int year;
	private int numberOfDoors;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public Car(String name, String model, int year, int numberOfDoors) {   // parameterized constructor
		super();
		this.name = name;
		this.model = model;
		this.year = year;
		this.numberOfDoors = numberOfDoors;
	}

	public Car() {                // default constructor
		this.name = "";
		this.model = "";
		this.year = 0;
		this.numberOfDoors = 0;
	}
}