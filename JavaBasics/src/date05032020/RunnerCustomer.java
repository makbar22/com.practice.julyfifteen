package date05032020;

public class RunnerCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer x = new Customer(); //first call the method class //default constructor is called and we creat an object of x, y, ....
		

		x.setFirstName("Ahmad");
		
		Customer y = new Customer("Habib", "Jan", "Mahmood", 805678912, 120);

		y.setFirstName("mac pro and the rest of the mac");
		System.out.println(y.getBalance());

		y.withdraw((565));
		System.out.println(y.getBalance());

		y.withdraw((12));
		System.out.println(y.getBalance());


	}

}
