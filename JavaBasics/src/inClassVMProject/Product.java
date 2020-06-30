package inClassVMProject;

public class Product {
	// What products attributes we can think of?

	// VARIABLES ARE AS FOLLOWS
	// NAME
	private String name;

	// PRICE
	private double price;

	// SIZE
	private int size; // we can have two sizes - small and large

	// LOCATION
	private int[] location; // this array will have two indexes (0 = row, 1 = col)

	// QUANTITY
	private int quantity;

	// CONSTRUCTORS (DEFAULT AND PARAMETERIZED

	// DEFAULT
	public Product() {
		this.name = "";
		this.price = 0.00;
		this.size = 0;
		this.location = new int[2];
		this.quantity = 0;
	}
	// we have to initialize it in default class because we have to initialize it
	// somewhere and it's constructor. let say if we don't intitialize it her and
	// perfrom the get method before set method then the application will crash. but
	// if we have a setter then it could be initialized even if it wasn't during
	// default constructor.

	// PARAMETERIZED
	public Product(String name, double price, int size, int[] location, int quantity) {

		this.name = name;
		this.price = price;
		this.size = size;
		this.location = location;
		this.quantity = quantity;
	}

	// GETTER METHOD
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public int[] getLocation() {
		return location;
	}

	public int getQuantity() {
		return quantity;
	}

	// SETTER METHOD
	public void setName(String name) {
		this.name = name;

	}

	public void setPrice(double price) {
		this.price = price;

	}

	public void setSize(int size) {
		this.size = size;

	}

	public void setLocation(int[] location) {
		this.location = location;

	}

	// we have columns (0-5) and rows (0-6) for location of product in VM. This
	// method will validate the location entry and returns a boolean if it's in
	// range
	public boolean validateLocationEntry(int row, int col) {
		boolean validation = false;

		if (row >= 0 && row <= 6) {
			validation = true;
			if (col >= 0 && col <= 5) {
				validation = true;

			} else
				System.out.println("Column is not in range!");
		} else {
			System.out.println("Row is not in range!");
		}

		return validation;
	}

	public void setLocation(int row, int col) { // CUSTOM METHOD
		// I want to check if the numbers are in range, if so, assign them to the array,
		// if not, don't assign. we use the method which we created above with if
		// condition:
		if (validateLocationEntry(row, col)) {
			location[0] = row;
			location[1] = col;
		}
		// else condition is already assigned in the above method that will return
		// validation (false)
	}

	public void setQantity(int quantity) {
		this.quantity = quantity;

	}
}
