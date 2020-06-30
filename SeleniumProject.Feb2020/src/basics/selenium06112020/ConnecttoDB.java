package basics.selenium06112020;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import com.opencsv.CSVWriter;

public class ConnecttoDB {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dvdrental", "postgres",
				"root");
		System.out.println(connection.getAutoCommit() + "  " + "connection was successful");

		Statement st = connection.createStatement(); // before typing the query we have to create a statement so the
														// eclipse could run the query

		ResultSet rs = st.executeQuery("SELECT * FROM customer");
		CSVWriter csvWriter;

		while (rs.next()) { // because a table contains rows and columns so we use while loop to iterate
							// through each row and column
			File file = new File(
					"C:\\Users\\murta\\eclipse-workspace\\SeleniumProject.Feb2020\\testDataOutput\\Demo.csv");
			try {
				FileWriter filewriter = new FileWriter(file);
				csvWriter = new CSVWriter(filewriter);
				csvWriter.writeAll(rs, true);
				csvWriter.close();
			} catch (Exception e) {
				e.printStackTrace();

			}
			connection.close();	//closes the connection
		}

	}
}
