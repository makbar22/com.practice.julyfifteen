package date05032020;

public class Customer {

	private String firstName;
	private String lastName;
	private String midName;

	private int phoneNumber;
	private double balance;

	// DEFAULT CONSTRUCTOR
	// PATTERN FOR DEFAULT CONSTRUCTOR : AM class name () {}
	public Customer() {
		firstName = "";
		lastName = "";
		midName = "";

		phoneNumber = 0;
		balance = 0.00;
	}

	// PARAMETERIZED CONSTRUCTOR
	// PATTERN: AM Class Name (Argument) {body}
	public Customer(String newFirstName, String newLastName, String newMidName, int newPhoneNumber,
			double newBalance) {
		firstName = newFirstName;
		lastName = newLastName;
		midName = newMidName;

		phoneNumber = newPhoneNumber;
		balance = newBalance;
	}
	//Getter and Setter is used to access method with private AM. We extract from constructor to be able to use it in a different class
	
	// GETTER METHOD
	// PATTERN: AM DataType Argument () { return variable}
	public String getFirstName() {
		return firstName;
	}

	public String getMidName() {
		return midName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFulltName() {
		return firstName + " " + midName + " " + lastName;
	}

	public double getBalance() {
		return balance;

	}

	// SETTER METHOD
	// PATTERN: AM void
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;

	}

	public void setMidtName(String newMidName) {
		midName = newMidName;
	}

	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	public boolean deposit(double amount) { //because balance could change by deposit or withdrawal
		// validation code
	boolean validation = true;
	 if (validation) {
		 balance += amount;
	 return true;
	 } else {
		 System.out.println("Credentials is not accepted! Amount is not deposited, contact the customer service!");
	 }
		return false;

	}

	public boolean withdraw(double amount) {
		if (balance > amount) {
			balance -= amount;
			System.out.println("$" + amount + "withdrew from your account. Please take your card!");
			return true;
		} else {
			System.out.println("Insufficient balance");
		}

		return false;
	}
}
