package date05222020_inheritance;

public class Dealership extends Toyota {

	double sales;
	
	Dealership (){
		super();	// let the child class know that we can override parent classes variable
		
		sales = 0;
	}
	
	Dealership (double sales){
	super ();	// also brings all the variables of parent class. we we override later in the program in will not. 
	
}
}

