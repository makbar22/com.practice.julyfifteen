package date05222020_inheritance;

import java.util.HashMap;

public class Toyota {

	private String camery;
	private String corolla;
	private int[] arrayVIN = { 324233, 3243243, 546547, 6545345 };

	public Toyota() {
		camery = "";
		corolla = "";
		// arrayVIN [0] = 0;

	}

	public Toyota(String newCamery, String newCorolla, int[] arrayVIN) {
		this.camery = newCamery;
		this.corolla = newCorolla;
		this.arrayVIN = arrayVIN;
	}

	public void CarLaon() {
		System.out.println("Car Laon must be available for customers");
	}

	public void service() {
		System.out.println("There must be a service department available for customers");
	}

	public int[] getArrayVIN() {
		return arrayVIN;

	}

	public int[] setArrayVIN(int[] arrayVIN) {
		return this.arrayVIN = arrayVIN;
	}

	public String getcamery() {
		return camery;
	}

	public String getcorolla() {
		return corolla;
	}

	public void setcamery(String newCamery) {
		this.camery = newCamery;
	}

	public void setcorolla(String newCorolla) {
		this.corolla = newCorolla;
	}

	public void Sepcifications() {
		HashMap<String, Integer> spc = new HashMap<String, Integer>();
		spc.put("White Caremy", 365645653);
		spc.put("Black Caremy", 365455653);
		spc.put("Red Caremy", 365643653);
		spc.put("Silver Caremy", 365643653);
	}
}
