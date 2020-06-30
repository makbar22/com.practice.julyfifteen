package dat05172020;

public interface Car {

	int numberOfDoors = 4; // this is final and cannot change

	public void brake(double speed); // creating method (definition without implementation)
	public void increaseSpeed(double speed);

	
	public default void depo() { // we pick default because other classes will have it as default. However they
									// can override the default method.

		System.out.println("default implementation of the method depo");
	}

}
