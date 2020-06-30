package dat05172020;

public class Benz implements Car {

	double speed = 10;
	double speedChangeFactor = 0.3; // creating new method within Benz class

	@Override
	public void brake(double speed) {

		this.speed -= speed * speedChangeFactor;// we are adding this for reducing the speed so have to multiply the
												// factor (coming back to the point that this implementation part will
												// depend on abstract class.)

	}

	@Override // called annotation. If we don't put it, it will still work.
	public void increaseSpeed(double speed) {
		// TODO Auto-generated method stub

	}

}
