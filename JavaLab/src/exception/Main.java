package exception;

import java.io.FileReader;

public class Main {

	public static void main(String[] args) {

		try {
			int a = 5;
			int b = 0;

			int c = a / b; // unchecked
		} catch (Exception e) {

			System.out.println("This should not be done this way!!");
		}
		
		System.out.println();
	//	FileReader fis = new FileReader("thefile.text");

	}

}
