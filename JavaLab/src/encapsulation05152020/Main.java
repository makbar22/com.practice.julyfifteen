package encapsulation05152020;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer(50, false);
		System.out.println("Initial page count = " + printer.getPagesPrinted());

		int pagesPrinted = printer.printPages(4);
		System.out.println("pages printed were : " + pagesPrinted + "  " + printer.getPagesPrinted());
	}

}
