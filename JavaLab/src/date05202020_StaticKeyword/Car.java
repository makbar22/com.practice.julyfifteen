package date05202020_StaticKeyword;

public class Car {

	private String mode;;
	private int horse_power;
//	private int numberOfCarsinTheShop = 0; // if we have it without static then everytime we add cars in runner class, it will always be 1 because - refer to OneNote 
	private static int numberOfCarsinTheShop;
	
	Car (String model, int horse_power){
		this.mode=model;
		this.horse_power = horse_power;
		numberOfCarsinTheShop++;
		
		
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public int getHorse_power() {
		return horse_power;
	}

	public void setHorse_power(int horse_power) {
		this.horse_power = horse_power;
	}

	public int getNumberOfCarsinTheShop() {
		return numberOfCarsinTheShop;
	}

	public void setNumberOfCarsinTheShop(int numberOfCarsinTheShop) {
		this.numberOfCarsinTheShop = numberOfCarsinTheShop;
	}
}
