package project;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char selectedCategory = 'A';
		int selectedOption = 5;
		if (selectedCategory == 'A') {
			if (selectedOption == 1) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000001"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Starbust     24-MB01   $2.20    2     $4.40"
						+ "\n _____________________________________________");
			} else if (selectedOption == 2) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000002"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Baby Ruth     24-MB02  $2.10    1     $2.10"
						+ "\n _____________________________________________");
			} else if (selectedOption == 3) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000003"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n SweetTarts   24-MB03   $2.00    3     $6.00 "
						+ "\n _____________________________________________ ");
			} else if (selectedOption == 4) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000004"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Bit o Honey  24-MB04   $3.00    1     $3.00 "
						+ "\n _____________________________________________");
			} else if (selectedOption == 5) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000005"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Wherther's   24-MB05   $3.00    1     $3.00 \n Original"
						+ "\n _____________________________________________");
			} else {
				System.out.println("Your selection is invalid, please choose a valid option");
			}
		} else if (selectedCategory == 'B') {
			if (selectedOption == 1) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000006"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Gluten-Free   24-MB06   $3.00    1     $3.00 \n Oatmeal Cookie \n Granola Bars"
						+ "\n _____________________________________________");
			} else if (selectedOption == 2) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000007"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Madagascar   24-MB07   $3.00    1     $3.00 \n Vanilla \n Almond and \n Hone Chewy \n Granola Bars"
						+ "\n _____________________________________________");
			} else if (selectedOption == 3) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000008"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Dark         24-MB08   $3.00    1     $3.00 \n Chocolate \n Nutes & Sea \n Salt Bars"
						+ "\n _____________________________________________");
			} else if (selectedOption == 4) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000009"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Apple        24-MB09   $3.00    1     $3.00 \n Cinnamon \n Organic \n Plant-Based \n Bars"
						+ "\n _____________________________________________");
			} else if (selectedOption == 5) {
				System.out.println("\t\t    RECEIPT \n\n Serial:\t#WP0000000000000010"
						+ "\n Date:\t\tWednesday 22 April 2020" + "\n Machine ID:\tVM 203-1" + "\n Time: \t\t12:34PM"
						+ "\n\n ITEM \t\tSKU \tPRICE \tQTY   SUBTOTAL"
						+ "\n ---------------------------------------------"
						+ "\n Acai Berry   24-MB10   $3.00    1     $3.00 \n Chia Bars"
						+ "\n _____________________________________________");
			} else {
				System.out.println("Your selection is invalid, please choose a valid option");
			}
		} else {
			System.out.println("Your selection is invalid, please choose a valid option\"");
		}
	}
}
